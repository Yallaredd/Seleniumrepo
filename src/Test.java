import java.util.ArrayList;
import java.util.Scanner;

class Student
{
	int id;
	String name;
	String branch;
	double fee;
	
	
	//Creating Constructor(class name constructor name must be same)
	Student(int id, String name, String branch, double fee)

	{
		this.id=id;
		this.name=name;
		this.branch=branch;
		this.fee=fee;
	}
}
public class Test {

	public static void main(String[] args) {
		ArrayList<Student> list =new ArrayList<Student>();
		Scanner scan=new Scanner(System.in);
		for(int i=1; i<=4; i++)
		{
			System.out.println("enter the 4 Student details");
			int id=scan.nextInt();
			String name=scan.next();
			String branch=scan.next();
			double fee=scan.nextDouble();
			
			Student s1=new Student(id ,name, branch,fee);
					list.add(s1);
		}

/*list.add(new Student(101,"AAA","civil",50000));
list.add(new Student(102,"RRR","ci",50000));
list.add(new Student(103,"TTT","cl",50000));
list.add(new Student(104,"GGG","l",50000));
list.add(new Student(105,"EEE","Mechil",50000));

*/
System.out.println("Students Details");
for(Student x:list)
{
	System.out.println(x.id+","+x.name+","+x.branch+","+x.fee);
}
	}

}
