package DataTypesAndVariablesLab;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TownInfo04 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String town = reader.readLine();
        int population = Integer.parseInt(reader.readLine());
        int area = Integer.parseInt(reader.readLine());

        System.out.printf("Town %s has population of %d and area %d square km.",town,population,area);


    }
}
/*4. Town Info
You will be given 3 lines of input. On the first line you will be given the name of the town, on the second – the
population and on the third the area. Use the correct data types and print the result in the following format:
"Town {town name} has population of {population} and area {area} square km";.
Examples
Input          Output
Sofia          Town Sofia has population of 1286383 and area 492 square km.
1286383
492

*/