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

        CountingSortCharacters.countingSort(charArray, freqArray, range);

    }//end main


}//end CountingSortMain

class CountingSortCharacters {

    static int[] countingSort(char[] charArray, int[] freqArray, int range) {

        for (int i = 0; i < range; i++) {
            freqArray[i] = 0;
        }

        for (int j = 1; j < charArray.length; j++) {
            freqArray[charArray[j] - 65]++;
        }

        System.out.println(Arrays.toString(freqArray));

        return freqArray;
    }//end countingSort


}//end CountingSortCharacters
