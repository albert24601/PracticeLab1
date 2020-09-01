
public class Test2 {

	public static void main(String[] args) {
	Date d1 = new Date(8, 27, 2020); 
	Date d2 = new Date(10, 26, 2020);
	Date d3 = new Date(11 ,30, 2020);
	Date d4 = new Date(12, 14, 2020);

	
	if(d1.compareTo(d2) == 1) {
		System.out.println(d1 + " is later than " + d2);
		
	}
	else if(d1.compareTo(d2) == -1) {
		System.out.println(d1 + " is earlier than " + d2);
		
	}
	else {
		System.out.println(d1 + " and " + d2 + " are the same dates");
	}
	}

}
