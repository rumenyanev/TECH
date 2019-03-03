package DataTypesAndVariablesLab;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CharsToString06 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String one = reader.readLine();
        String two = reader.readLine();
        String three = reader.readLine();

        System.out.printf("%s%s%s",one,two,three);
        }
}
/*6. Chars to String
Write a program that reads 3 lines of input. On each line you get a single character. Combine all the characters into
one string and print it on the console.
Examples
Input       Output
a           abc
b
c

Input       Output
%           %2o
2
o

Input       Output
1            15p
5
p
*/