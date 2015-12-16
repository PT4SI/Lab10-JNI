public class TestJNI {
   public native void greetings();

   static {
      System.loadLibrary("greet");
   }

   public static void main(String args[]) {
      new TestJNI().greetings();
   }
}
