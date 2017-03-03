public class ex3{
	public static void main(String[] args) {
		int avg = 0;
		avg = average(2,5);
		System.out.println(avg);

		avg = average(2,5,6,9,12);
		System.out.println(avg);
	}
	private static int average(int... nums){
		int total = 0;
		for (int no : nums) {
			total += no;
		}
		return total/nums.length;
	}
}