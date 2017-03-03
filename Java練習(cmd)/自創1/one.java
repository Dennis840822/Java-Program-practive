public class one{
	public static void main(String[] args) {
		int a = 0;
		/*for (a = 0;a <= 100 ;a++ ) {
			a += a;
		}*/
		System.out.print(two(a));
	}
	private static int two(int a){
		for (a = 0;a <= 100 ;a++ ) {
			a += a;
		}
		return a;
	}
}