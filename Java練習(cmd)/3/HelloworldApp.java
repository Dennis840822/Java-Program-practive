import java.io.Console;
public class HelloworldApp{
	public static void main(String[] args) {
		System.out.println("Hellow world!");
		Console console = System.console();
		System.out.print("UserName:");
		String name = console.readLine();
		char[] password = console.readPassword("Password:");
		console.printf("Welcome! " + name + "\n");
		System.out.println("Your Password is" + new String(password));
		int a = 1,b = 1;
		int c = 0;
		c = one(a,b);
		System.out.print(one(a,b));
	}

	private static int one(int a,int b){
		int c = 0;
		c = a + b ;
		return c;
	}
}
