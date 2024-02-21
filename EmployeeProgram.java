import java.util.Scanner;

class Employee
{

	int empID;
	String empName;
	private double empSalary;
	

	Employee()
	{
		empID = -1;
		empName = "ABC";
		empSalary = -1;  
		
	}
	Employee(int empID, String empName, double empSalary)
	{
		this.empID = empID;
		this.empName = empName;
		this.empSalary = empSalary; 
		
	}
	
	void setEmpSalary(double salary)
	{
		empSalary = salary;
	}

	double getEmpSalary()
	{
		return empSalary;
	}
	

	void getData()
	{
		Scanner sc = new Scanner(System.in);
			
		System.out.print("Enter Employee  ID : ");
		empID = sc.nextInt();

		sc.nextLine();
		System.out.print("Enter Employee  Name : " );
		empName = sc.nextLine();

		System.out.print("Enter  Employee  Salary : ");
		empSalary = sc.nextDouble();

	}

	void setData()
	{
		empID = 1;
		empName = "Kashish";
		empSalary = 0; 
		
	}
	
	void setData(int empID, String empName, double empSalary)
	{
		this.empID = empID;
		this.empName = empName;
		this.empSalary = empSalary; 
		
	}
		
	void showData()
	{
		System.out.println("Employee  ID : " + empID);
		System.out.println("Employee  Name : " + empName);
		System.out.println("Employee  Salary : " + empSalary);
	}

	void ChangeSalary(){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter you new salary : ");
		empSalary = input.nextInt();		
	}

	void DoubledSalary(){
		empSalary = empSalary*2;
	}

	
	void incrementSalary()
	{
		empSalary++;
	}

	void changeSalary(){
		char option ;
		Scanner input = new Scanner(System.in);
		System.out.println("\n\n\n");
		System.out.println("a: DoubleSalary  ");
		System.out.println("b: ChangeSalary  ");
		System.out.println("c: IncrementSalary  "); 		
		System.out.print("Enter a,b or c from the above options :-  ");
		option = input.next().charAt(0);

		if(option == 'a'){
			DoubledSalary();
		}

		else if (option == 'b'){
			
			ChangeSalary();				
		
		} 
	
		else if (option == 'c'){
			
	 		incrementSalary();

			
		}
		

		

	}	

}

public class EmployeeProgram
{

	public static void main(String args[])
	{
		Employee e1, e2 , e3;
		e1 = new Employee(2,"Sattar",10);
		e2 = new Employee(3,"Sanam",20);
		e3 = new Employee(4,"Siraj" , 50);
		
		
	
		e1.incrementSalary();
		e1.showData();
		
		e2.setEmpSalary(e2.getEmpSalary()+1);
		e2.showData();
		
		e3.showData();
		e3.changeSalary();
		
		e1.showData();
		e2.showData();
		e3.showData();
		
		System.out.print(e3.getEmpSalary());
		





	}

}




