
public class Student {
	int rollno;
	String name;
	static String college ="Sandip";
	Student(int r,String n){
		rollno = r;
		name = n;
		}
	static void change() {
		college = "Sandip";
		
	}
	void display () {
		System.out.println(rollno+" "+name+" "+college);
	}
	public static void main(String[] args) {
		Student s1=new Student(111,"Sujata");
		Student s2=new Student(222,"Deshmukh");
		s1.display();
		s2.display();
		

	}

}
