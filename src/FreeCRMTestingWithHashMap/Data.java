package FreeCRMTestingWithHashMap;

import java.util.HashMap;

public class Data {
	
	
	public static HashMap<String, String> getUserLoginInfo() {
		HashMap<String , String > userMap = new HashMap<String , String >();
		userMap.put("customer", "Ravikumar@9999_test@9999");
		userMap.put("admin", "Ravikumar@9999_test@9999");
		
		return userMap;
	}
	
	
	
	public static HashMap<Integer, String> monthMap() {
		HashMap<Integer , String > monthMap = new HashMap<Integer , String >();
		monthMap.put(1, "January");
		monthMap.put(2, "February");
		monthMap.put(3, "March");
		monthMap.put(4, "April");
		monthMap.put(5, "May");
		monthMap.put(6, "June");
		monthMap.put(7, "July");
		monthMap.put(8, "August");
		monthMap.put(9, "September");
		monthMap.put(10, "October");
		monthMap.put(11, "November");
		monthMap.put(12, "December");
		
		return monthMap;
	}

	
	public static HashMap<Integer, String> dayMap() {
		HashMap<Integer , String > dayMap = new HashMap<Integer , String >();
		dayMap.put(1, "Sunday");
		dayMap.put(2, "Monday");
		dayMap.put(3, "Tuesday");
		dayMap.put(4, "Wednesday");
		dayMap.put(5, "Thursday");
		dayMap.put(6, "Friday");
		dayMap.put(7, "Saturday");
		
		
		return dayMap;
	}
	
}
