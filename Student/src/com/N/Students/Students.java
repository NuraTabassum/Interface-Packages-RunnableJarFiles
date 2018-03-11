package com.N.Students;

import com.N.HumanBeings.HumanBeings;



import java.util.ArrayList;

public class Students extends HumanBeings  {
	 String ArtStudents;
	 String ComputerStudents;
	public Students(String ArtStudents,String ComputerStudents){
		 
			this. ArtStudents=ArtStudents;
			this.ComputerStudents= ComputerStudents;
			 
		 }
	public void ListofStudents(){
		//Create 2 constructor objects
		Students obj1=new Students("ArtStudent1","ComputerStudent1");
		Students obj2=new Students("ArtStudent2","ComputerStudent2");
		ArrayList<Students> stList=new ArrayList<Students>();
		//generic class == Student Class
		//now add Student objects to arraylist
		stList.add(obj1);
		stList.add(obj2);
		//display data using arraylist
		for(Students ob:stList){
			System.out.println("Students:");
			System.out.println("ArtStudents: "+ob.ArtStudents);
			System.out.println("ComputerStudents :"+ob.ComputerStudents);
			System.out.println("............");
			
		}
	}
		

		public String getArtStudent() {
			return ArtStudents;
		}

		public void setArtStudent(String artStudent) {
			ArtStudents = artStudent;
		}

		public String getComputerStudent() {
			return ComputerStudents;
		}

		public void setComputerStudent(String computerStudent) {
			ComputerStudents = computerStudent;
		}}