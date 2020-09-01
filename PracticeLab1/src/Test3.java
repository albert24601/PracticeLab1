import java.util.Map;
import java.util.TreeMap;

public class Test3 {

	public static void main(String[] args) {
		Date d1 = new Date(10, 22, 2002); 
		Date d2 = new Date(9, 9, 2020);
		Date d3 = new Date(9, 8, 2002);
		Date d4 = new Date(12, 3, 2020);

		
		TreeMap<Date, String> syllabus = new TreeMap();
		syllabus.put(d1, "Lesson 1");
		syllabus.put(d2, "Lesson 2");
		syllabus.put(d3, "Lesson 3");
		syllabus.put(d4, "Lesson 4");
		
		for(Map.Entry<Date, String> topic : syllabus.entrySet()) {
			if (topic.getKey().month == 9 && topic.getKey().year == 2002) {
			System.out.println(topic.getValue());
		}
			else {
				System.out.println(topic.getValue() + );
			}
		
	}

}
}
