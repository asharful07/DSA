

// Find the Negative Element in Given Array

package DSA.Arrays_Question;
public class Question_05 {
    public static void main(String[] args) {
        System.out.print("Array: ");
        int []arr={-34,3,45,-9,-45,9,-66,-91};
        int count=0;
        for(int i : arr){
            if(i < 0){
                count++;
            }
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.print("Total Negative Element is: "+count);
    }
}
