 class Student {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
    public void displayInfo(String course) {
        System.out.println("Name: " + name + ", Age: " + age + ", Course: " + course);
    }

    public void role() {
        System.out.println(name + " is a Student");
    }
}

class GraduateStudent extends Student {
    private String specialization;

    public GraduateStudent(String name, int age, String specialization) {
        super(name, age);
        this.specialization = specialization;
    }

    @Override
    public void role() {
        System.out.println(getName() + " is a Graduate Student specialized in " + specialization);
    }
}

public class OopsDemo {
    public static void main(String[] args) {
        Student s1 = new Student("Rahul", 20);
        s1.displayInfo();
        s1.displayInfo("Computer Science");

        GraduateStudent g1 = new GraduateStudent("Priya", 22, "Artificial Intelligence");
        g1.displayInfo();
        g1.role();

        Student s2 = new GraduateStudent("Amit", 23, "Data Science");
        s2.role();
    }
}

