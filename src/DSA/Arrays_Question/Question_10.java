

//Java Program to merge two arrays


package DSA.Arrays_Question;
import java.util.*;
public class Question_10 {
        public static void main (String[]args){
            Scanner sc = new Scanner (System.in);

            //taking array size and array element as input for array1

            System.out.println ("Enter the size of array1: ");
            int size1 = sc.nextInt ();
            int []arr1 = new int[size1];
            for (int i = 0; i < size1; i++){
                System.out.print ("Please give value for index " + i + " : ");
                arr1[i] = sc.nextInt ();
            }

            //taking array size and array element as input for array1
            System.out.println ("Enter the size of array2: ");
            int size2 = sc.nextInt ();
            int arr2[] = new int[size2];
            for (int i = 0; i < size2; i++){
                System.out.print ("Please give value for index " + i + " : ");
                arr2[i] = sc.nextInt ();
            }

            //logic to merge two array
            //we are using arraycopy function
            int size3 = size1+size2;
            int resultArr[] = new int[size3];
            System.arraycopy(arr1, 0, resultArr, 0, size1);
            System.arraycopy(arr2, 0, resultArr, size1, size2);
            System.out.print ("Array after merging two array: "+Arrays.toString(resultArr));
        }
    }

