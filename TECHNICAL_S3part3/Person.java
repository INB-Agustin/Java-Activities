public class Person {
    private String name;
    private int age;
    private String gender;

    public Person (){
        this.name ="";
        this.age = 0;
        this.gender ="";
    }

    public void setName (String name) {
        this.name = name;
    }

    public void setAge (int age) {
        this.age = age;
    }

    public void setGender (String gender) {
        this.gender = gender;
    }

    public String getName(){
        return this.name;
    }

    public int getAge(){
        return this.age;
    }

    public String getGender(){
        return this.gender;
    }
}
