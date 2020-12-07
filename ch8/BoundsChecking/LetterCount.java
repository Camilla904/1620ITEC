import java.util.Scanner;
public class LetterCount
{
//----------------------------------------------------------------- 
// Reads a sentence from the user and counts the number of
// uppercase and lowercase letters contained in it. 
//----------------------------------------------------------------- 
   public static void main(String[] args)
   {
      final int NUMCHARS = 26;
      Scanner scan = new Scanner(System.in);
      int[] upper = new int[NUMCHARS]; // array of uppercase chrs
      int[] lower = new int[NUMCHARS]; // array of lowercase chrs 
      char current; // the current character being processed
      int other = 0; // initialized counter for other characters
      System.out.println("Enter a sentence:"); 
      String line = scan.nextLine();
      // Count the number of each letter occurence
      for (int ch = 0; ch < line.length(); ch++) // note () for String 
      {
         // Note: although this value is not required in the program, 
         // valid index value can be determined by:
         // subtracting the initial character value from the current
         // character value results in the index value of the current 
         // character, e.g., 'E'-'A'= 69-65= 4; 4 is the correct index 
         // position of "E" (5th) in the uppercase alphabet characters
         current = line.charAt(ch);
         if (current >= 'A' && current <= 'Z') //between 65 & 90
            upper[current-'A']++; // count the # of each character else
         if (current >= 'a' && current <= 'z') // between 97 & 122 lower[current-'a']++; // count the # of each character
            else
               other++;
      }

      //  Print the results
      System.out.println();
      for (int letter=0; letter < upper.length; letter++) 
      {
         System.out.print( (char) (letter + 'A') ); // in same line 
         System.out.print(": " + upper[letter]); 
         System.out.print("\t\t" + (char) (letter + 'a') ); 
         System.out.println(": " + lower[letter]);
      }
      
      System.out.println();
      System.out.println("Non-alphabetic characters: " + other); 
   }
}


