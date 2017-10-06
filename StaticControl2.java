/*
   Static Control flow in IS-A relationship.
   
   1. Identification of static members from parent to child. [1-11]
   2. Execution of static variable assignments and static blocks form parent to child. [12-22]
   3. Execution of only child class main method. [23-25]
*/

class Base
{
  static int i=10; //1
  static //2  
  { 
    mth1();
    System.out.println("Base static block");
  }
  
  public static void main(String[] args) //3
  {
     mth1();
     System.out.println("Base main");
  }
  
  public static void mth1() //4
  {
    System.out.println(j);
  }

  static int j=20; //5
}
  
public class StaticControl2 extends Base
{
  static int x=100; //6 
  static //7
  {
    mth2();
    System.out.println("derived first static block");
  }
  
  public static void main(String[] args) //8
  {
    mth2();
    System.out.println("Derived main");
  }
 
  public static void mth2() //9
  {
    System.out.println(y);
  }

  static //10
  {
    System.out.println("Derived second static block");
  }
  
  static int y= 200; //11
}