class Student {
    private int rollNo;
    private String name;

    Student() {
        rollNo = -1;
        name = "New Student";
    }

    Student(int rollNo) {
        this.rollNo = rollNo;
        name = "New Student";
    }

    Student(String name) {
        rollNo = -1;
        this.name = name;
    }

    Student(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    Student(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public int getRollNo() {
        return this.rollNo;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    protected void display() {
        System.out.println("Name : " + this.name + ", RollNo : " + this.rollNo);
    }
}

public class StudentDriver {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student("Bheru", 1);
        Student s3 = new Student(2, "Yusuf");
        Student s4 = new Student(3);
        Student s5 = new Student("Dev");
        s1.display();
        System.out.println("Name of s2 : " + s2.getName());
        System.out.println("Roll No of s3 : " + s3.getRollNo());
        s4.setName("Mrid");
        s4.display();
        s5.setRollNo(4);
        s5.display();
    }

}
