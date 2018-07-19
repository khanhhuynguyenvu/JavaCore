package Model;

public class Student {
    Integer id;
    String name;
    Integer BirthYear;
    Student student;

    public Student() {
    }

    public Student(Integer id, String name, Integer birthYear) {
        this.id = id;
        this.name = name;
        this.BirthYear = birthYear;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getBirthYear() {
        return BirthYear;
    }

    public void setBirthYear(Integer birthYear) {
        BirthYear = birthYear;
    }

    public Student getStudent() {
        return new Student(id,name,BirthYear);
    }


    public String toString(){
        return ("\n"+"ID : "+id.toString()+"\n"+"Name : "+name+"\n"+"BirthYear : "+BirthYear.toString()+"\n");
    }
}
