import java.util.*;

public class JNA1_CHANKaChun {
    
    public int x,y;
    
    //public native void gotoxy(int x, int y);
        public native int gotoxy();

    static {
        System.loadLibrary("gotoxy");
    }

public static void main(String args[]){

Scanner in = new Scanner(System.in);



System.out.print("Input the position of column: ");
int column = in.nextInt();

System.out.print("Input the position of row: ");
int row = in.nextInt();

System.out.print("Say Hello to: " );

String name = in.nextLine();

System.out.print(column);

new JNA1_CHANKaChun().gotoxy();
}

}