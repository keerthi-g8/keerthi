package collection;

import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.LinkedList;

public class Linkedlist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList a1 =new LinkedList();
		a1.add("sss");
		a1.add("keerthi");
		a1.add("null");
		a1.add("null");
	a1.add(55);//in linkedlist  heterogeneous accepted,null is  acceptingonly once,not following indexing,dupicated not acce
		a1.add("sss");
		a1.add("keerthi");
		a1.add(null);
		a1.add(null);
		a1.add(55);
		a1.add(66);
		Collections.sort(a1);
		System.out.println(a1);

	}

}
