package academy.learnprogramming;

public class MAX_SUBARRAY {
    public static void main(String[] args) {
        int [] a = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println("Max contagious sum is " + maxsubarray(a));
    }
    static int maxsubarray(int[]a){
        int size = a.length;
        int max_so_far = a[0];
        int sum = 0;

        for (int i = 0; i < size; i++) {
            sum = sum + a[i];

            if (sum < 0){
                sum=0;
            }else if (max_so_far < sum){
                max_so_far = sum;
            }
        }
        return max_so_far;
    }
}
