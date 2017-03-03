public class ex5{
	public static void main(String[] args) {
		greet(2);
		return ;
	}
	private static void greet(int count){
		if (count == 0) {
			System.out.println("over");
		}
		else{
			System.out.println("Hi");
			System.out.println("Bye");
			greet(count-1);
		}
	}
}