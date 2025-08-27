package StringPracticeLeve1;

import java.util.Scanner;

public class charAr {

    public static char[] customToCharArray(String str) {
        char[] chars = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            chars[i] = str.charAt(i);
        }
        return chars;
    }

    public static boolean compareCharArrays(char[] arr1, char[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }
        return true;
    }

    public static void printCharArray(char[] arr) {
        for (char c : arr) {
            System.out.print(c + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = sc.next();

        char[] customArray = customToCharArray(text);

        char[] builtInArray = text.toCharArray();

        boolean areEqual = compareCharArrays(customArray, builtInArray);

        System.out.print("Custom array: ");
        printCharArray(customArray);

        System.out.print("Built-in array: ");
        printCharArray(builtInArray);

        System.out.println("Both Arrays " + areEqual);

        sc.close();
    }
}
