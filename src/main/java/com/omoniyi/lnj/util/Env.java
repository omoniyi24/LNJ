package com.omoniyi.lnj.util;

/**
 * @author OMONIYI ILESANMI
 */
public class Env {

    public static String get(String env) {
        final var value = System.getenv(env);
        if (value == null) {
            throw new IllegalStateException(String.format("environment variable %s is not set", env));
        }
        return value;
    }
}
