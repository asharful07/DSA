
/*     print the pattern :-
                                 * * * * * *
                                 * * * * *
                                 * * * *
                                 * * *
                                 * *
                                 *
 */

package DSA.Pattern_Question;
public class Question_04 {
    public static void main(String[] args) {
    for(int r=1;r<7;r++){
        for(int c=1;c<7-r+1;c++){
            System.out.print(" * ");
        }
        System.out.println();
    }
    }
}
