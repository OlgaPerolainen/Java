package Lab5;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Exercise 1. Find the longest word
        String text = "Надо найти самое длинное слово";
        System.out.println(StringMethods.findLongestWord(text));

        // Exercise 2. Check palindrome
        String word = "saippuakivikauppias";
        boolean result = StringMethods.isPalindrome(word);
        System.out.println(result);

        // Exercise 3. Replace words
        String wordToBeReplaced = "бяка";
        String neededWord = "[вырезано цензурой]";
        String censorText = "Бяка, бяка, бяка!";
        censorText = StringMethods.swapSwearWord(censorText, wordToBeReplaced, neededWord);
        System.out.println(censorText);

        // Exercise 4. Count the number of inclusions
        String firstSentence = "Надо найти количество вхождений одной строки (подстроки) в другую строку.";
        String secondSentence = "строк";
        int inclusionAmount = StringMethods.inclusionAmount(firstSentence, secondSentence);
        System.out.println("Second sentence is found in the first one: " + inclusionAmount + " time(s)");

        // Exercise 5. Reverse words in a sentence
        String nonReversed = "Надо написать все слова наоборот";
        System.out.println(StringMethods.reverseWords(nonReversed));
    }
}
