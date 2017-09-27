public class InstanceStaticControl3
{  
  private static String mth(String msg)
  { 
    System.out.println(msg); 
    return msg; 
  }

  static String m= mth("1"); 
  {
     m= mth("2"); 
  }
  static
  {
    m= mth("3"); 
  }

  public static void main(String[] args)
  {
    Object o= new InstanceStaticControl3(); 
  }

}

/*OUTPUT:

1
3
2
*/