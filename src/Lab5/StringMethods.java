package Lab5;

public class StringMethods {

    // Ex1
    public static String findLongestWord(String text) {
        String[] line = text.split(" ");

        int startLength = 0;
        String longestWord = "";
        for (String oneWord : line) {
            if (oneWord.length() > startLength) {
                startLength = oneWord.length();
                longestWord = oneWord;
            }
        }
        return longestWord;
    }

    // Ex2
    public static boolean isPalindrome(String word) {
        return word.equalsIgnoreCase(new StringBuilder(word).reverse().toString());
    }

    // Ex3
    public static String swapSwearWord(String text, String swearWord, String censorWord) {
        return text.toLowerCase().replaceAll(swearWord, censorWord);
    }

    // Ex4
    public static int inclusionAmount(String sentence, String inclusion) {
        int sentenceLength = sentence.length();
        int inclusionLength = inclusion.length();
        int newSentenceLength = sentence.replaceAll(inclusion, "").length();

        return (sentenceLength - newSentenceLength) / inclusionLength;
    }

    // Ex5
    public static String reverseWords(String sentence) {
        StringBuilder resultSentence = new StringBuilder();
        String[] sentenceArray = sentence.split(" ");

        for (String word : sentenceArray) {
            StringBuilder reversedWord = new StringBuilder(word);
            reversedWord.reverse();
            if (!word.equals(sentenceArray[sentenceArray.length - 1])) {
                resultSentence.append(reversedWord).append(" ");
            } else {
                resultSentence.append(reversedWord);
            }
        }
        return resultSentence.toString();
    }
}
