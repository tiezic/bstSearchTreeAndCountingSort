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
        System.out.println("Sorted array!: " + Arrays.toString(CountingSortCharacters.countingSort(charArray, freqArray, range)));

    }//end main


}//end CountingSortMain


class CountingSortCharacters {

    static char[] countingSort(char[] charArray, int[] freqArray, int range) {

        for (int i = 0; i < range; i++) {
            freqArray[i] = 0;
        }


        freqArray[charArray[0] - 65]++; //for index 0
        for (int j = 1; j < charArray.length; j++) {
            freqArray[charArray[j] - 65]++;
        }


        //print after count
        System.out.println("Occurences of letters with indexes A = 0 -> Z = 25:");
        System.out.println(Arrays.toString(freqArray));


        for (int k = 1; k < range; k++) {
            freqArray[k] = freqArray[k] + freqArray[k - 1];
        }
        

        System.out.println("Occurences of letters with indexes A = 0 -> Z = 25:");
        System.out.println(Arrays.toString(freqArray));


        char[] sortedArray = new char[charArray.length];
        for (int m = charArray.length - 1; m > -1; m--) {
            freqArray[charArray[m] - 65]--;
            sortedArray[freqArray[charArray[m] - 65]] = charArray[m];
        }


        return sortedArray;
    }//end countingSort


}//end CountingSortCharacters
