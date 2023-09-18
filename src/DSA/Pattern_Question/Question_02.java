
/*       print Pattern           *  *  *  *  *
                                 *           *
                                 *  *  *  *  *
 */


package DSA.Pattern_Question;
public class Question_02 {
    public static void main(String[] args) {
        for(int r=1;r<4;r++){
            for(int c=1;c<6;c++){
                if(r==2 && (c==2 || c==3 || c==4)){
                    System.out.print("   ");
                }
                else {
                    System.out.print(" * ");
                }
            }
            System.out.println();
        }
    }
}
