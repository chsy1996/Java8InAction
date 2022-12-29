package org.chap8.design_pattern.impl;

import org.chap8.design_pattern.ValidationStrategy;

public class IsLowerCaseStrategy implements ValidationStrategy {
    @Override
    public boolean execute(String s) {
        return s.matches("[a-z]+");
    }
}
