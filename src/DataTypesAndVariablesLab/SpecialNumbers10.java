package DataTypesAndVariablesLab;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SpecialNumbers10 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(reader.readLine());

        for (int i = 1; i <= num; i++) {
            int sumOfDigits = 0;
            int number = i;
            while (number > 0) {
                sumOfDigits += number % 10;
                number = number / 10;
            }
            if (sumOfDigits == 5 || sumOfDigits == 7 || sumOfDigits == 11) {
                System.out.printf("%d -> True%n ", i);
            }else{
                System.out.printf("%d -> False%n",i);
            }
        }
    }
}


/*10. Special Numbers
A number is special when its sum of digits is 5, 7 or 11.
Write a program to read an integer n and for all numbers in the range 1…n to print the number and if it is
special or not (True / False).
Examples
Input    Output
15       1 -> False
         2 -> False
         3 -> False
         4 -> False
         5 -> True
         6 -> False
         7 -> True
         8 -> False
         9 -> False
         10 -> False
         11 -> False
         12 -> False
         13 -> False
         14 -> True
         15 -> False
                           Hints
To calculate the sum of digits of given number num, you might repeat the following: sum the last digit (num % 10)
and remove it (sum = sum / 10) until num reaches 0.          */