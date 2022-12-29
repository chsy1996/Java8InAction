package org.example.part_I.functional_interface;

import java.io.BufferedReader;
import java.io.IOException;

/**
 * 函数式接口
 */
@FunctionalInterface
public interface BufferedReaderProcessor {
    String process(BufferedReader br) throws IOException;
}
