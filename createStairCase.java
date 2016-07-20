/**
 * Created with IntelliJ IDEA.
 * Date: 7/19/16
 * Time: 9:33 PM
 * To change this template use File | Settings | File Templates.
 */

import java.util.ArrayList;
import java.util.Stack;

public class createStairCase {

    public static void main(String[] args) {
        createStairCase(6);
    }

    public static void createStairCase(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("#");
            }
            System.out.print("\n");
        }
    }
}

/* output

#
##
###
####
#####
######


 */
