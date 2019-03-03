package DataTypesAndVariablesLab;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RefactorSpecialNumbers12 {
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
/*12. Refactor Special Numbers
You are given a working code that is a solution to Problem 9. Special Numbers. However, the variables are
improperly named, declared before they are needed and some of them are used for multiple things.
Without using your previous solution, modify the code so that it is easy to read and understand.

CODE
Scanner scanner = new Scanner(System.in);
int kolkko = Integer.parseInt(scanner.nextLine());
int obshto = 0;
int takova = 0;
boolean toe = false;
for (int ch = 1; ch &lt;= kolkko; ch++) {
takova = ch;
while (ch &gt; 0) {
obshto += ch % 10;
ch = ch / 10;
}
toe = (obshto == 5) || (obshto == 7) || (obshto == 11);
System.out.printf(&quot;%d -&gt; %b%n&quot;, takova, toe);
obshto = 0;
ch = takova;
}
Hints

 Reduce the span of the variables by declaring them in the moment they receive a value, not before
 Rename your variables to represent their real purpose (example: &quot;toe&quot; should become isSpecialNum, etc.)
 Search for variables that have multiple purpose. If you find any, introduce a new variable*/