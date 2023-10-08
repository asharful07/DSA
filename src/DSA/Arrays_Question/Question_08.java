
// insert the element in the End of Array

package DSA.Arrays_Question;
import java.util.Scanner;

public class Question_08 {
    public static void main(String[] args) {
        int[] arr = {5, 10, 15, 20, 25, 30};
        System.out.println("Before insertion Array: ");

//        For Each Loop

        for (int k : arr) {
            System.out.print(k + " ");
        }
        System.out.println();

//        Take user input
        System.out.println("Enter a element you want to insert: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        arr[arr.length -1] = a;

//        For each Loop
        System.out.println("After insertion Array: ");
        for (int j : arr) {
            System.out.print(j + " ");
        }
        System.out.println();
    }
}