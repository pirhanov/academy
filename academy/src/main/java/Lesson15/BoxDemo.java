package Lesson15;

import java.util.ArrayList;
import java.util.Arrays;


public class BoxDemo {
	
	public static void main(String[] args) {

		ArrayList<HeavyBox> list = new ArrayList<HeavyBox>();
		HeavyBox box1 = new HeavyBox(5, 8, 7, 7);
		HeavyBox box2 = new HeavyBox(1, 2, 8, 2);
		HeavyBox box3 = new HeavyBox(1, 0, 2, 10);
		list.add(box1);

		list.add(box2);
		list.add(box3);

		for (HeavyBox b : list) {

			System.out.println(b);
		}

		list.get(0).setWeight(1);

		System.out.println(list.get(0));
		list.remove(list.size() - 1);
		System.out.println(list);
		HeavyBox[] array = new HeavyBox[list.size()];
		list.toArray(array);
		
		System.out.println(Arrays.toString(array));
		list.clear();
		System.out.println(list);
	}

}
