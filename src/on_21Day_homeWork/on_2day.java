package on_21Day_homeWork;

/***
 * 列出你知道的java所有的数据类型，并声明响应的数据类型变量，给变量赋值，通过控制台输出每个变量的值
 */
public class on_2day {
    public static void main(String[] args) {
        byte bValue=127;
        System.out.println(getType(bValue));
        System.out.println(bValue);

        short sValue=14566;
        System.out.println(getType(sValue));
        System.out.println(sValue);

        int iValue=32767;
        System.out.println(getType(iValue));
        System.out.println(iValue);

        long lValue=32768l;
        System.out.println(getType(lValue));
        System.out.println(lValue);

        float fValue=1.58f;
        System.out.println(getType(fValue));
        System.out.println(fValue);

        double dValue=6.666666;
        System.out.println(getType(dValue));
        System.out.println(dValue);

        boolean boolValue=false;
        Object obj=boolValue;
        System.out.println(boolValue);
//        System.out.println(getType(boolValue));
        System.out.println(obj.getClass().getName());

    }

    public static String getType(Object obj){
        return  obj.getClass().getName();
    }
}
