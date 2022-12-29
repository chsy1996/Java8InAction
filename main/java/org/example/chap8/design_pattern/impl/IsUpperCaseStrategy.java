package org.example.chap8.design_pattern.impl;

import org.example.chap8.design_pattern.ValidationStrategy;

public class IsUpperCaseStrategy implements ValidationStrategy {
    @Override
    public boolean execute(String s) {
        return s.matches("[A-Z]+");
    }
}
