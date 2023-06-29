package org.example.utils;

import java.util.concurrent.ThreadLocalRandom;

public class DataUtils {

    public static String generateEmail() {
        return generateRandomIntegers() + "@mail.com";
    }
    public static String generateRandomIntegers() {
        return String.valueOf(ThreadLocalRandom.current().nextInt());
    }
}
