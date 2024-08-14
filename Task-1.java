import java.util.Scanner;
 class Game_Guess_Number
{
public static void main(String arg[])
{
int number = (int)(Math.random()*100);
Scanner sc = new Scanner(System.in);
int numberchoise = 0;
do
{
System.out.println("Please chose the number between 1-100------------");
numberchoise = sc.nextInt();

if(numberchoise==number)
{
System.out.println("you guess the right number__________________");
break;
}
else if(numberchoise>number)
{
System.out.println("Your number is to Hihg_____________");
}
else
{
System.out.println("your number is to Low____________");
}
}
while(numberchoise>0);
System.out.println("your game is over");
}
}



