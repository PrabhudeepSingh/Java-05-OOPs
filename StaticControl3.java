public class StaticControl3
{
  static int i=10;
  
  static 
  {
    mth();
    System.out.println(i); //Direct read
  }
  
  public static void mth()
  {
    System.out.println(i); //Indirect read
  }
  
  public static void main(String[] args)
  {
    // mth();
  }
}

