
//find the Total Even number in Given array

package DSA.Arrays_Question;
public class Question_04 {
    public static void main(String[] args) {
      int []arr={3,4,23,44,45,6,43,33,24,2,1,9,8,77,65};
      int count=0;
        System.out.print("Array: ");
      for(int i : arr){
          if(i%2==0){
              count++;
          }
          System.out.print(i+" ");
      }
        System.out.println();
        System.out.print("The Total Even number is: "+count);

    }
}
