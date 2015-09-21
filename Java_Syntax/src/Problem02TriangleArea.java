import java.util.Scanner;

public class Problem02TriangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int pointAX=scanner.nextInt();
        int pointAY=scanner.nextInt();
        int pointBX=scanner.nextInt();
        int pointBY=scanner.nextInt();
        int pointCX=scanner.nextInt();
        int pointCY=scanner.nextInt();
        triangle_area(pointAX,pointAY,pointBX,pointBY,pointCX,pointCY);

    }

    private static void triangle_area(int pointAX, int pointAY, int pointBX, int pointBY, int pointCX, int pointCY) {
        int area=((pointAX*(pointBY-pointCY) + pointBX*(pointCY-pointAY) + pointCX*(pointAY-pointBY))/2);
        System.out.println(Math.abs(area));
    }
}
