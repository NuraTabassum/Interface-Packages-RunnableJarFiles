package JavaSession10HomeWork;

import java.util.*;

public class Vehicles {
	 public String Bikes;
	 public String Cars;
	
	 public Vehicles (String Bikes, String Cars) {
	
	 
		 this.Bikes=Bikes;
		 this.Cars= Cars;
		 
	 }
	 public void ListOfVehicles() {
			System.out.println("The Vehicles List");
		}
	 public Vehicles(){
		 
	 }
	public String getBikes() {
		return Bikes;
	}
	public void setBikes(String bikes) {
		Bikes = bikes;
	}
	public String getCars() {
		return Cars;
	}
	public void setCars(String cars) {
		Cars = cars;
	}
	
		

}
