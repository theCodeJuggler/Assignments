package in.com.abcinc.parking;

public class RMallPark {

	public static void main(String[] args)
	{		
		int token;
		
		//instantiang the class and calling the constructor
		Parked_CarOwner_Details pl = new Parked_CarOwner_Details("Ram","Kolkata","1234567890","Kwid","WB123456");
		Parked_CarOwner_Details pl1 = new Parked_CarOwner_Details("Shyam","Mumbai","1234789056","Alto","MH345612");
		Parked_CarOwner_Details pl2 = new Parked_CarOwner_Details("Jodhu","Bangalore","34789056102","WagonR","KN345612");
		Parked_CarOwner_Details pl3 = new Parked_CarOwner_Details("Madhu","Pune","1789056","Sumo","MH361245");
		Parked_CarOwnerList ol = new Parked_CarOwnerList();
		
		//calling the add function and displaying the token number of each addition
		System.out.println(ol.add_new_car(pl));
		System.out.println(ol.add_new_car(pl1));
		System.out.println(ol.add_new_car(pl2));
		System.out.println(ol.add_new_car(pl3));
		
		/*pl.setOwnerName("Ram");
		pl.setOwnerAddress("Kolkata");
		pl.setOwnerMobileNo("1234567890");
		pl.setCarModel("Kwid");
		pl.setCarNO("WB123456");
		token = ol.add_new_car(pl);
		System.out.println("The Parking Number Is :: "+token);
		
		pl.setOwnerName("Shyam");
		pl.setOwnerAddress("Mumbai");
		pl.setOwnerMobileNo("1234789056");
		pl.setCarModel("Alto");
		pl.setCarNO("MH345612");
		token = ol.add_new_car(pl);
		System.out.println("The Parking Number Is :: "+token);
		
		pl.setOwnerName("Jodhu");
		pl.setOwnerAddress("Bangalore");
		pl.setOwnerMobileNo("1789056");
		pl.setCarModel("Alto");
		pl.setCarNO("KN345612");
		token = ol.add_new_car(pl);
		System.out.println("The Parking Number Is :: "+token);
		
		pl.setOwnerName("Madhu");
		pl.setOwnerAddress("Pune");
		pl.setOwnerMobileNo("34789056102");
		pl.setCarModel("Alto");
		pl.setCarNO("MH361245");
		token = ol.add_new_car(pl);
		System.out.println("The Parking Number Is :: "+token);*/
		
		//location of the specific car in the parking lot
		System.out.println(ol.get_parked_car_location(2));
		
		//removing the car and displaying the resultant list
		ol.remove_car(2);
	}

}
