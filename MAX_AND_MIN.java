package academy.learnprogramming;

import java.util.Scanner;

public class MAX_AND_MIN {

    public static void main(String[] args) {
        int [] arr = {2,1,8,6,9,5,7};
        System.out.println("max element in the array is : " + Max(arr));
        System.out.println("min element in the array is : " + Min(arr));

    }

    // to find max
    // assuming arr[0] to be max and compare with the next elements in the arrays
    // use for loop for increment index values in the array we are initialised wit i=1 since we assumed index 0 as max
    // if any element is greater than the element which we assumed then it will become the max element
    static int Max (int []arr){
        if (arr.length==0){
            return -1;
        }
        int maxvalue = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i]>maxvalue){
                maxvalue = arr[i];
            }
        }
        return maxvalue;
    }

    // as same as previous here we are assuming index 1 as min value
    // using for loop.. here i is initialized with 0 in for loop since we assumed arr index 1 as min
    // if arr of 1 is minimum than the min value which is nothing but the arr index 1
    // return the min value
    static int Min (int []arr){
        if(arr.length == 0){
            return -1;
        }
        int minvalue = arr[1];
        for (int i =0; i < arr.length; i++) {
            if (arr[i]<minvalue){
                minvalue = arr[i];
            }
        }
        return minvalue;
    }
}
