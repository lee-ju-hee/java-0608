class Student{

    private String name;
    private int id;
    
    Student()
    {
        System.out.println("Student() 생성자 호출");

        this.name = "Park";
        this.id = 123;
    }

    Student(String name)
    {
        System.out.println("Student(string name) 생성자 호출");

        this.name = name;
        this.id = 1234;
    }
    String getName()
    {
        return name;
    }
}
public class ljh060801{

    public static void main(String[] args){

        Student std1 = new Student();
        Student std2 = new Student("Lee");

        System.out.println("이름: " + std1.getName());
        System.out.println("이름: " + std2.getName());
    }
}