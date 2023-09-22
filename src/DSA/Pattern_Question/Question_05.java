
/*  print the pattern:-
                               *  *  *  *  *  *
                               *           *
                               *        *
                               *     *
                               *  *
                               *

 */

package DSA.Pattern_Question;
public class Question_05 {
    public static void main(String[] args) {
        for(int r=1;r<7;r++){
            for(int c=1;c<7-r+1;c++){
                if(r==2 && (c==2 || c==3 || c==4)){
                    System.out.print("   ");
                } else if (r==3 && (c==2 || c==3)) {
                    System.out.print("   ");
                } else if (r==4 && c==2) {
                    System.out.print("   ");

                } else  {
                    System.out.print(" * ");
                }
            }
            System.out.println();
        }
    }
}
