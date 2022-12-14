package academy.learnprogramming;

public class SMALLEST_NUMBER {
    
    // here the concept is just same like the binary search code just search for letters and return the next greatest letter
    public static void main(String[] args) {
       char [] letters = {'c','f','j'};
       char target = 'c';
        System.out.println("the output is : " + nextGreatestLetter(letters,target));
    }

    public static char nextGreatestLetter(char[] letters, char target){
        int start = 0, end = letters.length-1;

        while ( start <= end){

            int mid = start + (end -start)/2;

            if(target < letters[mid]){
                end = mid - 1;
            } else{
                start = mid+1;
            }
        }
        return letters[start % letters.length];
    }
}
