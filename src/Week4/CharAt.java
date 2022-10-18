package Week4;

public class CharAt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StringBuilder fullName = new StringBuilder("Sam");
		fullName.append(" Smith");
		System.out.println(fullName.toString());
		
		System.out.println(fullName.reverse());
		
		System.out.println(fullName.indexOf("it"));
		System.out.println(fullName.replace(4, 9, "Thompson"));
		System.out.println(fullName.charAt(5));
		System.out.println(fullName.deleteCharAt(5));
		
		
		
		
	}

}
