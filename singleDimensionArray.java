
public class singleDimensionArray {

	public static void main(String[] args) {
		int [] number;      //declaration of array
		number = new int [10];   //construction of array with given size
		
		//intialization of array
		number [0] = 11;
		number [1] = 22;
		number [2] = 33;
		number [3] = 44;
		number [4] = 55;
		number [5] = 66;
		number [6] = 77;
		number [7] = 88;
		number [8] = 99;
		number [9] = 100;
		
		//printing values from array
		for (int i = 0; i <number.length; i++)
			System.out.println(number[i]);
	}

}
