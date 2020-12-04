package complexity;

public class Question implements Complexity{
	private String question, answer;
	private int complexityLevel;
	
	public Question(String query, String result) {
		question = query;
		answer = result;
		complexityLevel = 1;
	}
	
	public void setComplexity(int complexity) {
		complexityLevel = complexity;
	}
	
	public int getComplexity() {
		return complexityLevel;	
	}
	
	public String getQuestion() {
		return question;		
	}
	
	public String getAnswer() {
		return answer;
	}
	public boolean answerCorrect(String cadidateAnswer) {
		return answer.equals(cadidateAnswer);
		
	}
	
	public String toString() {
		
		return question + "\n" + answer;
		
	}

}
