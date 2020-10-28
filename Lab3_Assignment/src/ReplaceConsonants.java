/**
 * 
 * @author Thejaswini
 * Desc : Replace consonants with next alphabet
 *
 */
public class ReplaceConsonants{
	public static void main(String[] args) {
		String input="java";					//Taking the input
		System.out.println("The final string :"+alterString(input));
	}

private static String alterString(String input) {
    char[] chars = input.toLowerCase().toCharArray();
    for (int i = 0; i < chars.length; i++) {
        char ch = chars[i]; 					//convert the input as into char array
        if (ch == 'z')
            chars[i] = 'b';						//a is vowel so if alphabet is z it should change to b
        else if (ch >= 'b' && ch <= 'y' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u') { //if input is consonant
            ch = (char)(ch + 1);																//add next alphabet
            if (ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
                ch++;
            chars[i] = ch;
        }
    }
    return new String(chars);
}
}