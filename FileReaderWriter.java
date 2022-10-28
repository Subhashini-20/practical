//write a pgm with "File reader " AND "File writer " classes


import java.io.*;
public class FileReaderWriter
{
	public static void main(String[] args)throws IOException
	{
		FileWriter fw=new FileWriter("d:\\file1.txt");//specified destination to write the file
		fw.write("Hai Everyone");
		FileReader fr=new FileReader("d:\\file1.txt");//to read the file from the specified destination
		int i;
		while((i=fr.read())!=-1)//read the data
			System.out.println((char)i);
		fr.close();//close the file
		fw.close();//close the file
		System.out.println("Success");
	}
}