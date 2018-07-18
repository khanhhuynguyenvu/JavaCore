package Generator;

import Model.Student;

import java.util.ArrayList;
import java.util.Random;

public class StudentGenerator {
    private ArrayList<Student> students = new ArrayList<>();

    public StudentGenerator() {
    }

    public ArrayList<Student> GenerateStudent(){
        for (long i = 0; i < 3; i++) {
            students.add(new Student(randomId(),randomName(),randomBirthYear()));
        }
        return  students;
    }
    private Integer randomId(){
        Random random = new Random();
        Integer randomNumber = random.nextInt(1000)+16025500;
        return  randomNumber;
    }
    private Integer randomBirthYear(){
        Random random = new Random();
        Integer randomNumber = random.nextInt(100)+1900;
        return randomNumber;
    }
    private Integer randomIndex(Integer min,Integer max){
        Random random = new Random();
        Integer Index = random.nextInt(max-min)+min;
        return Index;
    }
    private String randomName(){
        String[] LastName = new String[]{"Nguyễn","Lê","Trần","Vươnng","Huyền","Trương","Hoài","Trương"};
        String[] MidName = new String[]{" ","Thị","Văn","Vân","Nhật","Nhất","Adams","Lực","Tường"};
        String[] FirstName = new String[]{"Đình","Định","Tuấn","Tùng","Thanh","Thức","Vy","Nhân","Tri","Ly","Thảo","Trí","Bình","MBappe","Giroud","Grizeman"};
        String[] SubFirstName = new String[]{" "," "," "," "," "," "," ","Lương","Của","Cái","Trân","Phúc"};
        //Generated Name
        String Name = LastName[randomIndex(0,LastName.length)]+" "+
                MidName[randomIndex(0,MidName.length)]+" "+
                FirstName[randomIndex(0,FirstName.length)]+" "+
                SubFirstName[randomIndex(0,SubFirstName.length)];
        return Name;
    }
}
