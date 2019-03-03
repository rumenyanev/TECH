package DataTypesAndVariablesLab;

public class demoStringFormat {
    public static void main(String[] args) {
        String a = "%.2f %d %s";
        String asd = String.format(a,10.2547,"Asd");
        System.out.println(asd);
    }

}
