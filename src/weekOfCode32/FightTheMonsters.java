package weekOfCode32;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class FightTheMonsters {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		double h = scan.nextInt();
		int t = scan.nextInt();
		ArrayList<Integer> health = new ArrayList<>();

		for (int i = 0; i < n; i++) {
			int item = scan.nextInt();
			health.add((int) Math.ceil(item / h));
		}

		Collections.sort(health);

		for (int j = 0; j < health.size(); j++) {
			int val = health.get(j);
			if (val <= t) {
				t = t - val;
				health.remove(j);
				health.add(j, 0);
			}
		}

		int count = 0;
		for (Integer integer : health) {
			if (integer == 0)
				count++;
			else
				break;
		}
		System.out.println(count);
	}

}
