import java.io.*;
import java.util.Scanner;
public class Q29 {
public static void main(String args[]){
System.out.println("please Enter a Firstname and Lastname separated by spaces");
Scanner sc = new Scanner(System.in);
String name =sc.nextLine();
System.out.println("name");
String[] arr = name.split(" ",2);
System.out.println(arr[1]+","+arr[0].charAt(0));
}
}
