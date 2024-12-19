class Student {
    String name;
    int rollNo;

    Student(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }
}

class Result extends Student {
    int marks;

    Result(String name, int rollNo, int marks) {
        super(name, rollNo);
        this.marks = marks;
    }

    void display() {
        System.out.println("Name: " + name + ", Roll No: " + rollNo + ", Marks: " + marks);
    }
}

public class StudentResult {
    public static void main(String[] args) {
        Result result = new Result("Nitakshi", 15113, 95);
        result.display();
    }
}
