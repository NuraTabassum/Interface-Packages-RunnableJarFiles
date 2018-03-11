package com.N.Professors;

import java.util.ArrayList;

import com.N.HumanBeings.HumanBeings;
import com.N.Interfaces.IEmployees;




public class Professors extends HumanBeings implements IEmployees {
	String ArtProfessors;
	String ComputerProfessors;
	
	int ArtProfSalary;
	 int ComputerProfSalary;
	 int ComputerProfSalary1;
	
	
		
	 public Professors(int ArtProfSalary,int ComputerProfSalary,int ComputerProfSalary1){
		 
			this. ArtProfSalary= ArtProfSalary;
			this.ComputerProfSalary=ComputerProfSalary;
			this.ComputerProfSalary1=ComputerProfSalary1;
			 
		 }
	 public Professors(String ArtProfessors,String ComputerProfessors){
		 this.ArtProfessors=ArtProfessors;
		 this.ComputerProfessors=ComputerProfessors;
	 }
		

		
		public double getArtProfSalary() {
			return ArtProfSalary;
		}



		public void setArtProfSalary(int artProfSalary) {
			ArtProfSalary = artProfSalary;
		}



		public double getComputerProfSalary() {
			return ComputerProfSalary;
		}



		public void setComputerProfSalary(int computerProfSalary) {
			ComputerProfSalary = computerProfSalary;
		}



		@Override
		public void employeeSalary(int salary) {
			Professors p1=new Professors(1500,2000,2700);
			Professors p2=new Professors(1200,2500,3000);
			Professors p3=new Professors(1700,1900,2000);
				ArrayList<Professors>ps=new ArrayList<Professors>();
				ps.add(p1);
				ps.add(p2);
				ps.add(p3);	
				//int i=0;
				for(Professors q:ps){
		
				if((q.ArtProfSalary)>=(salary)){
					System.out.println("Salary of Art Professors is "+q.ArtProfSalary);
				}
					
			if ((q.ComputerProfSalary)>=(salary)){
				System.out.println("Salary of Computer Professors is "+q.ComputerProfSalary);
			}
			if ((q.ComputerProfSalary1)>=(salary)){
				System.out.println("Salary of Computer Professors is "+q.ComputerProfSalary1);
			}
				}
				
					System.out.println();}
	public void ListOfProfessors(){
		Professors pr=new Professors("ArtProfessors1","ComputerProfessors1");
		Professors pr1=new Professors("ArtProfessors2","ComputerProfessors2");
		ArrayList<Professors> prList=new ArrayList<Professors>();
		prList.add(pr);
		prList.add(pr1);
		for(Professors pf:prList){
			System.out.println("Professors:");
			System.out.println("ArtProfessors: "+pf.ArtProfessors);
			System.out.println("ComputerProfessors :"+pf.ComputerProfessors);
			System.out.println("............");
			
		}
	}
}
	