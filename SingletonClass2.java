public class SingletonClass2
{
  private static SingletonClass2 obj= null;
  
  private SingletonClass2()
  {
	  
  }

  public static SingletonClass2 getSingleton()
  { 
    if(obj==null)
        obj= new SingletonClass2();
	
    return obj;
  }
   
  public static void main(String[] args)
  {
    SingletonClass2 s1= SingletonClass2.getSingleton();
    SingletonClass2 s2= SingletonClass2.getSingleton();
    SingletonClass2 s3= SingletonClass2.getSingleton();
   
    if(s1==s3)
        System.out.println("true");
  }
}