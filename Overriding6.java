 class Parent
{
   public void mth(int... x)
   {
     System.out.println("Parent");
   }
}
 
public class Overriding6 extends Parent
{
   public void mth(int... x)
   {
     System.out.println("child");
   }
   
   public static void main(String []args)
   {
     Overriding6 o= new Overriding6();
     
     o.mth(10);
     Parent parent= new Parent();
     parent.mth(34);
   }
}
