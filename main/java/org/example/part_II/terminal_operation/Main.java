package org.example.part_II.terminal_operation;

import com.google.common.collect.Lists;

import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = Lists.newArrayList(1,2,3,4);
        Comparator<Integer> dishCaloriesComparator =
                Comparator.comparingInt(Integer::intValue);


        Map<Boolean, List<Integer>> collect = list.stream()
                .collect(Collectors.partitioningBy(integer -> integer > 2));
        System.out.println(collect);
    }
}
