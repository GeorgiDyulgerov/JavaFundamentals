import java.util.Locale;
import java.util.Scanner;

public class Problem03PointsInsideFigure {
    public static void main(String[] args) {

        Locale.setDefault(Locale.ROOT);
        Scanner scanner = new Scanner(System.in);
        float pointX = scanner.nextFloat();
        float pointY = scanner.nextFloat();
        if (point_location(pointX,pointY)){
            System.out.println("Inside");
        }
        else {
            System.out.println("Outside");
        }

    }

    private static boolean point_location(float pointX, float pointY) {
        boolean inside=false;
        if (pointX>=12.5&&pointX<=22.5&&pointY>=6&&pointY<=8.5)
        {
            inside=true;
        }
        if (pointX>=12.5&&pointX<=17.5&&pointY>=8.5&&pointY<=13.5)
        {
            inside=true;
        }
        if (pointX>=20&&pointX<=22.5&&pointY>=8.5&&pointY<=13.5)
        {
            inside=true;
        }

        return inside;
    }
}
