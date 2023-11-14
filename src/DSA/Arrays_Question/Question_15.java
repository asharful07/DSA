

//Check Two Arrays Are Equal or Not

package DSA.Arrays_Question;
import java.util.Arrays;
public class Question_15 {

        public static void main(String[] args)
        {

            int []a= { 30, 25, 40 };

            int []b = { 30, 25, 40 };

            boolean result = Arrays.equals(a, b);

            if (result) {

                System.out.println("Arrays are equal");
            }
            else {

                System.out.println("Arrays are not equal");
            }
        }
    }
