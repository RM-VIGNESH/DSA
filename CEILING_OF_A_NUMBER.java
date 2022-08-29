package academy.learnprogramming;

public class CEILING_OF_A_NUMBER {

    // This question is exactly similar to the binary search question....
    // here if we find the target in the array that's our ans if we not able to find that target in our array
    // we need to return the number next greater to the target number... for example arr = 1,4,5,6,7,8
    // if target is 5 but there is  no number like 5 in our array we are supposed to return the next highest
    // number with respective to 5. in this case that is 6. so our ans is 6.
    
    public static void main(String[] args) {
        int []arr = {2,3,5,9,14,16,18};
        int target = 15;
        System.out.println("the answer is : " + ceiling(arr,target));
    }
    static int ceiling ( int [] arr, int target){
        int start = 0, end = arr.length-1;

        while ( start <= end){

            int mid = start + (end -start)/2;

            if(target < arr[mid]){
                end = mid - 1;
            } else if( target > arr[mid]){
                start = mid+1;
            } else {
                return mid;
            }
        }
        return arr[start];
    }

}
