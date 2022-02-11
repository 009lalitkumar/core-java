class UniversityStudent {
    private static int count = 1;
    private static final String UNIVERSITY = "Wiley mthree";
    private String hometown;
    private int rollNo;
    private String name;

    UniversityStudent() {
        this.rollNo = count;
        count++;
        this.name = "";
        this.hometown = "";
    }

    UniversityStudent(String name) {
        this();
        this.name = name;
    }

    UniversityStudent(String name, String hometown) {
        this(name);
        this.hometown = hometown;
    }

    public void display() {
        System.out.println("Student name : " + this.name);
        System.out.println("Student Roll No : " + this.rollNo);
        System.out.println("Student Hometown : " + this.hometown);
        System.out.println("Student University : " + UNIVERSITY);
        System.out.println("");
    }
}

public class StudentDriver2 {
    public static void main(String[] args) {
        UniversityStudent s1 = new UniversityStudent();
        UniversityStudent s2 = new UniversityStudent("Bheru");
        UniversityStudent s3 = new UniversityStudent("Yusuf", "Delhi");
        s1.display();
        s2.display();
        s3.display();
    }
}