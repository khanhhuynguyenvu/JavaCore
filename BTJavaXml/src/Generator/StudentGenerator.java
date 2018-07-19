package Generator;

import Model.Student;

import java.util.ArrayList;
import java.util.Random;

public class StudentGenerator {
    private ArrayList<Student> students = new ArrayList<>();
    private ArrayList<Integer> numberRepo = new ArrayList<>();
    public StudentGenerator() {
    }

    public ArrayList<Student> GenerateStudent(){
        for (long i = 0; i < 1000; i++) {
            students.add(new Student(randomId(),randomName(),randomBirthYear()));
        }
        return  students;
    }
    private Integer randomId(){
        Random random = new Random();
        Integer randomNumber;
        do{
           randomNumber = random.nextInt(100000)+16025500;
        }while (numberRepo.contains(randomNumber));
        numberRepo.add(randomNumber);
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
        String[] LastName = new String[]{"Nguyễn","Lê","Trần","Vươnng","Huyền","Louis","Jean","Trương","Hoài","Trương","Ngô","Đình"};
        String[] MidName = new String[]{"","","","","","Thị","Văn","Vân","Nguyên","Xuân","Nhật","Nhất","Adams","Lực","Tường","Thụy"};
        String[] FirstName = new String[]{"Đình","Định","Tuấn","Tùng","Thanh","Khôi","Phúc","Thức","Vy","Nhân","Tri","Ly","Thảo","Trí","Bình","MBappe","Giroud","Grizeman"};
        String[] SubFirstName = new String[]{"","","","","","","","Miên","Lương","Của","Cái","Trân","Phúc"};
        //Generated Name
        String Name = LastName[randomIndex(0,LastName.length)]+" "+
                MidName[randomIndex(0,MidName.length)]+" "+
                FirstName[randomIndex(0,FirstName.length)]+" "+
                SubFirstName[randomIndex(0,SubFirstName.length)];
        return Name;
    }
}
