public class SingletonClass
{
  private static SingletonClass obj= new SingletonClass();
  
  private SingletonClass()
  {
	  
  }
  public static SingletonClass getSingleton()
  {
    return obj;
  }
  
  public static void main(String[] args)
  {
    SingletonClass s1= SingletonClass.getSingleton();
    SingletonClass s2= SingletonClass.getSingleton();
    SingletonClass s3= SingletonClass.getSingleton();
    if(s1==s3)
        System.out.println("true")}
  }
}