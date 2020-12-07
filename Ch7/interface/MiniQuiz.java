package complexity;
import java.util.Scanner;

public class MiniQuiz {
	
	public static void main(String[] args)
	{
		Question q1,q2; //可以一起instantiate你需要的所有object
		String possible;
		Scanner scan = new Scanner(System.in);
		
		q1 = new Question("What is the capital of Jamaica?","Kingston");
		q1.setComplexity(4);
		
		q2 = new Question("Which is worse, ignorance or apathy?","I don't know and I don't care");
		q2.setComplexity(10);
		 
		System.out.println(q1.getQuestion() + "(Level:" + q1.getComplexity()+")");
		possible = scan.nextLine();
		
		if(q1.answerCorrect(possible))
			System.out.println("Correct");
		else
			System.out.println("No, the answer is"+ q1.getAnswer());
		System.out.println("");
		
		System.out.println(q2.getQuestion() + "(Level:" + q2.getComplexity()+")");
		possible = scan.nextLine();
		if(q2.answerCorrect(possible))
			System.out.println("Correct");
		else
			System.out.println("No, the answer is"+ q2.getAnswer());
	}
}
