class Parent
{
  public static void m1()
  {
    System.out.println("parent");
  }
}

public class MethodHiding extends Parent
{
  public static void m1()
  {
    System.out.println("child");
  }

  public static void main(String []args)
  {
    MethodHiding m=new MethodHiding();
    m.m1();  //child
  }
}