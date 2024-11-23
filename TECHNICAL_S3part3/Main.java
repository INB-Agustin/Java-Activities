import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner  input = new Scanner(System.in);
        ArrayList<Student> studentList = new ArrayList<Student>();
        ArrayList<Teacher> teacherList = new ArrayList<Teacher>();

        int choice = 0;

        do {
            System.out.println("========MENU========");
            System.out.println("1. Add student");
            System.out.println("2. Add teacher");
            System.out.println("3. Display all");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = input.nextInt();
            input.nextLine();

            switch (choice) {
                case 1:
                    Student student = new Student();
                    System.out.print("Enter Student name: ");
                    student.setName(input.nextLine());
                    System.out.print("Enter age: ");
                    student.setAge(input.nextInt());
                    input.nextLine();
                    System.out.print("Enter gender: ");
                    student.setGender(input.nextLine());
                    System.out.print("Enter grade: ");
                    student.setGrade(input.nextDouble());
                    input.nextLine();
                    studentList.add(student);
                    break;
                case 2:
                    Teacher teacher = new Teacher();
                    System.out.print("Enter Teacher name: ");
                    teacher.setName(input.nextLine());
                    System.out.print("Enter age: ");
                    teacher.setAge(input.nextInt());
                    input.nextLine();
                    System.out.print("Enter gender: ");
                    teacher.setGender(input.nextLine());
                    System.out.print("Enter salary: ");
                    teacher.setSalary(input.nextDouble());
                    input.nextLine();
                    teacherList.add(teacher);
                    break;
                case 3:
                    if (teacherList.isEmpty()){
                        System.out.println("\nNo teacher added yet\n");
                    } else {
                        System.out.println("List of teachers: ");
                        
                    }

                    for (int i = 0; i < teacherList.size(); i++) {
                        System.out.println();
                        System.out.println("Teacher " + (i+1) + ":");
                        System.out.println("Teacher Name: " + teacherList.get(i).getName());
                        System.out.println("Age: " + teacherList.get(i).getAge());
                        System.out.println("Gender: " + teacherList.get(i).getGender());
                        System.out.println("Salary: " + teacherList.get(i).getsalary());
                        System.out.println();

                    }

                    if (studentList.isEmpty()){
                        System.out.println("\nNo Student added yet\n");
                    } else {
                        System.out.println("List of Students: ");
                        
                    }
                    for (int i = 0; i < studentList.size(); i++) {
                        System.out.println();
                        System.out.println("Student " + (i+1) + ":");
                        System.out.println("Student Name: " + studentList.get(i).getName());
                        System.out.println("Age: " + studentList.get(i).getAge());
                        System.out.println("Gender: " + studentList.get(i).getGender());
                        System.out.println("Grade: " + studentList.get(i).getGrade());
                        System.out.println();

                    }

            }
            
        } while (choice > 0 && choice < 4);


        input.close();
    }
}
