import java.time.LocalDate;

public class Main {
    public static void main(String[] args){


        Student student = new Student (1L,"Kanykei Akjoltoi kyzy", 16, 'F',30000);
        Mentor mentor = new Mentor(2L,"Adil Aitbaev",18,'M',15000);
        Instructor instructor = new Instructor (3L, "Aigerim Bektenova",17,'F',20000);

        Student[] students = {student};
        Mentor[] mentors = {mentor};
        Instructor[] instructors = {instructor};

        LocalDate date = LocalDate.of(2022, 10, 1);
        LocalDate dateOfFinish = LocalDate.of(2023,7,1);


        Group group = new Group ("java", students,date,dateOfFinish);
        Group[] groups = {group};

        Course course = new Course("java", groups, instructor, mentors);
        Course[] courses ={course};

        Company company = new Company ("peak", "bishkek", courses, "Java");
        System.out.println("contract "+Company.income (students));
        System.out.println("mentors salary "+mentor.getSalary());
        System.out.println("instructors salary " +instructor.getSalary());

    }
}