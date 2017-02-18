package rookieRank2;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeMap;

public class MigratoryBirds {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		Map<Integer, Integer> map = new TreeMap<Integer, Integer>();

		for (int i = 0; i < t; i++) {
			int n = scan.nextInt();

			if (map.containsKey(n)) {
				Integer val = map.get(n);
				val++;
				map.replace(n, val);
			} else
				map.put(n, 1);
		}

		int maxVal = 0;
		int maxKey = 0;

		for (Entry<Integer, Integer> entry : map.entrySet()) {
			int key = entry.getKey();
			int val = entry.getValue();

			if (maxVal < val) {
				maxVal = val;
				maxKey = key;
			}
		}
		System.out.println(maxKey);
	}

}
