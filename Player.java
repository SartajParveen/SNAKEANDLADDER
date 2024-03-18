package player;
import java.util.*;
public class Player{
String name;
int age;
String email;
String contactno;
String address;


public void setDetails(String name,int age,String email,String contactno,String address){
    this.name=name;
    this.age=age;
    this.email=email;
    this.contactno=contactno;
    this.address=address;
}

public void getDetails(){
    System.out.println("name: "+name);
    System.out.println("Age:"+age);
    System.out.println("contact number:"+contactno);
    System.out.println("email:"+email);
    System.out.println("Address:"+address);
}
public  static Player setPlayerDetailsFromUser(){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the details:");
    System.out.println("Enter player name:");
    String name=sc.next();
    System.out.println("Enter age");
    int age = sc.nextInt();
    System.out.println("Enter contact no:");
    String contactno=sc.next();
    System.out.println("Enter email");
    String email = sc.next();
    System.out.println("enter address");
    String address = sc.next();
    Player pl= new Player();
    sc.close();
    pl.setDetails(name,age,email,contactno,address);
    return pl;
}
public String getPlayer(){
    return name;
}
public void getAge(){
    System.out.println(age);
}
public void getEmail(){
    System.out.println(email);
}
public void getContact(){
    System.out.println(contactno);
}
}

