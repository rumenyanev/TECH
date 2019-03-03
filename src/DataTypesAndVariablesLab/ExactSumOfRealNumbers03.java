package DataTypesAndVariablesLab;

import java.util.Scanner;
import java.math.BigDecimal;

public class ExactSumOfRealNumbers03{
    public static void main( String[] args ){
        Scanner scan = new Scanner( System.in );

        int n = Integer.parseInt( scan.nextLine() );

        BigDecimal result  = new BigDecimal( "0" );

        for( int i = 1; i <= n; i++ )
        {
            BigDecimal num  = new BigDecimal( scan.nextLine() );
            result = result.add(num);
        }

        System.out.println(result);
    }
}
/*Write program to enter n numbers and calculate and print their exact sum (without rounding).
Examples
Input                        Output
3                            1000000000000000015
1000000000000000000
5
10


Input                        Output
2                            333333333333.30000000003
0.00000000003
333333333333.3

*/