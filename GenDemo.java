class Gen<T>
{
  T ob;

  Gen(T O)
  { 
    ob = O;
  }

  T getob()
  {
    return ob;
  }

  void showType()
  {
    System.out.println("Type of T is:" + ob.getClass().getName());
  }
}


class GenDemo {
	public static void main(String args[]){
	 Gen<Integer>iob;
	 iob = new Gen<Integer>(45);
	 iob.showType();
	 int i = iob.getob();
	 System.out.println("AutoUnboxed value i is: " + " " + i);

	 Gen<Double>dob;
	 dob = new Gen<Double>(100.0);
	 dob.showType();
	 double d = dob.getob();
	 System.out.println("AutoUnboxed value d is: " + " " + d);

	 Gen<String>sob;
	 sob = new Gen<String>("Pradeep G");
	 sob.showType();
	 String s = sob.getob();
	 System.out.println("AutoUnboxed value s is: " + " " + s);
	}
}