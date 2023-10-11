

// Find the index of negative element

package DSA.Arrays_Question;
public class Question_09 {
    public static void main(String[] args) {
        int []arr = {10,20,30,40,-50,60,70};
        int index = 0;
        for(int i = 1;i< arr.length-1;i++){
            if(arr[i]<0){
                index=i;
            }
        }
        System.out.println("The negative element at index: "+index);

    }
}
