import java.util.Locale;
import java.util.Scanner;

public class Problem04TheSmallestNumber {
    public static void main(String[] args) {
        Locale.setDefault(Locale.ROOT);
        Scanner scanner = new Scanner(System.in);
        double a=Double.parseDouble(scanner.next());
        double b=Double.parseDouble(scanner.next());
        double c=Double.parseDouble(scanner.next());
        smallest(a,b,c);

    }

    private static void smallest(double a, double b, double c) {
        double smallest=a;
        if (smallest>b){
            smallest=b;
        }
        if (smallest>c){
            smallest=c;
        }
        System.out.println(smallest);
    }
}
