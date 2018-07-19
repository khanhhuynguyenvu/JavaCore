package Generator;

import Model.Student;

import java.util.ArrayList;
import java.util.Random;

public class StudentGenerator {
    private ArrayList<Student> students = new ArrayList<>();
    private ArrayList<Integer> numberRepo = new ArrayList<>();
    public StudentGenerator() {
    }

    public ArrayList<Student> GenerateStudent(Integer numberofStudent){
        for (long i = 0; i < numberofStudent; i++) {
            students.add(new Student(randomId(numberofStudent),randomName(),randomBirthYear()));
        }
        return  students;
    }
    private Integer randomId(Integer numberofStudent){
        Random random = new Random();
        Integer randomNumber;
        do{
           randomNumber = random.nextInt(numberofStudent)+16025500;
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
        String[] LastName = new String[]{"Nguyễn","Xuân","Lê","Trần","Vươnng","Huyền","Louis","Jean","Trương","Hoài","Trương","Ngô","Đình","Chi"};
        String[] MidName = new String[]{"","","","","","Thị","Văn","Vân","Nguyên","Xuân","Nhật","Nhất","Adams","Lực","Tường","Thụy"};
        String[] FirstName = new String[]{"Đình","Định","Pu","Phước","Chung","Trung","Bắc","Tuấn","Tùng","Thanh","Khôi","Phúc","Thức","Vy","Nhân","Tri","Ly","Thảo","Trí","Bình","MBappe","Giroud","Grizeman"};
        String[] SubFirstName = new String[]{"","","","","","","","Miên","Lương","Của","Cái","Trân","Phúc","Phương"};
        //Generated Name
        String Name = LastName[randomIndex(0,LastName.length)]+" "+
                MidName[randomIndex(0,MidName.length)]+" "+
                FirstName[randomIndex(0,FirstName.length)]+" "+
                SubFirstName[randomIndex(0,SubFirstName.length)];
        return Name;
    }
}
