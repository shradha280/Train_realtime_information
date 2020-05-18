package Current_train_information;

import java.util.ArrayList;
import java.util.List;

public class train_datautil {

	public static List<Train_class> gettrain() {
	
		// create an empty list
		List<Train_class> train = new ArrayList<>();
		 
		// add sample data
		train.add(new Train_class("Indian_express", 12,"5 "," 10 Minutes prior to the current time, So Take your seats", "Located at the Lane 2"));
		train.add(new Train_class("Indian_railway",14,"7"," 18 Minutes prior to the current time,", "Located at the Lane 5"));
		train.add(new Train_class("Rajdhani_express",16, "8"," 13 M minutes prior to the current time, So hurry up", "Located at the Lane 1"));
		
		// return the list
		return train;
	}
}







