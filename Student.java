import java.util.Scanner;

class Student_Data {

  Scanner input = new Scanner(System.in);

  int age;
  String name;
  private String address;
  private int phone;
  private String email;
  private double gpa;
  private char gender;
  private int id;
  private char grade;
  private String department;

  void Set_Data() {

    System.out.print("Enter the name of the student: ");
    name = input.nextLine();
    System.out.print("Enter the age of the student: ");
    age = input.nextInt();
    input.nextLine();

  }

  void Set_address() {
    System.out.print("Enter your adress here : ");
    address = input.nextLine();
  };

  void Set_phone() {
    System.out.print("Enter your phone-number here : ");
    phone = input.nextInt();
  };

  void Set_email() {
    System.out.print("Enter your email here : ");
    email = input.nextLine();
  };

  void Set_gpa() {
    System.out.print("Enter your gpa here : ");
    gpa = input.nextDouble();
    input.nextLine();
  };

  void Set_gender() {
    System.out.print("Enter your gender here : ");
    gender = input.next().charAt(0);
    input.nextLine();
  };

  void Set_id() {
    System.out.print("Enter your id here : ");
    id = input.nextInt();

  };

  void Set_grade() {
    System.out.print("Enter your grade here : ");
    grade = input.next().charAt(0);
  };

  void Set_department() {
    System.out.print("Enter your department here : ");
    department = input.nextLine();
  };

  void Get_Data() {
    System.out.println("Name: " + name);
    System.out.println("Age: " + age);
    System.out.println("Address: " + address);
    System.out.println("Phone: " + phone);
    System.out.println("Email: " + email);
    System.out.println("GPA: " + gpa);
    System.out.println("Gender" + gender);
    System.out.println("ID: " + id);
    System.out.println("Grade: " + grade);
    System.out.println("Department: " + department);

  }

  // void Get_address() {
  // System.out.println("Address: " + address);
  // };

  // void Get_phone() {
  // System.out.println("Phone: " + phone);
  // };

  // void Get_email() {
  // System.out.println("Email: " + email);
  // };

  // void Get_gpa() {
  // System.out.println("GPA: " + gpa);
  // };

  // void Get_gender() {
  // System.out.println("Gender" + gender);
  // };

  // void Get_id() {
  // System.out.println("ID: " + id);
  // };

  // void Get_grade() {
  // System.out.println("Grade: " + grade);
  // };

  // void Get_department() {
  // System.out.println("Department: " + department);
  // };

}

public class Student {

  public static void main(String[] args) {

    Student_Data s1, s2;

    s1 = new Student_Data();
    s2 = new Student_Data();

    System.out.println("\n\n\n");
    System.out.println("\t\t Inputs");
    System.out.println("\n");
    System.out.println("\t Inputs for First Student ");
    System.out.println("\n");

    s1.Set_Data();

    s1.Set_address();

    s1.Set_department();

    s1.Set_email();

    s1.Set_gender();

    s1.Set_gpa();

    s1.Set_grade();

    s1.Set_id();

    s1.Set_phone();

    System.out.println("\n");
    System.out.println("\t Inputs for Second Student ");
    System.out.println("\n");

    s2.Set_Data();

    s2.Set_address();

    s2.Set_department();

    s2.Set_email();

    s2.Set_gender();

    s2.Set_gpa();

    s2.Set_grade();

    s2.Set_id();

    s2.Set_phone();

    System.out.println("\n\n\n");
    System.out.println("\t\t Outputs");
    System.out.println("\n");
    System.out.println("\t Output for First Student ");
    System.out.println("\n");
    s1.Get_Data();
    System.out.println("\n");
    System.out.println("\t Output for Second Student ");
    System.out.println("\n");
    s2.Get_Data();

  }

}
