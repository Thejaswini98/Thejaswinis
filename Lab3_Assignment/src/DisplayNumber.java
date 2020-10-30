/**
 * 
 * @author Thejaswini
 * Desc :To display number of characters,lines and words in a text
 *
 */
import java.io.*;
import java.util.*;
public class DisplayNumber {
	
		public static void main(String[] args) {
			System.out.println("Enter the text");
			Scanner sc=new Scanner(System.in);
			String text=sc.nextLine();
			int countWord=0;
			int countLines=0;
			int countCharacter=0;
			
			String[] listWord=text.split("\\s+");   //s+ is the space delimiter in java 
			countWord+=listWord.length;
			
			String[] LineList=text.split("[!?.:]+");   // [!?.:]+ is the sentence delimiter in java 
			
			countLines+=LineList.length;
		    countCharacter+=text.length();
		    System.out.println("Number of words:"+countWord+"\nNumber of Lines:"+ countLines+"\nNumber of  characters:"+countCharacter);			
		}
	} 