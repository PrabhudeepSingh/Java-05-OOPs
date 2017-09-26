class A
{
 static int i=B.j;
}

class B
{
 static int j=C.k;
}

class C
{
 static int k=D.m1();
}

class D
{
  public static int m1() 
  {
     return 10;
  }
}

public class Coupling
{
  public static void main(String[] args)
  {
    A a=new A();
    System.out.println(a.i);

    B b=new B();
    System.out.println(b.j);

    C c=new C();
    System.out.println(c.k);

    D d=new D();
    d.m1();
  }
}
