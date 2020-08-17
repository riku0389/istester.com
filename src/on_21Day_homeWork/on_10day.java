package on_21Day_homeWork;

import java.util.Arrays;

/***
 * 字符串2：
 * 1、截取子字符串
 * 1）取从第三个字符开始到最后
 * 2）取第二到第四个字符
 * 2、分割字符串
 */
public class on_10day {
    public static void main(String[] args) {
        testString();
    }

    private static void testString() {
        String str1="QWERasdftgbh12345";
        System.out.println(str1.substring(2));
        System.out.println(str1.substring(1,4));
        System.out.println(Arrays.toString(str1.split("-")));
    }
}

