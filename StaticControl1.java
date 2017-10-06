/*
  Static Control flow is as follows:
  1. identification of static member from top to bottom [1 - 6]
  2. execution of static variable assignment & static block from top to bottom [7 - 12]
  3. execution of main method(13 to 15)   ->until 1.6v
  4. 1.7v onwards main method is mendatory to start a program execution.
*/

public class StaticControl1
{
  static int i=10; //1, 7
  static //2
  {
    mth(); //8
    System.out.println("First Static Block"); //10
  }

  public static void main(String []args) //3
  {
    mth(); //13
    System.out.println("Main Method"); //15
  }

  public static void mth() //4
  {
    System.out.println(j); //9, 14
  }

  static //5
  {
    System.out.println("Second Static Block"); //11
  }
  
  static int j=20; //6, 12
}