public class TypeCasting 
{
  public static void main(String []args)
  {
    Object o=new String("prabhudeep");
	
    Object o1= (String)o;
	
    //StringBuffer sb=(StringBuffer)o;  -> RE:java.lang.ClassCastException: java.lang.String cannot be cast to java.lang.StringBuffer
	
    String s=new String();       
	
    //StringBuffer sb1=(StringBuffer)s;  -> CE: incompatible types: String cannot be converted to StringBuffer
  }
}