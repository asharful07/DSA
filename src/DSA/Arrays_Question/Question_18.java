

// Print the two array for odd element and Even element

package DSA.Arrays_Question;
import java.util.*;
public class Question_18 {

        public static void main (String[]args){
            Scanner sc = new Scanner (System.in);

            //taking array size and array element as input

            System.out.println ("Enter the size of array1: ");
            int size = sc.nextInt ();
            int j=0, k=0;
            int[] arr = new int[size];
            int[] evenArr = new int[size];
            int[] oddArr = new int[size];
            for (int i = 0; i < size; i++){
                System.out.print ("Please give value for index " + i + " : ");
                arr[i] = sc.nextInt ();
            }

            //Logic to store even number in even array
            //And odd element to odd array

            for (int i = 0; i < size; i++){
                if(arr[i]%2==0){
                    evenArr[j] = arr[i];
                    j++;
                }
                else{
                    oddArr[k] = arr[i];
                    k++;
                }
            }
            System.out.print("The Even elements of array are : ");
            for (int i = 0; i < j; i++){
                System.out.print(evenArr[i]+" ");
            }
            System.out.println();
            System.out.print("The Odd elements of array are : ");
            for (int i = 0; i < k; i++){
                System.out.print(oddArr[i]+" ");
            }
        }
    }

