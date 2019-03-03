package DataTypesAndVariablesLab;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReversedChars07 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String one = reader.readLine();
        String two = reader.readLine();
        String three = reader.readLine();

        System.out.printf("%s %s %s",three,two,one);
    }
}
/*7. Reversed Chars
Write a program that takes 3 lines of characters and prints them in reversed order with a space between them.
Examples
Input    Output
A        C B A
B
C


Input    Output
1         & L 1
L
&

*/