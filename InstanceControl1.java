/*
  Instance control flow is as follows:
  1. Static Control flow.  
  2. Identification of instance members from top to bottom. [3-8]
  3. Execution of instance variable assignment & instance blocks from top to bottom. [9-14]
  4. Execution of constructor. [15]
*/

class InstanceControl1
{
   int i=10;  //3, 9
  
   { //4
      mth(); //10
      System.out.println("first instance block"); //12
   }

   InstanceControl() //5
   {
      System.out.println("constructor");  //15
   }

   public static void main(String[]args) //1
   {
     InstanceControl1 i= new InstanceControl1(); //2,15  //if we comment this line then output will be: main
     System.out.println("main"); //16
   }

   public void mth() //6
   {
      System.out.println(j); //11
   }

   { //7
      System.out.println("second instance block");} //13
   }
      
   int j=20; //8, 14
}