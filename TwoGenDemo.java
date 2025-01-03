class TwoGen<T,V>
{
  T ob1;
  V ob2;

  TwoGen(T O1, V O2)
  { 
    ob1 = O1;
    ob2 = O2;
  }

  T getob1()
  {
    return ob1;
  }
  V getob2()
  {
    return ob2;
  }

  void showType()
  {
    System.out.println("Type of T is: " + ob1.getClass().getName());
    System.out.println("Type of V is: " + ob2.getClass().getName());
  }
}


class TwoGenDemo {
	public static void main(String args[]){
	 TwoGen<Integer,String>tgobj;
	 tgobj = new TwoGen<Integer,String>(45,"Pradeep G");
	 tgobj.showType();
	 int i = tgobj.getob1();
	 System.out.println("AutoUnboxed value is: " + " " + i);
	 String s1 = tgobj.getob2();
	 System.out.println("AutoUnboxed value is: " + " " + s1);

	 TwoGen<Double,String>tgobj1;
	 tgobj1 = new TwoGen<Double,String>(45.05,"Pradeep G");
	 tgobj1.showType();
	 double d = tgobj1.getob1();
	 System.out.println("AutoUnboxed value is: " + " " + d);
	 String s2 = tgobj1.getob2();
	 System.out.println("AutoUnboxed value is: " + " " + s2);
	}
}