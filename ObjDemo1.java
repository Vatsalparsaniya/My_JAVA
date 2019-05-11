class ObjDemo1{

	int x,y,z;


	
	public static void main(String args[]){
		ObjDemo1 obj1 = new ObjDemo1();
		obj1.x  = 10;
		obj1.y  = 20;
		obj1.add();
		obj1.sub();
		obj1.mul();

		ObjDemo1 obj2 = new ObjDemo1();
		obj2.x  = 200;
		obj2.y  = 100;
		obj2.add();
		obj2.sub();
		obj2.mul();

		ObjDemo1 obj3 = new ObjDemo1();
		obj3.x  = 700;
		obj3.y  = 300;
		obj3.add();
		obj3.sub();
		obj3.mul();

		ObjDemo1 obj4 = new ObjDemo1();
		obj4.x  = 5000;
		obj4.y  = 2000;
		obj4.add();
		obj4.sub();
		obj4.mul();

		ObjDemo1 obj5 = new ObjDemo1();
		obj5.x  = 5000;
		obj5.y  = 250;
		obj5.add();
		obj5.sub();
		obj5.mul();
	}

	void add(){
		z = x+y;
		System.out.println(z);
	}
	void mul(){
		z = x*y;
		System.out.println(z);
	}
	void sub(){
		z = x-y;
		System.out.println(z);
	}
}