package Oop;

public class Human {
	protected String name;
    protected int age;
    protected String nationality;
 
    Human(String name, int age, String nationality) {
        this.name = name;
        this.age = age;
        this.nationality = nationality;
    }
 
    void think() {
        System.out.println("Thinking.");
    }
 
    void walk() {
        System.out.println("Walking.");
    }
}
 
class Student extends Human {
    protected String institution;
    protected String session;
    protected String dept;
    protected String stdID;
 
    Student(String name, int age, String nationality,
            String institution, String session, String dept, String stdID) {
        super(name, age, nationality);
        this.institution = institution;
        this.session = session;
        this.dept = dept;
        this.stdID = stdID;
    }
 
    void study() {
        System.out.println("Studying.");
    }
 
    void display() {
        System.out.println("Name         : " + name+"\nAge  : " + age+"\nNationality  : " + nationality+"\nInstitution  : " + institution+"\nSession : " + session+"\nDept   : " + dept+"Student ID   : " + stdID);

    }
}
 
class Teacher extends Human {
    protected String institution;
    protected String designation;
    protected String dept;
    protected String tID;
 
    Teacher(String name, int age, String nationality,
            String institution, String designation, String dept, String tID) {
        super(name, age, nationality);
        this.institution = institution;
        this.designation = designation;
        this.dept = dept;
        this.tID = tID;
    }
 
    void research() {
        System.out.println("Researching.");
    }
 
    void display() {
        System.out.println("Name         : " + name);
        System.out.println("Age          : " + age);
        System.out.println("Nationality  : " + nationality);
        System.out.println("Institution  : " + institution);
        System.out.println("Designation  : " + designation);
        System.out.println("Dept         : " + dept);
        System.out.println("Teacher ID   : " + tID);
    }
}
 
class TestClassNew {
 
    public static void main(String[] args) {
        Student std = new Student("pial", 25, "BD", "SU", "2020", "CSE", "1226");
        System.out.println("--- Student Info ---");
        std.display();
        std.study();
        std.think();
        std.walk();
 
        System.out.println();
 
        Teacher tch = new Teacher("Alex", 32, "BD", "SU", "Professor", "CSE", "T001");
        System.out.println("--- Teacher Info ---");
        tch.display();
        tch.research();
        tch.think();
        tch.walk();
    }
}

