package com.lambo.demo.java.nio;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.SocketChannel;
import java.util.Iterator;
import java.util.Set;

/**
 * @author ramboy
 */
public class TimeClientHandler implements Runnable {

    private String host;

    private int port;

    private Selector selector;

    private SocketChannel socketChannel;

    private volatile boolean stop;

    public TimeClientHandler(String host, int port) {
        this.host = host;
        this.port = port;

        try {
            selector = Selector.open();
            socketChannel = SocketChannel.open();
            socketChannel.configureBlocking(false);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void run() {

        try {
            doConnect();
        } catch (IOException e) {
            e.printStackTrace();
        }

        while (!stop) {
            try {
                selector.select(1000);
                Set<SelectionKey> selectionKeys = selector.selectedKeys();
                Iterator<SelectionKey> it = selectionKeys.iterator();
                SelectionKey key = null;

                while (it.hasNext()) {
                    key = it.next();
                    it.remove();

                    try {
                        handlerInput(key);
                    } catch (Exception e) {

                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }


    private void handlerInput(SelectionKey key) throws IOException {

        if (key.isValid()) {
            SocketChannel sc = (SocketChannel) key.channel();

            if (key.isConnectable()) {

                if (sc.finishConnect()) {
                    sc.register(selector, SelectionKey.OP_READ);
                    doWrite(sc);
                } else {
                    System.exit(1);
                }
            }

            if (key.isReadable()) {
                ByteBuffer bf = ByteBuffer.allocate(1024);
                int readBytes = sc.read(bf);
                if (readBytes > 0) {
                    byte[] bytes = new byte[bf.remaining()];
                    bf.get(bytes);

                    String body = new String(bytes, "UTF-8");
                    System.out.println("Now is :" + body);
                    this.stop = true;
                } else if (readBytes < 0) {

                } else {

                }
            }
        }

    }

    private void doConnect() throws IOException {
        if (socketChannel.connect(new InetSocketAddress(host, port))) {
            socketChannel.register(selector, SelectionKey.OP_READ);
            doWrite(socketChannel);
        } else {
            socketChannel.register(selector, SelectionKey.OP_CONNECT);
        }
    }

    private void doWrite(SocketChannel channel) throws IOException {
        byte[] req = "Query Time Order".getBytes();
        ByteBuffer bf = ByteBuffer.allocate(req.length);
        bf.put(req);
        bf.flip();
        channel.write(bf);

        if (!bf.hasRemaining()) {
            System.out.println("Send Order 2 server succeed.");
        }
    }
}
