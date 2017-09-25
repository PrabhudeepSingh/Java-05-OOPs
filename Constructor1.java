// the purpose of constructor is to perform initialization of an object 

public class Constructor1
{
  String name;
  int rollno;

  Constructor1(String name, int rollno)
  {
    this.name=name;
    this.rollno=rollno;
    System.out.println(name);
    System.out.println(rollno);
  }

  public static void main(String[] args)
  {
    Constructor1 c = new Constructor1("prabhu",12);
    Constructor1 c1= new Constructor1(deep",13);
  }

}
 
  