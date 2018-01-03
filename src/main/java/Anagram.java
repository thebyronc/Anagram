import models.AnagramCompare;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Guest on 1/2/18.
 */

public class Anagram {
    public static void main(String[] args){
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.println("Enter first word to compare:");
            String wordOne = bufferedReader.readLine();
            System.out.println("Enter second word to compare:");
            String wordTwo = bufferedReader.readLine();
            String results = AnagramCompare.wordCompare(wordOne, wordTwo);
            System.out.println(results);
        }   catch (IOException e) {
            e.printStackTrace();
        }

    }
}
