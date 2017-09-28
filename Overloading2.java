public class Overloading2
{
   public void mth(int i)
   {
      System.out.println("int argument");
   }
   
   public void mth(float f)
   {
      System.out.println("float argument");
   }

   public static void main(String []args)
   {
     Overloading2 o= new Overloading2();
   
     o.mth(10); //int argument
     o.mth('a'); //int argument
     o.mth(10.5f); //float argument
     o.mth(10l); //float argument
	 
     //o.mth(10.5);   -> argument mismatch; possible lossy conversion from double to int)
   }
}