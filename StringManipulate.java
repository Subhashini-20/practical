//STRING MANIPULATION METHODS
import java.util.Scanner;
class StringManipulate
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		
		//get String 1
		System.out.println("Enter String 1");
		String s1=sc.next();
		//get string 2
		System.out.println("Enetr String 2");
		String s2=sc.next();
		//== methods
		System.out.println("check == methods");
		System.out.println(s1==s2);
		//equals methods
		System.out.println("checl equals methods");
		System.out.println(s1.equals(s2));
		//concat methods
		System.out.println("using concatination methods");
		System.out.println(s1.concat(s2));
		//replace methods
		System.out.println("using replace methods methods");
		System.out.println(s1.replace("regi","sutha"));
		//charat methods
		System.out.println("using charAt  methods");
		System.out.println(s1.charAt(3));
		//compareto methods
		System.out.println("using compareTo methods");
		System.out.println(s1.compareTo(s2));
		//substring methods
		System.out.println("using substring methods");
		System.out.println("regina".substring(2,4));
		//split methods
		System.out.println("using split methods");
		for(String w:s1.split("reg",0))
		{
			System.out.println(w);
		}
		
	}
}
