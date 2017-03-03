public class ex1{
	public static void main(String[] args) {
		int a = 10;
		int b = 12;
		int c = sum(a,b);
		System.out.println(c);
		System.out.println(a);
	}
	private static int sum(int x,int y){
		x+=10;
		int z = x + y;
		System.out.println(y);
		return z;
	}
}