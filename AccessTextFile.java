import java.io.*;
import java.util.*;
class TextFilepath
{
	public static void main(String args[]) throws IOException
	{ 
		File f  = new File("myfile.txt");
		Scanner scan = new Scanner(f); 
		while (scan.hasNextLine()) 
		System.out.println(scan.nextLine()); 
	}
}