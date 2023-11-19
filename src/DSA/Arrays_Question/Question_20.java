

//Print the element of  Even index in given array

package DSA.Arrays_Question;
public class Question_20 {
        public static void main(String[] args) {

            int [] arr = new int [] {10,11,12,13,14};

            System.out.println("Elements of given array present on even position: ");

            for (int i = 1; i < arr.length; i = i+2) {
                System.out.println(arr[i]);
            }
        }
    }
