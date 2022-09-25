//wrp to demo StudentResult
import java.util.Scanner;
class StudentResult
{
public static void main(String args[])
{
     int eng, chem, phy, math, bio; 
     double total, average;
    Scanner sc=new Scanner(System.in);
    
	// Input marks of all five subjects //
    System.out.println("Enter marks of five subjects:");
    System.out.print("Enter marks of English subjects:");
    eng=sc.nextInt();
    System.out.print("Enter marks of chemistry subjects:");
    chem=sc.nextInt();
    System.out.print("Enter marks of chemistry  subjects:");
    phy=sc.nextInt();
    System.out.print("Enter marks of maths subjects:");
    math=sc.nextInt();
    System.out.print("Enter marks of biology subjects:");
    bio=sc.nextInt();

    // Calculate total, average and percentage //
    total = eng + chem + phy + math + bio;
    average = (total / 5);
	 
    // Print all results //
    System.out.println("Total marks ="+total);
    System.out.println("Average marks = "+average);
   }
}
