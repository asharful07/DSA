
// Write a program to find the 2nd largest element in given array

package DSA.Arrays_Question;
public class Question_02 {
    public static void main(String[] args) {
        int[] array = {20, 30, 70, 80, 50};
        int max = Integer.MIN_VALUE;
        int second_max = Integer.MIN_VALUE;
        for (int k : array) {
            if (k > max) {
                max = k;
            }
        }
        for (int i : array) {
            if (i == max) {
                continue;
            }
            if (i > second_max) {
                second_max = i;
            }
        }
        for(int j:array){
            System.out.print(j+" ");
        }
            System.out.println();
            System.out.println("Maximum number : "+max);
            System.out.println("second Maximum number : "+second_max);
        }
    }