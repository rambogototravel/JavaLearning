package com.lambo.demo.java.aio;

/**
 * @author ramboy
 */
public class TimeClient {

    public static void main(String[] args) {

        int port = 8080;

        if (null != args && args.length > 0) {
            try {
                port = Integer.valueOf(args[0]);
            } catch (NumberFormatException e) {

            }
        }

        new Thread(new AsyncTimeClientHandler("127.0.0.1", port)).start();
    }
}
