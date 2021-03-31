package search;

public class search1_100 {
	public static void main(String[] args) {
		int num = 1;
		while (num <= 100) {
//			int truth = num % 12 == 0;
			System.out.println(num);
			System.out.println(num % 12 == 0);
			num++;
		}
	}
}
