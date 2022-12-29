package org.example.part_I.functional_interface;

import com.google.common.base.Function;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class main {
    public static void main(String[] args) throws IOException {
        // 在函数式接口处使用Lambda表达式
        String readerPrint = processFile(BufferedReader::readLine);
        System.out.println(readerPrint);

        readerPrint = processFile((BufferedReader br) -> br.readLine() + br.readLine());
        System.out.println(readerPrint);

        Function<StringBuilder, String> stringFunction = String::new;
        String dsad = stringFunction.apply(new StringBuilder("dsad"));
        System.out.println(dsad);
    }

    static String processFile(BufferedReaderProcessor processor) throws IOException {
        try (BufferedReader br = new BufferedReader(new FileReader("/Users/chengshuaiyang/IdeaProjects/javastream/src/main/resources/data.txt"))) {
            return processor.process(br);
        }
    }
}
