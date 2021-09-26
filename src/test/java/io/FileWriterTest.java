package io;

import org.junit.jupiter.api.Test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import static java.lang.System.out;
import static java.nio.charset.StandardCharsets.UTF_8;
import static org.assertj.core.api.Assertions.assertThat;

public class FileWriterTest {

    public static final String FILE_NAME = "test.txt";
    public static final String SENTENCE = "Hello World";

    @Test
    void should_write_and_read_in_a_file() {
        try (FileOutputStream fileOutputStream = new FileOutputStream(FILE_NAME);
             FileInputStream fileInputStream = new FileInputStream(FILE_NAME)) {

            fileOutputStream.write(SENTENCE.getBytes(UTF_8));

            int read;
            StringBuilder helloWorld = new StringBuilder();
            while ((read = fileInputStream.read()) != -1) {
                helloWorld.append((char) read);
            }

            assertThat(helloWorld.toString()).isEqualTo(SENTENCE);
        } catch (IOException e) {
            out.println("there is a problem with test.txt file");
            e.printStackTrace();
        }
    }

}
