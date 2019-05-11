class MobileP{
	String display;
	int cost;
	int cameraPixel;
	boolean selfiCamera;

	void smartPhone(){
		display = normal;
		cost 	= 5000;
		cameraPixel = 2;
		selfiCamera = no;
	}

	void display(){
		System.out.println("Display: "+ display + ", Cost: "+ cost + ", CameraPixel: "+ cameraPixel + ", SelfiCamera: "+ selfiCamera );

}

class MobileC extends MobileP{
	void smartPhone(){
		display = oled;
		cost 	= 15000;
		cameraPixel = 23;
		selfiCamera = yes;
		String memory = 23GB;
	}

	void display(){
		System.out.println("Display: "+ display + ", Cost: "+ cost + ", CameraPixel: "+ cameraPixel + ", SelfiCamera: "+ selfiCamera + ", Memory: "+ memory);
	}

}

class Mobile{
	public static void main(){

	}
}
