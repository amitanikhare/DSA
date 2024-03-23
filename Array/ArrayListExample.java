package arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);

		ArrayList<Integer> list = new ArrayList<>();
		for(int i = 0 ; i < 5 ; i++) {
			list.add(in.nextInt());
		}
		for(int i = 0 ; i< 5 ; i++) {
			System.out.println(list.get(i));//pass index here , list[index] not work here
		}
		System.out.println(list);
	}

}
