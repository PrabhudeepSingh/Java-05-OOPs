class P
{
  public void m1()
  {
      System.out.println("parent");
  }
}

class C extends P
{
  public void m2()
  {
     System.out.println("child");
  }
}

public class Inheritance
  {
  public static void main(String[] args)
  {
    P p=new P();
    p.m1();   //parent

    //p.m2();  -> CE:cannot find symbol   -> using parent reference we can't all child specific method

    C c=new C();
    c.m1();    //parent
    c.m2();    //child

    P p1=new C();
    p1.m1();   //parent
    //p1.m2();  ->CE:cannot find symbol   -> using parent reference we can't all child specific method

    //C c=new P();    ->CE: incompatible types: P cannot be converted to C
                   // ->child reference can't be used to hold parent object
  }
}
