package DataTypesAndVariablesLab;


import java.util.Scanner;

public class RefactorVolumeOfPyramid11 {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        double lenght = 0.0;
        double width = 0.0;
        double height = 0.0;
        double volume = 0.0;
        System.out.print("Length: ");
        lenght = Double.parseDouble(scanner.nextLine());
        System.out.print("Width: ");
        width = Double.parseDouble(scanner.nextLine());
        System.out.print("Height: ");
        height = Double.parseDouble(scanner.nextLine());
         volume = (lenght * width * height) / 3;
        System.out.printf("Pyramid Volume: %.2f",volume);
    }
}
/*11. Refactor Volume of Pyramid
You are given a working code that finds the volume of a pyramid. However, you should consider that the
variables exceed their optimum span and have improper naming. Also, search for variables that have
multiple purpose.

CODE
Scanner scanner = new Scanner(System.in);
double dul, sh, V = 0;
System.out.print(&quot;Length: &quot;);
dul = Double.parseDouble(scanner.nextLine());
System.out.print(&quot;Width: &quot;);
sh = Double.parseDouble(scanner.nextLine());
System.out.print(&quot;Heigth: &quot;);
V = Double.parseDouble(scanner.nextLine());
V = (dul + sh + V) / 3;
System.out.printf(&quot;Pyramid Volume: %.2f&quot;, V);

Hints
 Reduce the span of the variables by declaring them in the moment they receive a value, not before
 Rename your variables to represent their real purpose (example: &quot;dul&quot; should become length, etc.)
 Search for variables that have multiple purpose. If you find any, introduce a new variable.*/