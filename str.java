import java.io.*;
public class str {
    public static void main(String[] args)
    {
        String str = "Geeks for Geeks";
        String strArray[] = str.split(" ");
        System.out.println("String : " + str);
        System.out.println("String array : [ ");
        for (int i = 0; i < strArray.length; i++) {
            System.out.print(strArray[i] + ", ");
        }
        System.out.print("]");
    }
}