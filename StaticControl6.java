class StaticControl6
{
  static 
  {  
     mth();
  }
  
  public static void mth()
  {
     System.out.println(i);
  }
  
  static int i=10;
}

/*
	no CE because in this program we can perform indirect read
	RE: Main method not found in class StaticControl4
*/