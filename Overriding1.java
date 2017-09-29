class Parent
{
  public void property()
  {
    System.out.println("cash+land+gold");
  }
  
  public void marry()
  {
    System.out.println("prabhu");
  }
  
  // public final void marryAgain(){} 
}

class Child extends Parent
{
  public void marry()
  {
    System.out.println("prabhudeep");
  }
  
   //public final void marryAgain(){}  -> CE:Overriden method is final
}
 
public class Overriding1
{
  public static void main(String[] args)
  {
    Parent parent=new Parent();
    parent.marry(); //prabhu
	
    Child child=new Child();
    child.marry(); //prabhudeep
    
    Parent p1=new Child();
    p1.marry(); //prabhudeep
  }
}