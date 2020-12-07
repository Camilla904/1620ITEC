
public interface Complexity
{
    public void setComplexity(int complexity);
    public int getComplexity();
}

---------------------------------------------------------------------------

public class Question implements Complexity 
{
   private String question, answer;
   private int complexityLevel;
//----------------------------------------------------------------- 
// Constructor: Sets up the question with a default complexity. 
//----------------------------------------------------------------- 
   public Question(String query, String result)
   {
      question = query; 
      answer = result; 
      complexityLevel = 1;
   }
//----------------------------------------------------------------- 
// Sets the complexity level for this question. 
//----------------------------------------------------------------- 
   public void setComplexity(int level)
   {
      complexityLevel = level;
   }
//----------------------------------------------------------------- 
// Returns the complexity level for this question. 
//----------------------------------------------------------------- 
   public int getComplexity()
   {
     return complexityLevel;
   }
//----------------------------------------------------------------- 
// Returns the question. 
//----------------------------------------------------------------- 
   public String getQuestion()
   {
      return question;
   }   
//----------------------------------------------------------------- 
// Returns the answer to this question. 
//----------------------------------------------------------------- 
   public String getAnswer()
   {
      return answer;
   }
//----------------------------------------------------------------- 
// Returns true if the candidate answer matches the answer. 
//----------------------------------------------------------------- 
   public boolean answerCorrect(String candidateAnswer)
   {
     return answer.equals(candidateAnswer);
   }
//----------------------------------------------------------------- 
// Returns this question (and its answer) as a string. 
//----------------------------------------------------------------- 
   public String toString()
   {
   return question + "\n" + answer;
   } 
 }
 
 ---------------------------------------------------------------------
 
 import java.util.Scanner;
public class MiniQuiz
{
//----------------------------------------------------------------- 
// Presents a short quiz. 
//----------------------------------------------------------------- 
  public static void main(String[] args)
  {
    Question q1, q2;
    String possible; //answer input
    Scanner scan = new Scanner(System.in);
    q1 = new Question("What is the capital of Jamaica?", "Kingston");
    q1.setComplexity(4);
    q2 = new Question("Which is worse, ignorance or apathy?", "I don't know and I don't care");
    q2.setComplexity(10);
    System.out.print(q1.getQuestion());
    System.out.println(" (Level: " + q1.getComplexity() + ")"); 
    possible = scan.nextLine();
    if (q1.answerCorrect(possible))
    System.out.println("Correct");
    else
    System.out.println("No, the answer is " + q1.getAnswer());
    
    System.out.println();
    System.out.print(q2.getQuestion());
    System.out.println(" (Level: " + q2.getComplexity() + ")"); 
    possible = scan.nextLine();
    if (q2.answerCorrect(possible))
      System.out.println("Correct");
    else
      System.out.println("No, the answer is " + q2.getAnswer());
    }
}





