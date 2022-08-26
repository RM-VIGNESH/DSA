package academy.learnprogramming;

public class EVEN_DIGITS {
    // driver code....
    public static void main(String[] args) {
        int[] nums ={12,345,2,6,7896};
        System.out.println(findNumbers(nums));
    }

    // create a for loop to check how many numbers are there with  even digits
    static int findNumbers(int[] nums){
        int count = 0;
        for(int num : nums) {
            if (even(num)){
                count++;
            }
        }
        return count;
    }

    // to check the number is even in digits
    static boolean even(int num) {
        int numberofdigits = digits(num);
        
        // if the num is even then it will div by 2, and it supposed to give 0 as remainder
        if (numberofdigits % 2 == 0) {
            return true;
        }
        return false;
    }

    // to find total number of digits
    static int digits(int num){
        if(num<0){
            num = num*-1;
        }

        // we may also have single digit number in that case the num which is equal to 0 have 1 digit
        if (num == 0) {
            return 1;
        }

        int count = 0;

        // here we are dividing each number by 10 and we are checking how many digits are there in that number
        // for example if u take 189 we are dividing it by 10 now we will get 18 then again by 10 since it is greater
        // than 0. now it will be 8 now again by 10 and here the loop will end by giving count as 3.
        while(num>0){
            count++;
            num = num / 10;
        }

        return count;
    }
}
