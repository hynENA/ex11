import java.util.Scanner;
public class PerfectSquare {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Create a Scanner
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter an integer m: ");
		int m = input.nextInt();
		int i = 2;
		int n = 1;
		int temp = m;
		while (i <= m) {
			while (m % i == 0) {
				if (m % (i * i) != 0) {
					n = n * i;	
				}
				m = m / i;
			}
			i++;
		}
		System.out.println("The smallest number n for m * n to be a perfect square is " + n);
		System.out.println("m * n is " + (temp * n));
	}

}
