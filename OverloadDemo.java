class OverloadDemo{
	int add(int x, int y){
		return x+y;
	}

    int add(int x, int y, int z){
		return x+y+z;
	}

	float add(float x,float y){
		return x+y;
	}

    double add(float x,int y){
    	return x+y;
    }

	String add(String fName,String mName,String lName){
        return fName+mName+lName;
    }
	public static void main(String args[]){
        OverloadDemo obj = new OverloadDemo();
        System.out.println(obj.add(10,20));
        System.out.println(obj.add(10.20f,20.10f));
        System.out.println(obj.add(10.00f,20));
        System.out.println(obj.add(10,20,30));
        System.out.println(obj.add("Bhautik ","J. ","Donga"));

	}
}
