package academy.learnprogramming;

import com.sun.jdi.PathSearchingVirtualMachine;

public class REVERSE_AN_ARRAY {
    public static void main(String[] args) {
        int [] arr = {1,5,7,4,2,3,9,6};
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
        int x = arr.length-1;
        reverse(arr,0, x);
        System.out.println("reverse array :");
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
    }

    // we are defining array, start, end
    // we have defined start for starting element of an array or index 0 element
    // and end is for the last element or the index of last element
    // we created temporary element temp
    // 1st lets store 1st element of an array in the temp
    // then store the starting element in the end element index so now the 1st element is stored in the last element place
    // now store end element in the temp so that the last element is stored in the 1st element place
    // this process will happen till when start index is less than the ending index.
    static void reverse (int []arr,int start, int end){
        int temp;

        while (start<end){
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    }
}
