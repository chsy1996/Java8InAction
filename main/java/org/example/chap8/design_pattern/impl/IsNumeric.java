package org.example.chap8.design_pattern.impl;

import org.example.chap8.design_pattern.ValidationStrategy;

public class IsNumeric implements ValidationStrategy {
    @Override
    public boolean execute(String s) {
        return s.matches("\\d+");
    }
}
