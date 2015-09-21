import java.util.Scanner;

public class Problem07CountOfBitsOne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        String binary =  Integer.toBinaryString(number);
        count_ones(binary);
    }

    private static void count_ones(String binary) {
        int counter = 0;
        char[] bin=binary.toCharArray();
        for (int i = 0; i <binary.length() ; i++) {
            if (bin[i]=='1'){
                counter++;
            }
        }
        System.out.println(counter);
    }
}
