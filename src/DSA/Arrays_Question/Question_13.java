package DSA.Arrays_Question;
public class Question_13 {

        public static void main(String[] args) {
            int[] my_array = {1,1,2,3,4,4,5,5,6,7,7,8,8,9};

            for (int i = 0; i < my_array.length-1; i++) {
                for (int j = i+1; j < my_array.length; j++) {

                    if ((my_array[i] == my_array[j]) && (i != j)) {

                        System.out.println("Duplicate Element : " + my_array[j]);
                    }
                }
            }
        }
    }
