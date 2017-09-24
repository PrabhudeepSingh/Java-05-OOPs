abstract class Abstractexample
{
  // public static void main(string args[])
  //{
  // Abstractexample a=new Abstractexample();//CE: Abstractexample is abstract; cannot be  instantiated
  //}

  public abstract void m1();

  //{
  //CE:abstract methods cannot have a body
  //}
}
public class Abstractexample1 extends Abstractexample
{
   public abstract void m1()
   {
     System.out.println("abstarct method");
   }
   public static void main()
   {
      Abstractexample1 e=new  Abstractexample1();
     e.m1();
   }
}