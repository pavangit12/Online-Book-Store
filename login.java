import java.util.*;

class Data
{
   private String a1[]={"Pavanm@123","5362"};
   private String a2[]={"Chaitu@435","7488"};
   private String a3[]={"Lahari@357","4654"};
   private String a4[]={"Kishor@647","6473"};
   String a5[]=new String[2];
   static Data obj=new Data();
   int c=0;
   static Scanner sc=new Scanner(System.in);
   void setUser(String User_id1, String Password1)
   {
      if(a1[0].compareTo(User_id1)==0 && a1[1].compareTo(Password1)==0)
      {
          c=1;
          this.a1[0]=User_id1;
          this.a1[1]=Password1;
      }
      else if(a2[0].compareTo(User_id1)==0 && a2[1].compareTo(Password1)==0)
      {
          c=2;
          this.a2[0]=User_id1;
          this.a2[1]=Password1;
      }
      else if(a3[0].compareTo(User_id1)==0 && a3[1].compareTo(Password1)==0)
      {
          c=3;
          this.a3[0]=User_id1;
          this.a3[1]=Password1;
      }
      else if(a4[0].compareTo(User_id1)==0 && a4[1].compareTo(Password1)==0)
      {
          c=4;
          this.a4[0]=User_id1;
          this.a4[1]=Password1;
      }
      else if(String.valueOf(a5[0]).compareTo(User_id1)==0 && String.valueOf(a5[1]).compareTo(Password1)==0)
      {
          c=5;
          this.a5[0]=User_id1;
          this.a5[1]=Password1;
      }
      else
      {
          String red = "\u001B[31m";
	  String reset = "\u001B[0m";
          System.out.println(red+"Invalid Username or Password"+reset);
          System.out.println("Enter Username and Password again");
          System.out.print("Re-enter Username : ");
          String Username2=sc.next();
          System.out.print("Re-enter Password : ");
          String Pin2=sc.next();
          obj.setUser(Username2, Pin2);
      }
   }
   void Uparr(String User_id2, String Password2)
   {
      this.a5[0]=User_id2;
      this.a5[1]=Password2;
   }
   String getUser()
   {
      if(c==1)
         return a1[0];
      else if(c==2)
         return a2[0];
      else if(c==3)
         return a3[0];
      else if(c==4)
         return a4[0];
      else if(c==5)
         return a5[0];
      else 
         return "";
   }
}
class Condi extends Data
{
   void Condi1(int opt)
   {
     
     if(opt==1)
     {
        System.out.print("Username : ");
        String Username1=sc.next();
        System.out.print("Password : ");
        String Pin1=sc.next();
        obj.setUser(Username1,Pin1);
     }
     else if(opt==2)
     {
        System.out.print("Enter Username : ");
        String NewUs=sc.next();
        System.out.print("Enter password : ");
        String NewP=sc.next();
        obj.Uparr(NewUs, NewP);
     }
   }
}
class Obs extends Condi
{
  void Choice()
  {
    Scanner sc=new Scanner(System.in);
 
       String reset = "\u001B[0m";
        String yellow = "\u001B[43m";
        String green = "\u001B[42m";
	String purple="\u001B[45m";
    //user greetings//
    System.out.println(yellow + "Welcome to the Online Book Store" + reset);
        System.out.println("================================");
        System.out.print("Please enter your name: ");

    String username=sc.nextLine();
    System.out.println("Hello,"+username+"!");
    System.out.println("How can we assist you today?");
    //favorite book//
    System.out.println(purple+"---Famous categories---"+reset);  
    System.out.println("Fiction books");                                              
    System.out.println("Nonfiction books");
    System.out.println("Children books");
    System.out.println("Horror books");
    System.out.println(purple+"---Famous Books---"+reset);
  }
}
class Main
{
   public static void main(String[] args)
   {
     String reset = "\u001B[0m";
     String purple="\u001B[45m";
     String yellow = "\u001B[43m";
     String ytext="\u001B[33m";
     System.out.println(ytext+"Hello"+reset);
     Scanner sc=new Scanner(System.in);
     Obs obj=new Obs();
     info1 obj1=new info1();
     Buynow bn=new Buynow();
     for(int i=0; ;i++)
     {
       System.out.println("1.Already have an account : Login");
       System.out.println("2.Don't have an account : Sign up");
       System.out.println("please enter 1 for login or 2 for signup:");
       int opt=sc.nextInt();
       obj.Condi1(opt);
       obj.Choice();
       obj1.display();
       if(obj1.display()==true)
       {
		System.out.println(purple+"Buy Now"+reset);
  		bn.payment();
       }
       System.out.println(purple+"Thank you for visiting,re-directing to home page"+reset);
       
     }
   }
}