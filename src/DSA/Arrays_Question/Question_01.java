
// Write a program to check a maximum number in an array


package DSA.Arrays_Question;
public class Question_01 {
    public static void main(String[] args) {
        int []array = {10, 23,54,33,80};
        int max=0;

        for (int j : array) {
            if (j > max) {
                max = j;
            }
        }
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println(max+" is a maximum element in given array");
    }
}
