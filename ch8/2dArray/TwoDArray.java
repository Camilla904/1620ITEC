
public class TwoDArray 
{
//----------------------------------------------------------------- 
// Creates a 2D array of integers, fills it with increasing
// integer values, then prints them out. 
//----------------------------------------------------------------- 

public static void main(String[] args)
{
int[][] table = new int[5][10]; // 5 rows by 10 columns

      // Load the table with values
for (int row=0; row < table.length; row++)
// table.length = # of rows
for (int col=0; col < table[row].length; col++)
// table[row].length = the row length, i.e. # of columns
table[row][col] = row * 10 + col; //1st Iter: 0*10+0, 0*10+1, ... 0+10+9
      // Print the table
      
for (int row=0; row < table.length; row++) 
{
for (int col=0; col < table[row].length; col++) 

System.out.print(table[row][col] + "\t");
System.out.println(); 
}

}

}
