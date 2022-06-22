package com.codedifferently.assessment01.part01;

public class StringUtils {
    /**
     * Get all the words in the sentence and return it in a string array
     *
     * @param sentence
     * @return
     */
    public static String[] getWords(String sentence) {

        String[] words = sentence.split("\\s+");
        for (int i = 0; i < words.length; i++) {

            words[i] = words[i].replaceAll("[^\\w]", "");
        }
        return words;
    }

    /**
     * Get the first word in the string
     *
     * @param sentence
     * @return
     */
    public static String getFirstWord(String sentence) {
        String[] words = sentence.split(" ", 2);
        String firstWord = words[0];
        return firstWord;
    }

    /**
     * Grab the first word and reverse it
     *
     * @param sentence
     * @return
     */
    public static String reverseFirstWord(String sentence) {
        String[] words = sentence.split(" ", 2);
        String firstWord = words[0];

        return new StringBuilder(firstWord).reverse().toString();

    }

    /**
     * Grab the first word then camel case it
     *
     * @param sentence
     * @return
     */
    public static String reverseFirstWordThenCamelCase(String sentence) {
        String[] words = sentence.split(" ", 2);
        String firstWord = words[0];

        String str = new StringBuilder(firstWord).reverse().toString();
        String output = str.substring(0, 1).toUpperCase() + str.substring(1).toLowerCase();

        return output;
    }

    /**
     * Remove Character at index
     *
     * @param str
     * @param index
     * @return
     */
    public static String removeCharacterAtIndex(String str, int index) {
        String result = str.substring(0, index) + str.substring(index + 1);
        return result;
    }
}
