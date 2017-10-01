public class Polymorphism1
{
   public void mth()
   {
      System.out.println("no argument"); //no argument
   }
   
   public void mth(int i)
   {
      System.out.println("int argument"); //int argument
   }
   
   public void mth(String s)
   {
      System.out.println("String argument"); //String argument
   }
   
   public static void main(String []args)
   {
     Polymorphism1 obj=new Polymorphism1();
     obj.mth();
     obj.mth(10);
     obj.mth("aman");
   }
}