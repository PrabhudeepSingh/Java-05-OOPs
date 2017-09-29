class Animal
{
}
class Monkey
{
}

public class Overloading5
{
  public void m1(Animal a)
  {
    System.out.println("Animal version");
  }
   public void m1(Monkey a)
  {
    System.out.println("Monkey version");
  }
  public static void main(String[] args)
  {
    Overloading5 o=new  Overloading5();
    Animal a=new Animal();
    o.m1(a);
    Monkey m=new Monkey();
    o.m1(m);
  }
}
// in overloading method resolution always takes care by complier based on reference type