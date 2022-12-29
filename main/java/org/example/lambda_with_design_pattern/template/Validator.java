package org.example.lambda_with_design_pattern.template;

import org.example.lambda_with_design_pattern.template.impl.IsNumeric;
import org.example.lambda_with_design_pattern.template.impl.IsLowerCaseStrategy;
import org.example.lambda_with_design_pattern.template.impl.IsUpperCaseStrategy;

public class Validator {
    public static void main(String[] args) {
        String str = "4215";
        System.out.println(validate(str, new IsNumeric()));
        System.out.println(validate(str, new IsLowerCaseStrategy()));
        System.out.println(validate(str, new IsUpperCaseStrategy()));

        System.out.println(validate(str, s -> s.matches("\\d+")));
        System.out.println(validate(str, s -> s.matches("[a-z]+")));
        System.out.println(validate(str, s -> s.matches("[A-Z]+")));
    }



    private static boolean validate(String s, ValidationStrategy strategy) {
        return strategy.execute(s);
    }
}
