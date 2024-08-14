import java.util.Scanner;
class Atm
{
public static void main (String arg[]){

int balance = 2000;
int withdraw = 0;
int deposit = 0;

Scanner at = new Scanner(System.in);
while(true){
System.out.println("*******Welcome_User********");
System.out.println("............................");
System.out.println("Option 1 : Withdraw");
System.out.println("Option 2 : Deposit");
System.out.println("Option 3 : Check Balance");
System.out.println("Option 4 : Exit");
System.out.println("Please choose any one option______________");
System.out.println("                ");



int option = at.nextInt();

switch(option){
  case 1:
  System.out.println("Enter withdraw amount->");
  withdraw = at.nextInt();
  if(balance < withdraw){
  System.out.println("Soory insufficient balance");
} 
else{
    balance = balance - withdraw;
    System.out.println("           ");
    System.out.println("Successfully Withdrawn");
    System.out.println("            ");

}
break;

  case 2:
  System.out.println("Enter deposit amount->");
  deposit = at.nextInt();
  balance = balance + deposit;
  System.out.println("           ");
  System.out.println("Successfully Deposited");
  System.out.println("            ");

break;

  case 3:
  System.out.println("           ");
  System.out.println("Your Account Balance is ->"+balance);
  System.out.println("            ");

break;
   case 4:
  System.out.println("you are Exit");
  System.exit(0);
  System.out.println("           ");


break;

default:
System.out.println("Please Enter Correct Option");
}
}

}
}





