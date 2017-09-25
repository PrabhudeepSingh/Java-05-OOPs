//If Parent class throws any Checked Exception then compulsory child class should throw the same Checked Exception 
//or its Parent otherwise the code won't compile.
//and we get CE: unreported exception IOException; must be caught or declared to be thrown

import java.io.*;
class Parent
{
  Parent()throws IOException
  {

  }
}

class ConstructorOverloading4 extends Parent
{
   ConstructorOverloading4() throws IOException
   {
   
   }   
}