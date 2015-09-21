import java.math.BigInteger;
import java.util.Locale;
import java.util.Scanner;

public class Problem06FormattingNumbers {
    public static void main(String[] args) {
        Locale.setDefault(Locale.ROOT);
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        float b=scanner.nextFloat();
        float c=scanner.nextFloat();
        String hex = Integer.toHexString(a).toUpperCase();
        String binary=Integer.toBinaryString(a);

        System.out.printf("|%-10s|%010d|%10.2f|%-10.3f|",hex,new BigInteger(binary),b,c);

    }
}
