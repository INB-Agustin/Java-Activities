public class Student extends Person {
    
    private double grade;

    public Student (){
        this.grade = 0.0;
    }

    public void setGrade (double grade) {
        this.grade = grade;
    }

    public double getGrade(){
        return this.grade;
    }
}
