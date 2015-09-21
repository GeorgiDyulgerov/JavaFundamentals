import java.time.LocalDateTime;
import java.util.Date;

public class Problem02CurrentDateTime {
		public static void main(String[] args) {
		System.out.println(LocalDateTime.now());
		Date currentDate = new Date();
		System.out.println(currentDate.toString());
	}
}
