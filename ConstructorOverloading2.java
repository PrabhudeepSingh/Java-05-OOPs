public class ConstructorOverloading2
{
  ConstructorOverloading2()
  {
     this(10);   
  }

  ConstructorOverloading2(int i)
  {
    // this();  -> recursive constructor invocation
    System.out.println("hello");
  }

  public static void main(String[] args)
  {
     ConstructorOverloading2 c= new ConstructorOverloading2(10);
  }
}
  