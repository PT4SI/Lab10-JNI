package chankachun_jni;
import java.util.*;

public class JNA1_CHANKaChun {

    public native void gotoxy(int column, int row, String name);

    
    static {
        System.loadLibrary("gotoxy");
    }

public static void main(String args[]){

Scanner in = new Scanner(System.in);

//new JNA1_CHANKaChun().gotoxy();

System.out.print("Input the position of column: ");
int column = in.nextInt();

System.out.print("Input the position of row: ");
int row = in.nextInt();

System.out.print("Say Hello to: " );

String name = in.nextLine();

new JNA1_CHANKaChun().gotoxy(column, row, name);

}

}