package com.lambo.demo.java.alg;

/**
 * @author ramboy
 */
public class Exp7 {

    public static void main(String[] args) {

        int digital = 0;
        int character = 0;
        int other = 0;
        int blank = 0;

        String str = "Hello World，my age is 28.";

        char[] ch = str.toCharArray();
        for (int i = 0; i < ch.length; i++) {

            if (ch[i] >= '0' && ch[i] <= '9') {
                digital++;
            } else if ((ch[i] >= 'a' && ch[i] <= 'z') || (ch[i] >= 'A' && ch[i] <= 'Z')) {
                character++;
            } else if (ch[i] == ' ') {
                blank++;
            } else {
                other++;
            }
        }

        System.out.println("数字个数: " + digital);
        System.out.println("英文字母个数: " + character);
        System.out.println("空格个数: " + blank);
        System.out.println("其他字符个数:" + other);
    }
}
