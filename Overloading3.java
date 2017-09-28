public class Overloading3
{
   public void mth(String s)
   {
     System.out.println("String version");
   }

   public void mth(StringBuffer sb)
   {
     System.out.println("StringBuffer version");
   }

   public void mth(Object o)
   {
     System.out.println("Object version");
   }

   public static void main(String []args)
   {
     Overloading3 o=new Overloading3();
     o.mth(new Object()); //Object Version
     o.mth("prabhu"); //String Version
     o.mth(new StringBuffer ("prabhu")); //StringBuffer Version
	 
     //o.mth(null); -> CE: reference to mth is ambiguous   ->both method mth(String) in Overloading3 and method mth(StringBuffer) in Overloading3 match
   }
}

/*while resolving overloaded methods compiler will give the precedence 
for child type argument when compared with parent type argument.*/