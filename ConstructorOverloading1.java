class ConstructorOverloading1
{
  ConstructorOverloading1()     //Constructor1            
  { 
    System.out.println("no-arg constructor");
  }

  ConstructorOverloading1(int i)   //Constructor2
  {
    System.out.println("int-arg constructor");
  }

  ConstructorOverloading1(double d)     //Constructor3
  {
     System.out.println("double-arg constructor");
  }

  public static void main(String[] args)
  {
    ConstructorOverloading1  c= new ConstructorOverloading1();      //Constructor1 will be called.
    ConstructorOverloading1 c1= new ConstructorOverloading1(10);    //Constructor2 will be called.
    ConstructorOverloading1 c2= new ConstructorOverloading1(10.8);  //Constructor3 will be called.
  }
}