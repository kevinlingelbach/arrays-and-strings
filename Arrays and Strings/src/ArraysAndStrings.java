
public class ArraysAndStrings {
	public static void main(String[] args) {
		System.out.println(isUnique("ab"));
		System.out.println(isUnique("aa"));
	}
	
	public static boolean isUnique(String str) {
		for (int i = 0; i < str.length() - 1; i++) {
			for (int j = i + 1; j < str.length(); j++) {
				if (str.charAt(i) == str.charAt(j)) {
					return false;
				}
			}
		}
		
		return true;
	}
	
	
}
