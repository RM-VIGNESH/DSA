package academy.learnprogramming;

public class MAX_WEALTH {
    public static void main(String[] args) {
        int [][] accounts = {
                {1,2,3},
                {3,2,1}
        };

        System.out.println(maximumWealth(accounts));
    }

    public static int maximumWealth(int[][] accounts){
        // assume ans is min value.
        int ans = Integer.MIN_VALUE;

        // here we consider rows as person and columns as accounts. we are initialising sum with 0 . then create a
        // nested for loop the max value for that column is length of that particular row.
        for (int person = 0; person < accounts.length; person++) {
            // person == row , account == column
            // when we start the new row, it takes a new sum for that row
            int sum = 0;
            for (int account = 0; account < accounts[person].length; account++) {
                sum += accounts[person][account];
            }

            if (sum > ans){
                ans = sum;
            }
        }
        return ans;
    }
}
