package char01.sect01;

/**
 * @author gy1zc3@gmail.com
 * Created by zacky on 16:23.
 */
public class Practice13 {
    public static void main(String[] args) {
        int[ ][ ] a={{1,2,3},{4,5,6}};

        int[][] temp = new int[a[0].length][a.length];
        for (int i = 0; i < a[0].length; i++) {
            for (int j = 0; j < a.length; j++) {
                temp[i][j] = a[j][i];
                System.out.print(temp[i][j] + " ");
                if(j == a.length - 1)
                    System.out.print("\n");
            }
        }
    }
}
