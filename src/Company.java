public class Company {
    private String name;
    private String address;
    Course[] courses;
    private String languageOfInstruction;

    public Company(String name, String address, Course[] courses, String languageOfInstruction) {
        this.name = name;
        this.address = address;
        this.courses = courses;
        this.languageOfInstruction = languageOfInstruction;
    }


    public static double income(Student[] students) {
        double number = 0;
        for (Student student : students) {
            number = student.getContract()+number;

        }

     return number;
    }
}
