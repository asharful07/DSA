
/*    print the pattern :-
                                         *
                                         * *
                                         * * *
                                         * * * *
                                         * * * * *
                                         * * * * * *
 */

package DSA.Pattern_Question;
public class Question_03 {
    public static void main(String[] args) {
        for(int r=1;r<7;r++){
            for(int c=1;c<=r;c++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
