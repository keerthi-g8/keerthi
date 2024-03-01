package type_casting;
class class4
{
	void div()
	{
		System.out.println("div");
	}

}
class class3 extends class4
{
	void mul()
	{
		System.out.println("mul");
	}
}
class class2 extends class3
{
	void add()
	{
		System.out.println("add");
	}
}

public class Assignment extends class2 {
	
	
		 void sub()
		{
			System.out.println("sub");
		}

	public static void main(String[] args)
	{
		
     class4 c4= new class3();//upcast c3 to c4
     c4.div();
     class3 c3=(class3)new class2();//in order to downcast first it should be upcasted//explicit way
      c3.mul();//c2 is upcasted to c3
      c3.div();//since c3 is upcasted to c4
      class2 c2=(class2)c3;//downcasted  c3 to c2
      c2.add();
      c2.div();
      c2.mul();
      
    
	}

	}
	
