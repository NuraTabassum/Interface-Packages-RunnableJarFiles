package JavaSession10HomeWork;

import java.util.ArrayList;

public class Students extends HumanBeings {
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
		}
		/*public  void AddStudents(){
			
			 Students s=new Students();
			Students ComputerStudents=	new Students();
			 ArrayList<Students> stList=new ArrayList<Students>();
			
			 stList.add(Artstudents);
			 stList.add(ComputerStudents);
		    int i=0;
			 //for(int i=0;i<stList.size();i++){
				 System.out.println("Students in the college are \n"+stList.get(i).ArtStudent+"\n"+stList.get(i).ComputerStudent);
				 //System.out.println("Students in the college are "+stList.get(i).ComputerStudent);
			 }*/
				 
	 
	 /*public Students() {
			this.name = name;
		}
	//public void ListofStudents(){ 
	 
	 ArrayList<Students> stList=new ArrayList<Students>();
	
	
	 
	 
	/* public boolean addTeam(Students student) {
			if (stList.contains(student)) {
				return false;
			} else
				stList.add(student);

			return true;
		}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ArrayList<Students> getStList() {
		Students s=new Students();
		Students s1=new Students();
		s.setName("ArtStudents");
		s1.setName("ComputerStudents");
		stList.add(s);
		stList.add(s1);
	System.out.println("The list of Students in the college are: "+getStList());
		
		return stList;
	}

	public void setStList(ArrayList<Students> stList) {
		this.stList = stList;
	}
	
	@Override
	public String toString() {
		return  name;
	}*/
	 
	 //String ComputerStudent;
	
	
		
	
	}

	

	