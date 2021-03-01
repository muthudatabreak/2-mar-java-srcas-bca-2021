// https://www.w3schools.com/java/tryjava.asp?filename=demo_interface_multi
import java.io.*;
class program1
{
public static void main(String args[]) throws IOException
{
DataInputStream in=new DataInputStream(System.in);
System.out.print("Enter byte value:");
byte b1=Byte.parseByte(in.readLine());
System.out.println("Byte Value of b1: "+b1);
System.out.print("Enter integer value:");
int i=Integer.parseInt(in.readLine());
System.out.println("Integer Value:"+i);
System.out.print("Enter float value:");
float f=Float.parseFloat(in.readLine());
System.out.println("Float Value:"+f);
System.out.print("Enter String value:");
String str=in.readLine();
System.out.println("Char Value:"+str);
}
}
