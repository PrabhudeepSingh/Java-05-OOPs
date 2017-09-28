public class Overloading4
{
   public void mth(int i, float f)
   {
     System.out.println("int float version");
   }

   public void mth(float f, int i)
   {
     System.out.println("float int version");
   }
   
   public static void main(String[] args)
   {
     Overloading4 o=new Overloading4();
     o.mth(10,10.6f);
     o.mth(10.8f,10);
	 
     //o.mth(10,10); CE: reference to mth is ambiguous  ->  both method mth(int,float) in Overloading4 and method mth(float,int) in Overloading4 match
     //o.mth(10.5f,10.4f);  CE:argument mismatch
    }
}