package io;

import org.junit.jupiter.api.Test;

import java.io.FileOutputStream;
import java.io.IOException;

import static java.nio.charset.StandardCharsets.UTF_8;

public class FileWriterTest {
    @Test
    void should_write_in_a_file() {
        try (FileOutputStream fileOutputStream = new FileOutputStream("test.txt")) {
            fileOutputStream.write("Hello World".getBytes(UTF_8));
        } catch (IOException e) {
            System.out.println("there is a problem with test.txt file");
            e.printStackTrace();
        }
    }
}
