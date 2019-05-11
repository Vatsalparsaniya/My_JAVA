class Pmobile{
	int screenSize;
	int cost;
	int memory;
	Pmobile(int x,int y, int z){
		screenSize = x;
		cost = y;
		memory = z;			
	}
	void display(){
		System.out.println("Cost of mobile: " + cost + ", inter memory: " + memory + ", Screen size: " + screenSize );
	}
}

class Cmobile extends Pmobile{	
	String extra;
	Cmobile(int x ,int y, int z ,String  extra){
		super(x,y,z);
		this.extra = extra;
	}

	void display(){
		super.display();
		System.out.println("Cost of mobile: " + cost +", inter memory: " + memory + ", Screen size: " + screenSize + ", Extra future: "+ extra);
	}

	public static void main(String args[]){
		Cmobile ob = new Cmobile(20,20000,64,"dual camera");
		ob.display();
	}
}