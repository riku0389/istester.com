package on_21Day_homeWork;

/***
 * 字符串3：
 * 1、字符串的替换
 * 2、字符串的查找
 */
public class on_11day {
    public static void main(String[] args) {
        replaceString();

    }

    private static void replaceString() {
        String oldStr1="QWERdfgh123456YUIOPQR";
        System.out.println("变化之前："+oldStr1);
        System.out.println("变化之后：");
        System.out.println(oldStr1.replace("123","vbn"));
        System.out.println(oldStr1.indexOf("1"));//查找字符出现的位置，从0开始
        System.out.println(oldStr1.indexOf("R",0));//查找字符出现的位置，指定开始索引
        System.out.println(oldStr1.lastIndexOf("Q"));//最后一次出现的位置



    }
}


