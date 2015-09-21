import java.util.Scanner;

public class Problem05DecimalToHexadecimal {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int num=scanner.nextInt();
        String hex=Integer.toHexString(num);
        System.out.println(hex.toUpperCase());
    }
}
