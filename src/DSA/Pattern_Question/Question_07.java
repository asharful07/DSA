
/*  Print the pattern :-
                                               *  *  *  *  *
                                               *        *
                                               *     *
                                               *  *
                                               *

*/

package DSA.Pattern_Question;
public class Question_07 {
    public static void main(String[] args) {
        int n=5;
        for(int r=1;r<=n;r++){
            if(r==1 || r==n){
                for(int i=1;i<=n-r+1;i++){
                    System.out.print(" * ");
                }
                System.out.println();
            }
            else {
                for(int c=1;c<=n-r+1;c++){
                    if(c==1 || c==n-r+1){
                        System.out.print(" * ");
                    }
                    else {
                        System.out.print("   ");
                    }
                }
                System.out.println();
            }
        }
    }
}
