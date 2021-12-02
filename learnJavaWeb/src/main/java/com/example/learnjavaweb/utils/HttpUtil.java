package com.example.learnjavaweb.utils;

import java.io.BufferedReader;
import java.io.IOException;

/**
 * đây là bước chuyển đổi json thành một String
 */
public class HttpUtil {
    private String value;

    public HttpUtil(String value) {
        this.value = value;
    }

    public static HttpUtil of (BufferedReader reader) {
        StringBuilder sb = new StringBuilder();
        try {  //search google key: convert json from buffereader java
            String line;
            while ((line = reader.readLine()) != null) {
                sb.append(line);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());  //check thử
        }
        return new HttpUtil(sb.toString());
    }
}
