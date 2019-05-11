//Example of dynamic method dispatch
class Human{
	void display(){
		System.out.println("I'm in Human");
	}
}

class Boy extends Human{
	void display(){
		System.out.println("I'm in Boy");
	}	

	public static void main(String args[]){
		Human ob = new Human();
		ob.display();
		Human obj = new Boy();
		obj.display();
	}
}