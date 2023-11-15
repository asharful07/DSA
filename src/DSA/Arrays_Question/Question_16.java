
//Print Odd and Even element in Given Number

package DSA.Arrays_Question;
public class Question_16 {
        public static void main(String []args){
            int []a={1,2,5,6,3,2,2};
            System.out.println("Odd Numbers:");
            for (int j : a) {
                if (j % 2 != 0) {
                    System.out.print(" "+j);
                }
            }
            System.out.println();
            System.out.println("Even Numbers:");
            for (int j : a) {
                if (j % 2 == 0) {
                    System.out.print(" "+j);
                }
            }
        }}
