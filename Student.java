public class Student {
    
    private String name;
    private int age;
    private String nameOfSchool;
    private String studentPassword;

    public Student(String name, int age, String nameOfSchool) {

        this.name = name;
        this.age = age;
        this.nameOfSchool = nameOfSchool;


    }

    public Student () {
    System.out.println("Constructor called");
    sayHi();

    }

    private void sayHi() {

        System.out.println("Hello");
    }

    public void setName (String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }


    public void setStudentPassword(String input) {

        if (input.length() < 6) {
            System.out.println("Password to short");
        }
        else {
            this.studentPassword = input;
        }

    }




}
