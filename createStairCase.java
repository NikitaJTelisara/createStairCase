
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
    
   /* reverse stair
   public static void reverseStair(int n) {
        int k = 0;
        for (int i = 0;i<n;i++){
            k=0;
            for (int j = i; j <n-1; j++) {
                System.out.print(" ");
                k++;
            }
            while (k < n) {
                System.out.print("#");
                k++;
            }
            System.out.print("\n");
        }
    } 
    o/p
   #
  ##
 ###
#### */
}

/* output

#
##
###
####
#####
######


 */
