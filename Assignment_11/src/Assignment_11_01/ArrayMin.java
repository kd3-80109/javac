package Assignment_11_01;

public class ArrayMin {

	public static void main(String[] args) {
		FindMin am = new FindMin();
		Integer arr[] = {50,20,40,10,30};
		
		Integer i = am.FindMin(arr);
		System.out.println("arr="+i);
	}

}
