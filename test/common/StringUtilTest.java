package common;

public class StringUtilTest {

    public static void isNull(String inputValue) {
        //isBlank() -> java 11
        if (inputValue.trim().isEmpty()) {
            throw new IllegalArgumentException();
        }
    }

}