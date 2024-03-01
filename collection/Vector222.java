package collection;

import java.util.Collections;
import java.util.Vector;

public class Vector222{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector a1 =new Vector();
		a1.add("sss");
		a1.add("keerthi");
		a1.add(null);
		a1.add(null);
		a1.add(55);//in vector heterogeneous accepted,null is  accepting, following indexing,dupicated acce
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


