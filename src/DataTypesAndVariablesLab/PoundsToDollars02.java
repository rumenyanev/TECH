package DataTypesAndVariablesLab;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PoundsToDollars02 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
          double pounds = Double.parseDouble(reader.readLine());
          double dollars = pounds * 1.31;
        System.out.printf("%.3f",dollars);
    }
}
/*Write a program that converts British pounds to US dollars formatted to 3th decimal point.
1 British Pound = 1.31 Dollars
Examples
Input    Output
80      104.800
39      51.090*/