package Java_standard;

/**
 * This class implements most common operations with Strings.
 * 
 * @author Ulises
 *
 */
public class strFunct {
	
	/**
	 * <pre><b>public String</b> replaceStr(String str, String searchStr, String newStr)</pre>
	 * This method replace each occurrence of some text within 
	 * an original string with some other text. 
	 * @param str Original string where the text is searched.
	 * @param searchStr Text search in the original string.
	 * @param newStr Text to place where the occurrence is found.
	 * @return Modified string with the searched text replaced.
	 */
	public String replaceStr(String str, String searchStr, String newStr){
		int index = str.indexOf(searchStr);
		if (index != -1) {
			while (index != -1) {
				str = str.substring(0, index) + newStr + str.substring(index+searchStr.length());
				index = str.indexOf(searchStr, index+newStr.length());
			}
		}
		return str;
	}
	
	/**
	 * <pre><b>public String</b> clearString(String str)</pre>
	 * Returns a string without spaces nor special characters
	 * @param str Original string to clear
	 * @return A String without special characters.
	 */
	public String clearString(String str) {
		String s = "";
		for (int i=1; i<str.length(); i++) {
			char ch = str.charAt(i);
			if (Character.isLetter(ch)) {
				s += ch;
			}
		}
		return s;
	}

	/**
	 * <pre><b>public boolean</b> isPalindrome(String str)</pre>
	 * Verify if some text is palindrome or not
	 * @param str String with the text to verify
	 * @return Returns true if the string contains a palindrome text.
	 */
	public boolean isPalindrome(String str) {
		for (int i=0; i < (str.length()/2); i++) {
			if (str.charAt(i) != str.charAt(str.length()-(i+1))) {
				return false;
			}
		}
		return true;
	}
	
	/**
	 * <pre><b>public String</b> reverseStr(String str)</pre>
	 * This method reverts the given string.
	 * @param str Original string to revert.
	 * @return A new reverted string.
	 */
	public String reverseStr(String str) {
		String s = "";
		for (int i=0; i<str.length(); i++) {
			char ch = str.charAt(i);
			s += ch;
		}
		return s;
	}
	
	/**
	 * <pre><b>public int</b> countUpperCase(String str)</pre>
	 * Retrieves the number of upper case letters of the string
	 * @param str Original string where upper case letters will be find.
	 * @return Returns the number of upper case letters within the string.
	 */
	public int countUpperCase(String str) {
		int count = 0;
		for (int i=0; i<str.length(); i++) {
			if (Character.isUpperCase(str.charAt(i))) {
				count++;
			}
		}
		return count;
	}
	
	/**
	 * <pre><b>public int</b> countLowerCase(String str)</pre>
	 * Retrieves the number of lower case letters of the string
	 * @param str Original string where lower case letters will be find.
	 * @return Returns the number of lower case letters within the string.
	 */
	public int countLowerCase(String str) {
		int count = 0;
		for (int i=0; i<str.length(); i++) {
			if (Character.isLowerCase(str.charAt(i))) {
				count++;
			}
		}
		return count;
	}
	
	/**
	 * <pre><b>public int</b> countSpaces(String str)</pre>
	 * Retrieves the number of spaces in the string
	 * @param str Original string where spaces will be find.
	 * @return Returns the number of spaces within the string.
	 */
	public int countSpaces(String str) {
		int count = 0;
		for (int i=0; i<str.length(); i++) {
			if (Character.isSpaceChar(str.charAt(i))) {
				count++;
			}
		}
		return count;
	}

}
