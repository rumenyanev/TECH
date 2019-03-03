package DataTypesAndVariablesLab;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConcatNames05 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String one = reader.readLine();
        String two = reader.readLine();
        String x = reader.readLine();

        System.out.println(one+x+two);
    }
}
/*5. Concat Names
Read two names and a delimiter. Print the names joined by the delimiter.
Examples
Input           Output
John            John->Smith
Smith
->

Input           Output
Jan             Jan<->White
White
<->

Input           Output
Linda           Linda=>Terry
Terry
=>
*/