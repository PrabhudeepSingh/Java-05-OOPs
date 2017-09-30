class Parent
{
 public static void mth(){}
 public void mth1(){}
}

public class Overriding5 extends Parent
{
  //public void mth(){}  -> CE: overridden method is static.
  
  //public static void mth1(){}  -> CE: overriding method is static.
  
  public static void main(String[] args)
  {
	 
  }
}