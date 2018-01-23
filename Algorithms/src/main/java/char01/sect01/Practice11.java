package char01.sect01;

import java.util.Locale;

/**
 * @author gy1zc3@gmail.com
 * Created by zacky on 16:22.
 */
public class Practice11 {
    private static void printout(boolean[][] a1){
        for (int i = 0; i < a1.length; i++) {
            for (int j = 0; j < a1[i].length; j++) {
                if (a1[i][j]){
                    System.out.println(String.format(Locale.CHINA,"%d  %d *",i+1,j+1));
                } else {
                    System.out.println(String.format(Locale.CHINA,"%d  %d /",i+1,j+1));
                }
            }
        }
    }
}
