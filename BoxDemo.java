class Box
{
double width,height,depth;
void volume()
 {
  System.out.println("Volume is:\n");
  System.out.println(width*depth*height);
 }
}
class BoxDemo
{
 public static void main(String args[])
  {
   Box mybox=new Box();
   double vol;
   mybox.width=10;
   mybox.height=20;
   mybox.depth=15;
   mybox.volume();
   //vol=mybox.width*mybox.height*mybox.depth;
   //System.out.println("volume is "+vol);
  }
 }


/*__OUTPUT__
Volume is 3000.0
*/
