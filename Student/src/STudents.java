import java.util.ArrayList;


public class STudents {
	String ArtStudent;
	 String ComputerStudent;
	
	
		
	STudents(){
	 
		this. ArtStudent="ArtStudents";
		this.ComputerStudent= "ComputerStudents";
		 
	 }
	

	public String getArtStudent() {
		return ArtStudent;
	}

	public void setArtStudent(String artStudent) {
		ArtStudent = artStudent;
	}

	public String getComputerStudent() {
		return ComputerStudent;
	}

	public void setComputerStudent(String computerStudent) {
		ComputerStudent = computerStudent;
	}
	public  void AddStudents(){
		
		 STudents Artstudents=new STudents();
		STudents ComputerStudents=	new STudents();
		 ArrayList<STudents> stList=new ArrayList<STudents>();
		
		 stList.add(Artstudents);
		 stList.add(ComputerStudents);
		int i=0;
		 //for(int i=0;i<stList.size();i++){
			 System.out.println("Students in the college are \n"+stList.get(i).ArtStudent+"\n"+stList.get(i).ComputerStudent);
			 //System.out.println("Students in the college are "+stList.get(i).ComputerStudent);
		 }
			 
	}



