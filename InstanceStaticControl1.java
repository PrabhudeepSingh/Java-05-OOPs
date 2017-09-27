public class InstanceStaticControl1
{
  {
	System.out.println("First instance block"); 
  }
  
  static
  {
    System.out.println("First static block"); 
  }
 
  InstanceStaticControl1()
  {
    System.out.println("Constructor"); 
  }

  public static  void main(String []args)
  {
    InstanceStaticControl1 i = new InstanceStaticControl1();
    System.out.println("main");
    InstanceStaticControl1 i1 = new InstanceStaticControl1();
  }
  
  static 
  {
    System.out.println("Second static block"); 
  }

  {
    System.out.println("Second instance block"); 
  }

}

/*OUTPUT: 

First Static block
Second Static block
First instance block
Second instance block
Constructor
main
First instance block
Second instance block
Constructor
*/