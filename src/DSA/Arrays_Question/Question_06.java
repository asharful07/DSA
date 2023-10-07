
// Reverse of a given Array

package DSA.Arrays_Question;
public class Question_06 {
    public static void main(String[] args) {
     int []arr={10,20,30,40,50};
        System.out.print("Given Array: ");

//       using For Each Loop

     for(int j : arr){
         System.out.print(j+" ");
     }
        System.out.println();

//       using For loop

        System.out.print("Reverse Array: ");
     for(int i=arr.length-1;i>=0;i--){
         System.out.print(arr[i]+" ");
     }
        System.out.println();
    }
}
