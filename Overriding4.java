import java.io.*;

class Parent
{
 public void mth()throws IOException{}
}

class Overriding4 extends Parent
{
  //public void mth()throws Exception{}  -> CE:overridden method does not throw Exception

  public void mth()throws FileNotFoundException{}
  //if child class throw any checked exception than compulsory parent class method should throw same checked exception or its parents
 
  public static void main(String[] args)
  {
  
  }
}
