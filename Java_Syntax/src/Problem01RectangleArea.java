import java.util.Scanner;

public class Problem01RectangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        rectangle_area(a,b);
    }

    private static void rectangle_area(int sideA, int sideB) {
        int area = sideA * sideB;
        System.out.println(area);
    }

}
