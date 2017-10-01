class Parent
{
  public void property()
  {
    System.out.println("cash+land+gold");
  }
  
  public void marry()
  {
    System.out.println("Prabhu");
  }
  
  // public final void marryAgain(){}
   
}

class Child extends Parent
{
   public void marry()
  {
    System.out.println("Prabhu deep");
  }
  
   //public final void marryAgain(){}CE:Overriden method is final
 
}
 
public class Polymorphism2
{
  public static void main(String[] args)
  {
    Parent parent=new Parent();
    parent.marry(); //Prabhu
	
    Child child=new Child();
    child.marry(); //Prabhu deep
	
    Parent p1=new Child();
    p1.marry(); //Prabhu deep
  }
}