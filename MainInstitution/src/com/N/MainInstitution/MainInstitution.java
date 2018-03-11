package com.N.MainInstitution;

import java.util.ArrayList;


import com.N.HumanBeings.HumanBeings;
import com.N.Interfaces.IEmployees;
import com.N.Interfaces.IGears;
import com.N.Professors.Professors;
import com.N.Staffs.Staffs;
import com.N.Students.Students;
//import com.N.Tekarch.TekArchLibrary;
import com.google.TekArch.TekArchLibrary;




/*import JavaSession10HomeWork.Bikes;
import JavaSession10HomeWork.Cars;
import JavaSession10HomeWork.HumanBeings;
import JavaSession10HomeWork.IEmployees;
import JavaSession10HomeWork.IGears;
import JavaSession10HomeWork.Professors;
import JavaSession10HomeWork.Staffs;
import JavaSession10HomeWork.Students;
import JavaSession10HomeWork.Vehicles;*/

public class MainInstitution {

	public static void main(String[] args) {
	
		/*Bikes bikes= new Bikes();
		Cars cars=new Cars();
		Vehicles ve=new Vehicles();*/
		//ArtStudent a=new ArtStudent();
	   // ComputerStudents c=new ComputerStudents();
		Students s=new Students(null, null);
		Staffs st=new Staffs();
		Professors p1=new Professors(0,0,0);
		Professors p2=new Professors(null, null);
		HumanBeings h=new HumanBeings();
		/*ArrayList<Vehicles>vehiclesList=new ArrayList<Vehicles>();
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
		}*/
		ArrayList<HumanBeings> beingList=new ArrayList<HumanBeings>();
			beingList.add(st);
			beingList.add(s);
			//beingList.add(p1);
			beingList.add(p2);
			for(HumanBeings h1: beingList){
		//	h1.AddStudents();
			h1.ListofStudents();
			h1.ListOfProfessors();
			}
			ArrayList<IEmployees>employee=new ArrayList<IEmployees>();
			employee.add(p1);
			employee.add(st);
			for(IEmployees e:employee){
				e.employeeSalary(2000);
			}
		
			
			
	TekArchLibrary tekarch=new TekArchLibrary();
	tekarch.printStatement(args[0]);
	//tekarch.printStatement(args[0], Integer.valueOf(args[1]));
	
	
		
			

	}
	}


