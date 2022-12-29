package org.example.part_I.method_reference;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class Apple {

    private int size;

    private String color;

    private int weight;

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
