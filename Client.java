package myClient2;
import java.io.*;
import CNS.*;
import myAES.*;
import java.net.*;
public class Client3
{
public static void main(String args[]) throws Exception
{
final String secretKey = "ssshhhhhhhhhhh!!!!";
//final String secretKey = "helloeveryone";
Socket s=new Socket("localhost",2002);
DataInputStream dis =new DataInputStream(s.getInputStream());
DataInputStream dis2=new DataInputStream(System.in);
DataOutputStream dout=new DataOutputStream(s.getOutputStream());
System.out.println("Connection Established");
while(true)
{
String s1=dis2.readLine();
String s3=Ccipherr.encod(s1);
String encryptedString = myAES.encrypt(s3, secretKey) ;
dout.writeUTF(encryptedString);
String s2=dis.readUTF();
String decryptedString = myAES.decrypt(s2,secretKey) ;
String s4=Ccipherr.decod(decryptedString);
System.out.println("Server -"+s4);
}
}
}