package char01.sect01;

/**
 * @author gy1zc3@gmail.com
 * Created by zacky on 16:30.
 */
public class Practice14 {
    public static void main(String[] args) {
        System.out.println(lg(100));
    }
    private static int lg(int N) {
        int product = 1;
        int x = -1;
        while (product <= N) //*，把等于的情况也纳入进来，从而避免了在如23>5这种情况的自增导致输出结果为3的情况
        {
            product *= 2;
            x++;
        }
        return x;
    }
}
