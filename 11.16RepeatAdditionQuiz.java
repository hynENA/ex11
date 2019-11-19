import java.util.Scanner;
public class RepeatAdditionQuiz {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number1 = (int)(Math.random() * 10);
		int number2 = (int)(Math.random() * 10);
		
		//Create a scanner
		Scanner input = new Scanner(System.in);
		
		System.out.print(
				"What is " + number1 + " + " + number2 + "? ");
		int answer = input.nextInt();
		ArrayList<Integer> answer = new ArrayList<Integer>();
	    answer.add(input.nextInt());
	    while(!answer.contains(number1 + number2)) {
	        System.out.println("wrong answer.try again. what is " + number1 + "+" + number2 +"?");
	        answer.add(input.nextInt());
	    }
	    System.out.println("you got it !");
	}
}
