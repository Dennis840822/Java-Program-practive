import java.io.Console;
public class ex{
	public static void main(String[] args) {
		ConsoleReader console = new ConsoleReader(System.in);
		System.out.print("Input a:");
		int a = console.readInt();
		System.out.print("Input b:");
		int b = console.readInt();
		int c = sum(a,b);

		System.out.println("total is " + c);
	}

	private static int sum(int a,int b){
		int z = a + b;
		return z;
	}
}