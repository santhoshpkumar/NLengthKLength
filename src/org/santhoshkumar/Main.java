package org.santhoshkumar;

public class Main {
    static int count = 0;
    public static void main(String[] args) {
        solve2("SAN", "", 2);
        //solve("SAN","",2);
        System.out.println(count);
    }

    //The unique aspect of this recursion is that it can work for both K greater and smaller than N
    public static void solve(String characters, String pattern, int index){
        if(index == 0){
            System.out.println(pattern);
            count++;
            return;
        }

        for(char character: characters.toCharArray()){
            solve(characters, pattern + character, index-1);
        }

    }

    // this will not consider the duplication as long as K < N
    public static void solve2(String characters, String pattern, int index){
        if(index == 0){
            System.out.println(pattern);
            count++;
            return;
        }

        for(char character: characters.toCharArray()){
            char[] newCharacters = new char[characters.length()-1];
            int charCount = 0;
            for (char eachChar: characters.toCharArray()){
                if (eachChar != character){
                    newCharacters[charCount++] = eachChar;
                }
            }
            solve(new String(newCharacters), pattern + character, index-1);
        }

    }

}