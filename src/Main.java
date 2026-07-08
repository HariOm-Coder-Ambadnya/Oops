public class Main {
    public static void main(String[] args) {

        Student Omkar = new Student();
        System.out.println(Omkar.name);
        Omkar.greeting();
        Student Anuriddha = new Student(8,"Sam",12.5f);
        System.out.println(Anuriddha.rno);

    }
}

class Student {

    int rno;
    String name;
    float marks = 90;


void greeting(){
    System.out.println("hii " + name);
}

    Student(){
        this.rno = 12;
        this.name = "Rishi";
        this.marks = 88.5f;
    }

    Student(int rollnumber, String name, float mark){
        this.rno = rollnumber;
        this.name = name;
        this.marks = mark;
    }
}
