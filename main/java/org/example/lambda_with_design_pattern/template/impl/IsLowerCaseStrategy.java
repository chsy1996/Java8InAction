package org.example.lambda_with_design_pattern.template.impl;

import org.example.lambda_with_design_pattern.template.ValidationStrategy;

public class IsLowerCaseStrategy implements ValidationStrategy {
    @Override
    public boolean execute(String s) {
        return s.matches("[a-z]+");
    }
}
