import java.util.Arrays;

/**
 * In this algorithm, it counts how many occurences there are
 * of a certain character, and stores them into an array.
 * 
 */
public class CountingSortMain {
    public static void main(String[] args) {
        //we can take advantage of the numeric value of char types
        //'A' = 65, 'Z' = 90. so charArray[i] - 65
        //in freqArray, 'A' = index 0, 'Z' = index 25
        int range = 26;
        char[] charArray = {'A', 'A', 'Z', 'B', 'H', 'K', 'L', 'Z', 'W', 'X', 'P'};
        int[] freqArray = new int[range];

        //print outcome of countingSort()
        System.out.println("\nSorted array!: " + Arrays.toString(CountingSortCharacters.countingSort(charArray, freqArray, range)));

    }//end main


}//end CountingSortMain


/**
 * This class uses a method to sort an array of 
 * letters or more specifically an array of char 
 * type elements by using counting sort
 */
class CountingSortCharacters {

    static char[] countingSort(char[] charArray, int[] freqArray, int range) {

        //empty out freqArray
        for (int i = 0; i < range; i++) {
            freqArray[i] = 0;
        }


        //count occurences of each letter
        //A = 65, so (A - 65 = index 0) for freqArray
        for (int j = 0; j < charArray.length; j++) {
            freqArray[charArray[j] - 65]++;
        }


        //print freqArray after counting
        System.out.println("Occurences of letters with indexes A = 0 -> Z = 25:");
        System.out.println(Arrays.toString(freqArray));


        //fill array with # of letters less than or equal to k
        for (int k = 1; k < range; k++) {
            freqArray[k] = freqArray[k] + freqArray[k - 1];
        }
        

        //print freqArray after for loop which finds letters <= k
        System.out.println("Occurences of letters less than or equal to k:");
        System.out.println(Arrays.toString(freqArray));


        /**
         * fill out sortedArray by traversing charArray backwards,
         * decrementing freqArray by 1 at the index of which the letter
         * from charArray represented then assign the letter from charArray
         * to sortedArray and the decremented number from freqArray as
         * the index of sortedArray
         * 
         * ex: index 11 of charArray is 'P', so we use (80 - 65 = 15) as 'P's
         * freqArray's index value, then we decrement freqArray at index 15 by 
         * 1 which would give us (7 - 1 = 6), and we basically do 
         * sortedArray[6] = 80 which is assigning index 6 of sortedArray to the 
         * value 80 which is char 'P'
         */
        char[] sortedArray = new char[charArray.length];
        for (int m = charArray.length - 1; m > -1; m--) {
            freqArray[charArray[m] - 65]--;
            sortedArray[freqArray[charArray[m] - 65]] = charArray[m];
        }


        //print freqArray after sorting
        System.out.println("freqArray after sorting into sortedArray: ");
        System.out.println(Arrays.toString(freqArray));


        return sortedArray;
    }//end countingSort


}//end CountingSortCharacters
