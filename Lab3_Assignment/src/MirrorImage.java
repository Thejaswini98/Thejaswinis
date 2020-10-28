/**
 * 
 * @author Thejaswini 
 * Desc : To find the mirror image of a string and append it with original
 *
 */
import java.util.*;
import java.lang.*;
public class MirrorImage {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		StringBuffer str= new StringBuffer("EARTH"); //Creating object and giving input
		System.out.println(str+"|"+getImage(str));   //printing the output
	}

	private static StringBuffer getImage(StringBuffer str) {
		
		str.reverse();                             //calling reverse method
		return str;
	}

}
