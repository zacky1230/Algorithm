package char01.sect01;

import java.util.Scanner;

/**
 * @author gy1zc3@gmail.com
 * Created by zacky on 16:14.
 */
public class Practice3 {
    public static void main(String[] args) {
        System.out.println("请输入三个整数");
        Scanner scanner1 = new Scanner(System.in);
        String string1 = scanner1.next();

        Scanner scanner2 = new Scanner(System.in);
        String string2 = scanner2.next();

        Scanner scanner3 = new Scanner(System.in);
        String string3 = scanner3.next();

        Integer number1 = Integer.valueOf(string1);
        Integer number2 = Integer.valueOf(string2);
        Integer number3 = Integer.valueOf(string3);

        if(number1 == number2 && number1 == number3 && number2 == number3) {
            System.out.println("equal");
        } else {
            System.out.println("not equal");
        }
    }
}
