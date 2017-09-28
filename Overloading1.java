public class Overloading1
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
     Overloading o=new Overloading();
     o.mth();
     o.mth(10);
     o.mth("prabhu");
   }
}