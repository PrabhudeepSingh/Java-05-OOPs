public class MethodSignature
{
  public void mth1(int i)
  {
    System.out.println("mth1 method");
  }

  /*public void mth1(int x){}
         -> CE: method mth1(int) is already defined in class MethodSignature.
	 -> method with same signature not allowed.
    */

  public void mth2(String i)
  {
    System.out.println("mth2 method");
  }
  
  public static void main(String[] args)
  {
    MethodSignature ms= new MethodSignature();
    ms.mth1(10);
    ms.mth2("prabhu");
	
   //ms.mth1(10.0);  -> CE:argument mismatch -> possible lossy conversion from double to int.
  }
}