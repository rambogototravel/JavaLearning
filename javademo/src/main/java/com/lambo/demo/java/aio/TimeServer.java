package com.lambo.demo.java.aio;

/**
 * @author ramboy
 */
public class TimeServer {

    public static void main(String[] args) {
        int port = 8080;

        if (null != args && args.length > 0) {
            try {
                port = Integer.valueOf(args[0]);
            } catch (NumberFormatException e) {

            }
        }

        AsyncTimeServerHandler handler = new AsyncTimeServerHandler(port);

        new Thread(handler, "AIO-AsyncTimeServerHandler-001").start();
    }
}
