package com.java.practice;

/*Define a Java class to solve this problem:<br>
Given a String and a Character, remove all instances of the Character in the String

Solve this two ways:<br>
1. Iterate through the String, one character at a time<br>
2. Find a method in the String class that can solve this in one line<br>

Write methods for each solution.

Afterwards, write a TestNG or JUnit class for each solution which tests these methods.<br>
Include both positive and negative cases for validations.
*/


public class stringClass {
	
   /* public static void main(String[] args) {
        String output = remove("Hello", 'l');
        System.out.println(output);
        
        String replace = replaceAllChar("MISSISSIPPI",'P');
        System.out.println(replace);
    }*/

    public static String remove(String input, char c) {

        if (input == null || input.length() <= 1)
            return input;
        char[] inputArray = input.toCharArray();
        char[] outputArray = new char[inputArray.length];
        int outputArrayIndex = 0;
        for (int i = 0; i < inputArray.length; i++) {
            char p = inputArray[i];
            if (p != c) {
                outputArray[outputArrayIndex] = p;
                outputArrayIndex++;
            }

        }
        return new String(outputArray, 0, outputArrayIndex);

    }
    
    public static String replaceAllChar(String s, char c){
    	String r = String.valueOf(c);
    	return s.replaceAll(r,""); 
         
    }
    
}

