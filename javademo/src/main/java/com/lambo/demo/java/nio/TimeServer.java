package com.lambo.demo.java.nio;

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

        MutiplexerTimeServer timeServer = new MutiplexerTimeServer(port);

        new Thread(timeServer, "NIO-MultiplexerTimeServer-001").start();
    }
}
