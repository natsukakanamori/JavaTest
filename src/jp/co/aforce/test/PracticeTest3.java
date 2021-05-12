package jp.co.aforce.test;

import java.util.HashSet;

public class PracticeTest3 {
	public static void main(String[] args) {
		String[] tanakaTaro = {"1","田中太郎","男性","27"};
			System.out.println(tanakaTaro[1]);

		Employee employee = new Employee();
		HashSet<String>employees = new HashSet<>();
		employees.add(employee.getEmployee());


		for (String employee : employees) {
			System.out.println(employee);
		}
	}
}
