import java.util.Scanner;
class Result
{
public static void main(String args[])
{
int sub1,sub2,sub3,sub4,sub5;
System.out.println("Enter marks of five subject......................");

Scanner sc = new Scanner(System.in);
sub1 = sc.nextInt();
sub2 = sc.nextInt();
sub3 = sc.nextInt();
sub4 = sc.nextInt();
sub5 = sc.nextInt();

int sum = sub1 + sub2 + sub3 + sub4 + sub5;
System.out.println("Total marks= "+sum);

double avg = sum/5.0;
System.out.println("Average marks= "+avg); 

if(avg>=80 && avg<=100){
System.out.println("grade is A");
}
else if(avg>=60 && avg<80){
System.out.println("grade is B");
}
else if(avg>=35 && avg<60){
System.out.println("grade is c");
}
else{
System.out.println("you are Fail");
}

}
}