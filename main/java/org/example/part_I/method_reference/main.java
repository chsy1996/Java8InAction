package org.example.part_I.method_reference;

import com.google.common.collect.Lists;

import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.function.Predicate;

public class main {
    public static void main(String[] args) {
        List<Apple> inventory = Lists.newArrayList();
        inventory.add(Apple.builder().color("red").size(1).weight(7).build());
        inventory.add(Apple.builder().color("red").size(2).weight(4).build());
        inventory.add(Apple.builder().color("red").size(3).weight(5).build());
        inventory.add(Apple.builder().color("red").size(4).weight(6).build());
        inventory.add(Apple.builder().color("red").size(5).weight(3).build());
        inventory.add(Apple.builder().color("red").size(6).weight(2).build());
        inventory.add(Apple.builder().color("red").size(7).weight(1).build());

        // 1.匿名内部类
        inventory.sort(new Comparator<Apple>() {
            @Override
            public int compare(Apple o1, Apple o2) {
                return o1.getSize() - o2.getSize();
            }
        });
        System.out.println(inventory.toString());

        // 2. Lambda表达式
        inventory.sort(((o1, o2) -> o2.getSize() - o1.getSize()));
        System.out.println(inventory.toString());

        // 3. 方法引用
        inventory.sort(Comparator.comparingInt(Apple::getWeight));
        System.out.println(inventory.toString());


        // 复合Lambda
        Predicate<Apple> redApple = apple -> Objects.equals(apple.getColor(), "red");
        Predicate<Apple> notRedApple = redApple.negate();
        Predicate<Apple> notReadAndHeavyApple = notRedApple.and((Apple a) -> {
            return a.getWeight() > 5;
        });
    }
}
