package Basics;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class ArrayClass {

	List<Integer> array = new ArrayList<Integer>();

	void initializeArray() {
		for (int i = 0; i < 8; i++) {
			array.add((int) (Math.random() * 100));
		}

		for (int i = 0; i < 8; i++) {
			System.out.println(array.get(i));
		}
		
		
	}

	// get min
	// get max
	// get sum
	// get avaerage
	// get even
	// get odd
	// get elements greater than 50

	int getMin() {
		return array.stream().mapToInt(v -> v).min().getAsInt();
//		
//		if (array.isEmpty())
//			return 0;
//
//		int minNum = array.get(0);
//
//		for (int i = 1; i < array.size(); i++) {
//			if (minNum > array.get(i)) {
//				minNum = array.get(i);
//			}
//		}
//
//		return minNum;

	}

	int getMax() {
		return array.stream().mapToInt(v -> v).max().getAsInt();
//		if (array.isEmpty())
//			return 0;
//		int maxNum = array.get(0);
//
//		for (int i = 1; i < array.size(); i++) {
//			if (maxNum < array.get(i)) {
//				maxNum = array.get(i);
//			}
//		}
//
//		return maxNum;
	}

	int getSum() {
		return array.stream().mapToInt(v -> v).sum();
//		int sum = 0;
//		for (int i = 0; i < array.size(); i++) {
//			sum = sum + array.get(i);
//		}
//		return sum;
	}

	int getAvg() {
		return (int)array.stream().mapToInt(v -> v).average().getAsDouble();
//		int result = getSum() / array.size();
//		return result;
	}

	List<Integer> getEven() {
		 List<Integer>list=array.stream().filter(x -> x % 2 == 0).collect( Collectors.toList());
//  	List<Integer> list = new ArrayList<Integer>();
//		for (int i = 0; i < array.size(); i++) {
//			if (array.get(i) % 2 == 0) {
//				list.add(array.get(i));
//			}
//		}
//
//		return list;
		 List<Integer>list1=list.stream().sorted().collect(Collectors.toList());
		return list1;
	}

	List<Integer> getOdd() {
		List<Integer> list2 = new ArrayList<Integer>();
		for (int i = 0; i < array.size(); i++) {
			if (array.get(i) % 2 != 0) {
				list2.add(array.get(i));
			}
		}
		return list2;
	}

	List<Integer> getGreaterThen(int num) {
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < array.size(); i++) {
			if (array.get(i) > num) {
				list.add(array.get(i));
			}
		}
		return list;
	}

}