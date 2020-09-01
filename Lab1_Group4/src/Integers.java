import java.util.ArrayList;

public class Integers {
ArrayList <Integer > nums = new ArrayList();

static int computeSum(ArrayList<Integer> sample) {
	int sum = 0;
	 for(int num : sample) {
		 sum+= num;
	 }
	 return sum;
	
}
}
