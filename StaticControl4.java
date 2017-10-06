public class StaticControl4
{
  static int i=10;
  
  static 
  {
    System.out.println(i);
  }
   
}

/*Output:
	10
	RE: Main method not found in class StaticControl4
*/