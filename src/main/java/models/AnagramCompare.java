package models;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
/**
 * Created by Guest on 1/2/18.
 */
public class AnagramCompare {
    public static String wordCompare(String firstWord, String secondWord){
        String[] firstArray = firstWord.split(" ");
        String[] secondArray = secondWord.split(" ");
        Map<Integer, String> firstWordHashMap = new HashMap();
        Map<Integer, String> secondWordHashMap = new HashMap();
        String output = "";
        for (int index = 0; index < firstArray.length; index++) {
            String wordOne = firstArray[index];
            String[] orgOne = wordOne.split("");
            Arrays.sort(orgOne);
            firstWordHashMap.put(index, String.join(",", orgOne));
        }
        for (int index = 0; index < secondArray.length; index++) {
            String wordTwo = secondArray[index];
            String[] orgTwo = wordTwo.split("");
            Arrays.sort(orgTwo);
            secondWordHashMap.put(index, String.join(",", orgTwo));
        }
        for (int j = 0; j < firstWordHashMap.size(); j++) {
            for (int b = 0; b < secondWordHashMap.size(); b++){
                if(firstWordHashMap.get(j).equals(secondWordHashMap.get(b))) {
                    output = output + " " + String.join(",", firstArray[j]);
                } else {}
            }
        }

        return output;
    }

}
