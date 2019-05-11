class Max{
	public static void main(String args[]){
		int i,j,k;
		i=2;
		j=3;
		k=3;

		if(i>j && (i>k)
		System.out.println("I is bigger");
		else if (j>i && j>k)
		System.out.println("J is bigger");
		else if (k>i && k>j)
		System.out.println("K is bigger");
		else if (i==j || j==k || i==k)
		System.out.println("Max is Two numbers");
		else
		System.out.println("All are samw");
}
}