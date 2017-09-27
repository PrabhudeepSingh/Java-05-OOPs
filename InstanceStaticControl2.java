public class InstanceStaticControl2
{  
  private static String mth(String msg)
  { 
    System.out.println(msg); 
    return msg; 
  }

  public InstanceStaticControl2()
  {
    m= mth("1"); 
  }
  
  {
     m=mth("2"); 
  }
  
  String m= mth("3"); 

  public static void main(String[] args)
  {
    Object o=new InstanceStaticControl2(); 
  }

}

/*OUTPUT:

2 
3 
1
*/