/*

print the pattern :

    1
   1 1
  1 2 1
 1 3 3 1


 */

package DSA.Pattern_Question;
public class Question_11 {
        public static void printPascal(int n)
        {
            for (int i = 1; i <= n; i++) {
                for (int j = 0; j <= n - i; j++) {

                    System.out.print(" ");
                }

                int x = 1;
                for (int k = 1; k <= i; k++) {

                    System.out.print(x + " ");
                    x = x * (i - k) / k;
                }
                System.out.println();
            }
        }

        public static void main(String[] args)
        {
            int n = 4;
            printPascal(n);
        }
    }
