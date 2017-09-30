class Parent
{
  int x=100;
}
class Child extends Parent
{
  int x=300;
} 
 
public class Overriding7
{
  public static void main(String[] args)
  {
    Parent parent=new Parent();
    System.out.println(parent.x);//100
	
    Child child=new Child();
    System.out.println(child.x);//300
	
    Parent parent1=new Parent();
    System.out.println(parent1.x);//100  -> overriding concept applicable only for methods not for variables
  }
}