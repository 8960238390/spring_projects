package exercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class TempTest {

	public void m2() {
		System.out.println("m1 method call");
	}

	public static void main(String[] args) {

		/*
		 * TempTest obj = new TempTest();
		 * 
		 * I1 i = obj::m2; i.m1();
		 */

		/*
		 * ArrayList<Integer> al1 = new ArrayList<>(); al1.add(10); al1.add(5);
		 * al1.add(6); al1.add(5); al1.add(20); al1.add(13);
		 * 
		 * List<Integer> al2 = al1.stream().filter(i -> i>=10).map(i ->
		 * i*2).collect(Collectors.toList());
		 * 
		 * 
		 * 
		 * System.out.println(al1); System.out.println(al2);
		 */
		
		
		int[] i = {5,4,2,9,7,6,3};
		List<int[]> asList = Arrays.asList(i);
		List<int[]> collect = asList.stream().sorted().collect(Collectors.toList());
		
		//collect.forEach(i1 -> System.out.println(i1));
		System.out.println(asList);
	}
}

interface I1 {
	public void m1();
}
