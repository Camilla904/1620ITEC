
public double average(int ... list)
// accept a variable number of parameters 
{
  double result = 0.0;
  if (list.length != 0)
  {
      int sum = 0;
      for (int num : list)
        sum += num;
        result = (double)num / list.length;
   }
   
   return result;
}

---------------------------

public void printGrades(Grade ... grades) 
{
    for (Grade letterGrade : grades) 
    System.out.println(letterGrade);
}

--------------------------------

public int distance(int ... list) 
{
  int sum = 0;
  for (int num : list)
      sum = sum + num;
   return sum;
}



