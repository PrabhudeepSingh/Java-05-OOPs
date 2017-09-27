/* 
  Instance Control flow in IS-A relationship.
  
  1. (whenever we are creating child class object):identification of instance member from parent to child. [4-14]
  2. execution of instance variable assignment & instance blocks only in parent class. [15-19]
  3. execution of parent constructor. [20]
  4. execution of instance variable assignment & instance blocks only in child class. [21-26]  
  5. execution of child constructor. [27]
*/

class Parent 
{
  int i=10; //4, 15
  
  { //5
    mth(); //16
    System.out.println("parent instance block"); //18
  }

  Parent() //6
  {
     System.out.println("constructor"); //20
  }

  public static void main(String[] args) //1
  {
     Parent p=new Parent(); 
     System.out.println("parent main");
  }

  public void mth() //7
  {
    System.out.println(j); //17
  }

  int j=29; //8, 19
}

class InstanceControl2 extends Parent
{
  int x=100; //9, 21
  
  { //10
    mth2(); //22
    System.out.println("child first instance block"); //24
  }

  InstanceControl2() //11
  { 
     System.out.println("child class constructor"); ///27
  }

  public static void main(String[] args) //2
  {
    InstanceControl2 i=new InstanceControl2(); //3
    System.out.println("child main"); //28
  }

  public void mth2() //12
  {
    System.out.println(y); //23
  }
  
  { //13
      System.out.println("child ssecond instance block"); //25
  }

  int y=200; //26
}