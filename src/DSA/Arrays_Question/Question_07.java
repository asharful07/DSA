

// Find the sum of all element in Given array

package DSA.Arrays_Question;
public class Question_07 {
    public static void main(String[] args) {
        int[] arr = {10, 5, 15, 20, 25, 5, 20};
        int sum = 0;
        System.out.print("Given Array: ");
        for(int i : arr){
            sum=sum+i;
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.print("The sum of all element in Given Array is : "+sum);


    }
}