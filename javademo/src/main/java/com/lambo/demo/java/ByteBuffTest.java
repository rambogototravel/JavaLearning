package com.lambo.demo.java;

import org.apache.rocketmq.common.UtilAll;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * @author ramboy
 */
public class ByteBuffTest {

    public static void main(String[] args) throws IOException {

//        ByteBuffer b = ByteBuffer.allocate(10);
//        System.out.println(b.position());
//        System.out.println(b.limit());
//        System.out.println(b.capacity());
//
//        b.put((byte) 1);
//        b.putInt(33);
//        System.out.println(b.position());
//        System.out.println(b.limit());
//        System.out.println(b.capacity());
//
//        b.flip();
//        System.out.println(b.get(0));
//        System.out.println(b.getInt());
//        System.out.println(b.position());
//        System.out.println(b.limit());
//        System.out.println(b.capacity());

//        CharBuffer charBuffer = null;
//        ClassLoader classLoader = ByteBuffTest.class.getClassLoader();
//        Path path = Paths.get(classLoader.getResource("cmower.txt").getPath());
//        try (FileChannel fileChannel = FileChannel.open(path)) {
//            MappedByteBuffer mappedByteBuffer = fileChannel.map(FileChannel.MapMode.READ_ONLY, 0, fileChannel.size());
//
//            if (mappedByteBuffer != null) {
//                charBuffer = Charset.forName("UTF-8").decode(mappedByteBuffer);
//            }
//
//            System.out.println(charBuffer.toString());
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

        long createOffset = 0 - (0 % (1024 * 1024 * 1024));
        System.out.println(createOffset);

        System.out.println(UtilAll.offset2FileName(createOffset));
    }
}
