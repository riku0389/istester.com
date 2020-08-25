package on_21Day_homeWork;

import java.io.*;

/***
 *1、打开本地一个文件，并把文件内容打印出来
 * 2、复制一个文件到另一个文件，并打印出文件内容
 */

public class on_13day {
    public static void main(String[] args) throws Exception {
        localFileread();

    }

    private static void localFileread() throws Exception {
        File newFile = new File(on_12day.class.getResource("test1").getFile());
        FileReader fileReader = new FileReader(newFile);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String str;
        while ((str = bufferedReader.readLine()) != null) {
            System.out.println(str);
        }
        bufferedReader.close();
    }
}
