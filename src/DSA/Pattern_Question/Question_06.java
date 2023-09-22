
/*        print the pattern :-
                                      *
                                     * *
                                    * * *
                                   * * * *
                                  * * * * *
                                 * * * * * *
 */

package DSA.Pattern_Question;
import java.util.Scanner;
public class Question_06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Row and column : ");
        int n = sc.nextInt();
        for(int r=1;r<n;r++){
            for(int c=1;c<=n-r;c++){
                System.out.print("  ");
            }
            for(int m=1;m<=r; m++){
                System.out.print(" *  ");
            }
            System.out.println();
        }
    }
}
