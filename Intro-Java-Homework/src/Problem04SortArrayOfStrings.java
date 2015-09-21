import java.util.Scanner;

public class Problem04SortArrayOfStrings {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		int n =scanner.nextInt();
		String[] array=new String[n];
		for(int i=0;i<n;i++){
			array[i]=scanner.next();
		}
		bubble_sort(array);

		for(int i=0;i<n;i++){
			System.out.println(array[i]);
		}
		scanner.close();
		
	}
    public static void bubble_sort(String array[]) {
        int n = array.length;
        int index;
        for (int i = n; i >= 0; i--) {
            for (int j = 0; j < n - 1; j++) {
                index = j + 1;
                if (array[j].compareTo(array[index]) > 0) {
                    swapNumbers(j, index, array);
                }
            }
            
        }
    }
  
    private static void swapNumbers(int i, int j, String[] array) {
  
        String temp;
        temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

}
