package jp.co.aforce.test;


public class PracticeTest1 {
	private static final double TAX = 0.1;

	public static void main(String[] args) {
		System.out.println(TAX);

		int x = 480;
		double price = (x*(1+TAX));
			System.out.println("この商品の値段は" + price + "円です");

		String name = "金森夏香";
			System.out.println(name);
	}
}
