abstract class AbstractClass
{
  /*public static void main(string args[])
    {
      AbstractClass a= new AbstractClass();  -> CE: AbstractClass is abstract; cannot be  instantiated
    }*/

  public abstract void m1();
  /*{
          -> CE:abstract methods cannot have a body
    }*/
}

public class AbstractClass1 extends AbstractClass
{
   public abstract void m1()
   {
     System.out.println("abstarct method");
   }

   public static void main()
   {
     AbstractClass1 e=new  AbstractClass1();
     e.m1();
   }
}