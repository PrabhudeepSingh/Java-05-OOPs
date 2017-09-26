//within the constructor we can take either super() or this() only in first line but not both simultaneously.
//we can use either super() or this() inside constructor. 

public class Constructor3
{
  Constructor3()
  {
    super();
    //this();      CE: call to this must be first statement in constructor

    System.out.println("constructor");
    //super();     CE: call to super must be first statement in constructor
  }

  public void m1()
  {
     System.out.println("hello");
  }

  public static void main(String[] args)
  {
     Constructor3 c= new  Constructor3();
  }

}
 