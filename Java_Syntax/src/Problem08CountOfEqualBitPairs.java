import java.util.Scanner;

public class Problem08CountOfEqualBitPairs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        String binary =  Integer.toBinaryString(number);
        count_bit_pairs(binary);
    }

    private static void count_bit_pairs(String binary) {
        int counter = 0;
        char[] bin=binary.toCharArray();
        for (int i = 1; i <binary.length() ; i++) {
            if (bin[i-1]==bin[i]){
                counter++;
            }
        }
        System.out.println(counter);
    }
}
