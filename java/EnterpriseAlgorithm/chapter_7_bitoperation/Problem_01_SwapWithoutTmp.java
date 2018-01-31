package EnterpriseAlgorithm.chapter_7_bitoperation;

/**
 * 两数字交换
 */
public class Problem_01_SwapWithoutTmp {

    public static void main(String[] args) {
        int a = 16;
        int b = 111;
        System.out.println(a);
        System.out.println(b);
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println(a);
        System.out.println(b);

        int x = 5, y = 10; //定义两个变量
        x = x + y;        //x(15) = 5 + 10；
        y = x - y;        //y(5) = x(15) - 10;
        x = x - y;        //x(10) = x(15) - y(5)
        System.out.println("x=" + x + "y=" + y);
    }

}
