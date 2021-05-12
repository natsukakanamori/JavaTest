package jp.co.aforce.test;

import java.util.ArrayList;
import java.util.Calendar;
/*②を使用するのが適切である。equalsは、参照データ型の文字列比較をするときに使用する。今回はStiring型であるためequalsを使用するのが適切である。*/

public class PracticeTest4 {
	public static void main(String[] args) {
		ArrayList<String> animals = new ArrayList();
			animals.add("犬");
			animals.add("猫");
			animals.add("うさぎ");
			animals.add("へび");

		String rabbit = "うさぎ";
			if (animals.contains(rabbit)) {
				System.out.println( rabbit +"はリストに含まれています");
			}else {
				System.out.println( rabbit +"はリストに含まれていません");
			}

			Calendar calendar = Calendar.getInstance();
			calendar.set(2020,7,12,11,33,50);
			calendar.get(Calendar.MONTH);
			int myBirthDay = calendar.get(Calendar.MONTH);

			if  (myBirthDay ==7) {
				System.out.println("山の日");
			}else {
				System.out.println("こちらになるはずはない");
			}
			/*swich文だと自分の誕生月を定義した変数の型(int)とそれぞれのcaseに書く文の型(string)が合わなかったため。
			 * 例）自分の誕生月を定義した変数
			 * int myBirthDay = calendar.get(Calendar.MONTH);
			 * それぞれのCaseに書く文
			 * 		case 1:
						myBirthDay = "山の日"; (左辺はintで右辺はStringになってしまっている)*/
	}
}
