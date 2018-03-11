package JavaSession10HomeWork;

import java.util.ArrayList;

public class Cars extends Vehicles implements IGears{
	public void ListOfVehicles(){
		ArrayList<String>car=new ArrayList<String>(3);
		car.add("c1");
		car.add("c2");
		car.add("c3");
		int i = 0;
		for(String s:car)
			System.out.println((i+1)+". "+car.get(i)+" is a car");}

	@Override
	public void NumberOfGear(int number) {
		
		
	}

	

}
