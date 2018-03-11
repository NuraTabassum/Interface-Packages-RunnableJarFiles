package JavaSession10HomeWork;

import java.util.ArrayList;


public class Bikes extends Vehicles implements IGears{

	
@Override
	public void ListOfVehicles(){
		ArrayList<String>bike=new ArrayList<String>(3);
		bike.add("b1");
		bike.add("b2");
		bike.add("b3");
		//int i = 0;
		//for(String s:bike)
		for(int i=0;i<bike.size();i++){
			System.out.println((i+1)+". "+bike.get(i)+" is a bike");
			}}


@Override
public void NumberOfGear(int number) {
	
	ArrayList<Integer>bikegearlist=new ArrayList<Integer>();
	bikegearlist.add(5);
	bikegearlist.add(3);
	bikegearlist.add(6);

	//for(Integer g:bikegearlist)
	for(int i=0;i<bikegearlist.size();i++){
		//System.out.println(bikegearlist);
		if(bikegearlist.get(i)> number){
			System.out.println("Bike " +(i+1)+". has "+bikegearlist.get(i)+" gears");
		}
	
}}}


