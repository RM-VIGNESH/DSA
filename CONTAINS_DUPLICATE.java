package academy.learnprogramming;

public class CONTAINS_DUPLICATE {
    public static void main(String[] args) {
        int [] arr = {1,3,4,2,5,2,4,3,9};
        duplicate(arr);
    }

    static void duplicate(int [] arr){
        System.out.println("The duplicated elements are :");
        for (int i = 1; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i]== arr[j]){
                    System.out.println(arr[j]);
                }
            }
        }
    }
}
