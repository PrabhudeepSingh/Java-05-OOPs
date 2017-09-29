class Parent
{ 
  public Object mth()
  {
    return null;
  }
}

class Overriding2 extends Parent
{ 
  public String mth()// child class method return type need not be same as parent method return type its child type also allowed
  {
    return null;
  }
  
  public static void main(String []args)
  {
    Overriding1 o= new Overriding1();
    o.mth();
   }
}