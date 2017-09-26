class Constructor2
{
  static int count=0;
  {
    count++;
  }

  Constructor1(){}

  Constructor1(int i){}

  Constructor1(double d){}

  public static void main(String[] args)
  {
    Constructor2 c=new Constructor2();
    Constructor2 c1=new Constructor2(10);
    Constructor2 c2=new Constructor2(10.8);

    System.out.println("the number of object created = "+count);
  }
}