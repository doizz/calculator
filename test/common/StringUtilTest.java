package common;

import static org.junit.jupiter.api.Assertions.*;

public class StringUtilTest {

    public static void isNull(String inputValue) {
        if (inputValue.trim().isEmpty()) {
            throw new IllegalArgumentException();
        }
    }

}