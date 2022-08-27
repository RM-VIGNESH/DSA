package academy.learnprogramming;

// basic binary search code to understand how it works...
public class BINARYSEARCH {

    public static void main(String[] args) {
        int [] arr = {-18, -12, -4, 0, 2, 3, 4, 15, 16, 18, 22, 45, 89};
        int[] arr2 = {99, 80, 75, 22, 11, 10, 5, 2, -3};
        int target = -4;
        int target2 = 22;
        int finalans = binarysearch(arr,target);
        int finalans2 = orderAgnostic(arr2,target2);
        System.out.println("ANSWER FOR ARR IN ASCENDING ORDER :" + finalans);
        System.out.println("-------------------------------------");
        System.out.println("ANSWER FOR ARR IN DESCENDING ORDER :" + finalans2);
    }

    static int binarysearch ( int [] arr, int target){
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

        return -1;
    }

    // here in this type of questions we don't know about the array whether it is sorted or not so here we are finding
    // whether the array is an ascending or a descending array before we are trying to find our target element.
    // for finding that we are going to compare 1st element with the last one... if 1st one is greater than the last
    // then the order is descending else it is ascending one.
    static int orderAgnostic(int[]arr2, int target2){
        int start = 0;
        int end = arr2.length - 1;

        boolean isAsc = arr2[start] < arr2[end];

        while (start <= end){

            int mid = start + (end -start)/2;

            if (arr2[mid] == target2){
                return mid;
            }

            if (isAsc){
                if(target2 < arr2[mid]){
                    end = mid -1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (target2 > arr2[mid]){
                    end = mid -1;
                } else {
                    start = mid+1;
                }
            }
        }
        return -1;
    }
}
