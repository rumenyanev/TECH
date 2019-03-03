package DataTypesAndVariablesLab;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConvertMetersToKilometers01 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int meters = Integer.parseInt(reader.readLine());
        double kilometers = meters / 1000d;// d->literal za double

        System.out.printf("%.2f", kilometers);

    }
}
/*You will be given an integer that will be distance in meters. Write a program that converts meters to kilometers
formatted to the second decimal point.
Examples
Input    Output
1852      1.85
798       0.80  */