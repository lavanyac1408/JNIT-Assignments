class Library1{
	int library1_year;
	int library1_pincode;
	
	(int x, int y){
	library1_year=x;
	library1_pincode=y;
}
	void display() {
		System.out.println("Library1 year="+library1_year);
		System.out.println("Library1 id="+library1_pincode);
	}
}
public class ParameterizedConstructor2 {

	public static void main(String[] args) {
		Library1 book=new Library1(2001,421301);
		book.display();
		Library1 book=new Library1(2005,405278);
		book.display();
	}
}
