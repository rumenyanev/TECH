package DataTypesAndVariablesLab;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CenturiesToMinutes09{
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int centturies = Integer.parseInt(reader.readLine());
        int years = centturies *100;
        int days = (int)(years * 365.2422);
        int hours = days * 24;
        int minutes = hours * 60;
        System.out.printf("%d centuries = %d years = %d days = %d hours = %d minutes",
                centturies,years,days,hours,minutes);
    }
}
/*9. Centuries to Minutes
Write program to enter an integer number of centuries and convert it to years, days, hours and minutes.
Examples
Input        Output
1             1 centuries = 100 years = 36524 days = 876576 hours = 52594560 minutes
5             5 centuries = 500 years = 182621 days = 4382904 hours = 262974240 minutes
Hints
 Use appropriate data type to fit the result after each data conversion.
 Assume that a year has 365.2422 days at average (the Tropical year).
*/