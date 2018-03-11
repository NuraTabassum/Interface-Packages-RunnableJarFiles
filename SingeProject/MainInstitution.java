package JavaSession10HomeWork;

import java.util.ArrayList;
import java.util.Collection;


public class MainInstitution {

	

	public static void main(String[] args) {
		Bikes bikes= new Bikes();
		Cars cars=new Cars();
		Vehicles ve=new Vehicles();
		Students s=new Students(null, null);
		//ArtStudent a=new ArtStudent();
		//ComputerStudents c=new ComputerStudents();
		Staffs st= new Staffs();
		Professors p=new Professors(1500,2000,3000);
		HumanBeings h=new HumanBeings();
		ArrayList<Vehicles>vehiclesList=new ArrayList<Vehicles>();
		ArrayList<IGears>gear=new ArrayList<IGears>();	
		
		
		vehiclesList.add(bikes);
		vehiclesList.add(cars);
		for(Vehicles v: vehiclesList){
			v.ListOfVehicles();}
		gear.add(bikes);
		gear.add(cars);
		for(IGears g:gear){
			//System.out.println(bikegearlist);
			g.NumberOfGear(4);
		}
		ArrayList<HumanBeings> beingList=new ArrayList<HumanBeings>();
			beingList.add(st);
			beingList.add(s);
			beingList.add(p);
			for(HumanBeings h1: beingList){
			h1.AddStudents();
			h1.ListofStudents();
			}
			ArrayList<IEmployees>employee=new ArrayList<IEmployees>();
			employee.add(p);
			employee.add(st);
			for(IEmployees e:employee){
				e.employeeSalary(2000);
			}
		
			
			
			
	
		
			

	}}


