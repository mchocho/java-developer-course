public class ConversionFun
{
  public static void main(String[] args)
  {
    /*
     * 8 Primitive Types in Java
     *
     * byte   (1)
     * short  (2)
     * int    (4)
     * long   (8)
     * float  (4)
     * double (8)
     * char   (2)
     * bool   (1 or 2 bytes depending on the platform)
     */

    double myDouble = 3.14;
    float  myFloat  = 3.14f;  //Removing the f will cause an error due to lossy conversion
    double yourDouble = myFloat; //Widening/lossless conversions won't raise errors
  }
}
