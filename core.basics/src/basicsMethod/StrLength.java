package basicsMethod;

public class StrLength {
public static void main(String[] args) {
		
		String name = "Ranveer Singh Rana";
		
		System.out.println("length = "+ name.length());
		System.out.println("Charater at = "+ name.charAt(3));
		System.out.println("Index of = "+ name.indexOf("Singh"));
		System.out.println("Index place = "+ name.indexOf("e"));
		System.out.println("Last index = "+ name.lastIndexOf("i"));
		System.out.println("Replace Char = "+ name.replace("v", "b"));
		System.out.println("Replace AllChar = "+ name.replaceAll ("n","j"));
		System.out.println("Lowecase = "+ name.toLowerCase());
		System.out.println("Uppercase = "+ name.toUpperCase());
		System.out.println("StartsWith = "+ name.startsWith("Ranveer")); // provide Boolean Value
		System.out.println("Ends With = "+ name.endsWith("Rana"));    // provide Boolean Value
		System.out.println("Substring = "+ name.substring(7));

}
}

