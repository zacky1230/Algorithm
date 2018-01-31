package Test;


public class TestWeiYunSuan {
    public static void main(String[] args) {
        int number = 10;
        printInfo(number);
        number = number << 1;
        printInfo(number);
        number = number >> 1;
        printInfo(number);
        number = (number >>> 1);
        printInfo(number);
        printInfo(1 << 4);
    }

    private static void printInfo(int number) {
        System.out.println(Integer.toBinaryString(number));
    }
}
