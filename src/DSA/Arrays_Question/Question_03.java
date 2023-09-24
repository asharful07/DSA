
// find the minimum element in a given array.

package DSA.Arrays_Question;
public class Question_03 {
    public static void main(String[] args) {
        int []arr={50,80,60,30,90,10,100};
        int min = Integer.MAX_VALUE;
        System.out.print("Array: ");
        for (int i : arr) {
            if (i < min) {
                min = i;
            }
            System.out.print(i+ " ");
        }
        System.out.println();
        System.out.print("Minimum element is : "+min);
    }
}
