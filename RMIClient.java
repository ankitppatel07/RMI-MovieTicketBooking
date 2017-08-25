import java.io.*;
import java.rmi.registry.*;
import java.rmi.registry.Registry;

public class RMIClient {
    public static void main(String args[]){
        RMIClient client = new RMIClient();
        client.connectServer();
    }

    private void connectServer() {
        try{
int choice;
do
{
System.out.println("------------------------------------------------");
System.out.println("1.Book Ticket for Hindi Movie");
System.out.println("2.Book Ticket for English Movie");
System.out.println("3.Check Tickets Booked for Hindi Movie");
System.out.println("4.Check Tickets Booked for English Movie");
System.out.println("5.Cancel Ticket Booked for Hindi Movie");
System.out.println("6.Cancel Ticket Booked for English Movie");
System.out.println("------------------------------------------------");
InputStreamReader isr= new InputStreamReader(System.in);
BufferedReader br=new BufferedReader(isr);
System.out.println();
System.out.println("Enter your choice:");
System.out.println();
String s=br.readLine();
choice=Integer.parseInt(s);
RMIClient r = new RMIClient();
switch(choice)
{
case 1:
r.hinMov();break;
case 2:
r.engMov();break;
case 3:
r.chkTickHin();break;
case 4:
r.chkTickEng();break;
case 5:
r.cancelHin();break;
case 6:
r.cancelEng();break;
default:
System.out.println("Invalid choice!!!");
}
}while(choice<7);
          
     }
   
        catch(Exception e){
            System.out.println(e);
        }
}

public void hinMov()
{
try{ 
System.out.println("-----------Shows-Available----------------------------");  
    System.out.println("1.Ki & Ka");
    System.out.println("2.Kapoor and Sons");
System.out.println("------------------------------------------------"); 
    InputStreamReader isr= new InputStreamReader(System.in);
    BufferedReader br=new BufferedReader(isr);
System.out.println();   
    System.out.println("Select the option");
System.out.println();
String s1=br.readLine();
int choice1=Integer.parseInt(s1);
Registry reg = LocateRegistry.getRegistry("127.0.0.1",8081);
 RMI rmi = (RMI) reg.lookup("server");
     
switch(choice1)
{
case 1:
System.out.println("Enter the no. of tickets:");
String z1=br.readLine();
int n1=Integer.parseInt(z1);
System.out.println(n1 +" "+ "Tickets Booked for Ki & Ka");
rmi.incrhinkk(n1);
break;
case 2:
System.out.println("Enter the no. of tickets:");
String z2=br.readLine();
int n2=Integer.parseInt(z2);
System.out.println(n2 +" "+ "Tickets Booked for Kapoor & Sons");
rmi.incrhinks(n2);
break;
default:
System.out.println("Invalid choice!!!");
}
}catch(Exception e){System.out.println(e);}
}

public void engMov()
{
try{
System.out.println("--------------------Shows-Available------------------");
 System.out.println("1.Kung Fu Panda");
    System.out.println("2.Jungle Book"); 
System.out.println("------------------------------------------------");
    InputStreamReader isr= new InputStreamReader(System.in);
    BufferedReader br=new BufferedReader(isr); 
System.out.println();  
    System.out.println("Select the option");
System.out.println();
String s2=br.readLine();
int choice2=Integer.parseInt(s2);
Registry reg = LocateRegistry.getRegistry("127.0.0.1",8081);
 RMI rmi = (RMI) reg.lookup("server");
          
switch(choice2)
{
case 1:
System.out.println("Enter the no. of tickets:");
String z3=br.readLine();
int n3=Integer.parseInt(z3);
System.out.println(n3 +" "+ "Ticket Booked for Kung Fu Panda");
rmi.increngkfp(n3);
break;
case 2:
System.out.println("Enter the no. of tickets:");
String z4=br.readLine();
int n4=Integer.parseInt(z4);
System.out.println("Ticket Booked for Jungle Book");
rmi.increngjb(n4);
break;
default:
System.out.println("Invalid choice!!!");
}      
}catch(Exception e){System.out.println(e);}
}


public void chkTickHin()
{
try{
System.out.println("------------------------------------------------");
System.out.println("1.Check Tickets booked for Ki & Ka");
System.out.println("2.Check Tickets booked for Kapoor & Sons");
System.out.println("------------------------------------------------");
InputStreamReader isr= new InputStreamReader(System.in);
    BufferedReader br=new BufferedReader(isr); 
System.out.println();  
    System.out.println("Select the option");
System.out.println();
String s3=br.readLine();
int choice3=Integer.parseInt(s3);
Registry reg = LocateRegistry.getRegistry("127.0.0.1",8081);
 RMI rmi = (RMI) reg.lookup("server");
   switch(choice3)
{
case 1:
System.out.println("Ticket Booked for Ki&Ka are:" +rmi.getkkData());
break;
case 2:
System.out.println("Ticket Booked for Kapoor&Sons are:" +rmi.getksData());
break;
default:
System.out.println("Invalid choice!!!");
}      
}catch(Exception e){System.out.println(e);}       
}

public void chkTickEng()
{
try{
System.out.println("------------------------------------------------");
System.out.println("1.Check Tickets booked for Kung Fu Panda");
System.out.println("2.Check Tickets booked for Jungle Book");
System.out.println("------------------------------------------------");
InputStreamReader isr= new InputStreamReader(System.in);
    BufferedReader br=new BufferedReader(isr);
System.out.println();   
    System.out.println("Select the option");
System.out.println();
String s4=br.readLine();
int choice4=Integer.parseInt(s4);
Registry reg = LocateRegistry.getRegistry("127.0.0.1",8081);
 RMI rmi = (RMI) reg.lookup("server");
   switch(choice4)
{
case 1:
System.out.println("Ticket Booked for Kung Fu Panda are:" +rmi.getkfpData());
break;
case 2:
System.out.println("Ticket Booked for Jungle Book are:" +rmi.getjbData());
break;
default:
System.out.println("Invalid choice!!!");
}      
}catch(Exception e){System.out.println(e);}       
}


public void cancelHin(){
try{
System.out.println("------------------------------------------------");
System.out.println("1.Cancel Ticket booked for Ki & Ka");
System.out.println("2.Cancel Ticket booked for Kapoor & Sons");
System.out.println("------------------------------------------------");
InputStreamReader isr= new InputStreamReader(System.in);
    BufferedReader br=new BufferedReader(isr);
System.out.println();   
    System.out.println("Select the option");
System.out.println();
String s5=br.readLine();
int choice5=Integer.parseInt(s5);
Registry reg = LocateRegistry.getRegistry("127.0.0.1",8081);
 RMI rmi = (RMI) reg.lookup("server");
   switch(choice5)
{
case 1:
System.out.println("No. of tickets before cancelling:" +rmi.getkkData());
System.out.println("Enter the no. of tickets to cancel:");
String z5=br.readLine();
int n5=Integer.parseInt(z5);
System.out.println(n5 +" "+ "Tickets Canceled for Ki & Ka");
System.out.println("No. of tickets after cancelling:" +rmi.getckkData(n5));
break;
case 2:
System.out.println("No. of tickets before cancelling:" +rmi.getksData());
System.out.println("Enter the no. of tickets:");
String z6=br.readLine();
int n6=Integer.parseInt(z6);
System.out.println(n6 +" "+ "Tickets Canceled for Kapoor & Sons");
System.out.println("No. of tickets after cancelling:" +rmi.getcksData(n6));
break;
default:
System.out.println("Invalid choice!!!");
}      
}catch(Exception e){System.out.println(e);}       

}

public void cancelEng(){
try{
System.out.println("------------------------------------------------");
System.out.println("1.Cancel Ticket booked for Kung Fu Panda");
System.out.println("2.Cancel Ticket booked for Jungle Book");
System.out.println("------------------------------------------------");
InputStreamReader isr= new InputStreamReader(System.in);
    BufferedReader br=new BufferedReader(isr);
System.out.println();   
    System.out.println("Select the option");
System.out.println();
String s6=br.readLine();
int choice6=Integer.parseInt(s6);
Registry reg = LocateRegistry.getRegistry("127.0.0.1",8081);
 RMI rmi = (RMI) reg.lookup("server");
   switch(choice6)
{
case 1:
System.out.println("No. of tickets before cancelling:" +rmi.getkfpData());
System.out.println("Enter the no. of tickets:");
String z7=br.readLine();
int n7=Integer.parseInt(z7);
System.out.println(n7 +" "+ "Tickets Canceled for Kung Fu Panda");
System.out.println("No. of tickets after cancelling:" +rmi.getckfpData(n7));
break;
case 2:
System.out.println("No. of tickets before cancelling:" +rmi.getjbData());
System.out.println("Enter the no. of tickets:");
String z8=br.readLine();
int n8=Integer.parseInt(z8);
System.out.println(n8 +" "+ "Tickets Canceled for Jungle Book");
System.out.println("No. of tickets after cancelling:" +rmi.getcjbData(n8));
break;
default:
System.out.println("Invalid choice!!!");
}      
}catch(Exception e){System.out.println(e);}  
}
}