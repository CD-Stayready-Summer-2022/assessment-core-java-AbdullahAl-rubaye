package com.codedifferently.assessment01.part01;

public class BasicStringUtils {
    /**
     * Remove Uppercase the first letter in each word, then remove all spaces
     *
     * Example
     * camelCase("the quick brown fox") should return "TheQuickBrownFox"
     * camelCase("wutang is for the children") should return "WutangIsForTheChildren"
     * @param str
     * @return
     */
    public static String camelCase(String str){


        return str.substring(0, 1).toUpperCase() + str.substring(1);
    }

        // return our output string







    /**
     * Reverse the string
     * reverse("the quick brown fox") should return "xof nworb kciuq eht"
     * reverse("wutang is for the children") should return "nerdlihc eht rof si gnatuw"
     * @param str
     * @return
     */
    public static String reverse(String str){
        return new StringBuilder(str).reverse().toString();

    }

    /**
     * Camel case the first letter of every word, then reverse the string and remove all spaces
     * camelCaseThenReverse("the quick brown fox") should return XofNworbKciuqEht
     * camelCaseThenReverse("wutang is for the children") should return NerdlihcEhtRofSiGnatuw
     * @param str
     * @return
     */
    public static String reverseThenCamelCase(String str){
        StringBuilder sb = new StringBuilder();
        String words = String.valueOf(str.split(" ", 2));
        String recCamWord = words;
        String Nstr = new StringBuilder(String.valueOf(recCamWord)).reverse().toString();
        String output = str.substring(0, 1).toUpperCase() + str.substring(1).toLowerCase();

        // return our output string
        return Nstr;

    }

    public static String removeFirstAndLastCharacter(String str){
        return str.substring(1, str.length() - 1);
    }
}
