package myServer2;
import java.io.*;
import java.net.*;
import CNS.*;
import myAES.*;
public class Server3
{
public static void main(String args[])throws Exception
{
final String secretKey = "ssshhhhhhhhhhh!!!!";
//final String secretKey = "helloeveryone";
ServerSocket ss=new ServerSocket(2002);

Socket s=ss.accept();
Socket s1;
DataInputStream dis =new DataInputStream(s.getInputStream());
DataInputStream dis2=new DataInputStream(System.in);
DataOutputStream dout=new DataOutputStream(s.getOutputStream());
System.out.println("Connection Established");
while(true)
{
String str=dis.readUTF();
String decryptedString = myAES.decrypt(str,secretKey) ;
String s4=Ccipherr.decod(decryptedString);
System.out.println("Client -"+s4);
String s2=dis2.readLine();
String s3=Ccipherr.encod(s2);
String encryptedString = myAES.encrypt(s3,secretKey) ;
dout.writeUTF(encryptedString);
}
}
}