abstract class Parent
{
  public abstract void mth();
  //public void mth2();
}
 
public class  Overriding3 extends Parent
{
  public void mth() //parent class abstract method also override in child class
  {
    System.out.println("abstract method");
  }

  //void mth2(){}   -> we can't reduce the scope of access modifier

  public static void main(String[] args)
  {
    Overriding3 o= new Overriding3();
    o.mth();
  }
}