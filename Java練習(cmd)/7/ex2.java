public class ex2{
	public static void main(String[] args) {
		int[] a = {10,12,20};
		int c = sum(a);
		System.out.println(c);
		System.out.println(a[2]);
	}
	private static int sum(int[] x){
		x[2] += 10;
		int z = x[0] + x[1] + x[2];
		System.out.println(x[2]);
		return z;
	}
}