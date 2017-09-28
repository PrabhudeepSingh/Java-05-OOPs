public class Overloading5
{
   public void mth(int x)
   {
     System.out.println("int version");
   }

   public void mth(int... x)
   {
     System.out.println("var-arg version");
   }
   
   public static void main(String []args)
   {
     Overloading5 o= new Overloading5();
     o.mth();
     o.mth(10, 55);
     o.mth(10);
   }
}
// var-args method will get least priority