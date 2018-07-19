package StudentManagement;

import Model.Student;

import java.util.*;
import java.util.stream.Collectors;

public class StudentManager {
    private ArrayList<Student> students;
    private Map<Integer,Student> mapStudentsID;
    private Map<String,ArrayList<Student>> mapStudentsName;
    //Constructor
    public StudentManager(ArrayList<Student> students){
        this.students = students;
        this.mapStudentsID = students.stream().collect(Collectors.toMap(Student::getId,Student::getStudent));
        this.mapStudentsName = new HashMap<>();
        for (Student student : students){
            String dummyname = student.getName();
            if(!mapStudentsName.containsKey(dummyname)){
                this.mapStudentsName.put(dummyname,new ArrayList<>(Arrays.asList(student)));
            }else {
                this.mapStudentsName.get(dummyname).add(student);
                this.mapStudentsName.put(dummyname, this.mapStudentsName.get(dummyname));
            }
        }
    }
    //Find student by name
    public void FindStudentbyName(){
        Scanner scanner = new Scanner(System.in);
        String isExit;
        do {
            System.out.printf("Nhap Name học sinh cần tìm là:");
            String name = scanner.nextLine();
            //Start time
            Long startTime = System.nanoTime() ;
            ArrayList<Student> studentsSameName = GetStudentbyName(name);
            if (studentsSameName != null) {
                System.out.println("Thông tin các học sinh cần tìm là:");
                for (Student student1 : studentsSameName){
                    System.out.println(student1.toString());
                }
            } else {
                System.out.println("Khong tìm thấy tên của học sinh trên!");
            }
            Long endTime = System.nanoTime();
            //End Time
            Double duration = (endTime-startTime)/1000.0;
            System.out.println("  >>> Runtime = "+duration.toString());
            System.out.printf("Nhập 0 de Tiếp tục, 1 de Thoát:");
            isExit  = scanner.nextLine();
        }while (isExit.equals("0"));
    }
    //Get student list by name
    public ArrayList<Student> GetStudentbyName(String name){
        ArrayList<Student> arrayStudent = new ArrayList<>(mapStudentsName.get(name));
        if(arrayStudent.size() > 0){
            return arrayStudent;
        }else {
            return  null;
        }
    }
    //Find student by id
    public void FindStudentById(){
        Scanner scanner = new Scanner(System.in);
        Integer isExit;
        do {
            System.out.printf("Nhap ID hoc sinh can tim :");
            Integer id = scanner.nextInt();
            //Start time
            Long startTime = System.nanoTime() ;
            Student student = GetStudentByIdusingMapSearch(id);
            if (student != null) {
                System.out.println("Thong tin hoc sinh can tim la:");
                System.out.println(student.toString());
            } else {
                System.out.println("Khong tim thay Id hoc sinh tren!");
            }
            Long endTime = System.nanoTime();
            //End Time
            Double duration = (endTime-startTime)/1000.0;
            System.out.println("  >>> Runtime = "+duration.toString());
            System.out.printf("Nhap 0 de Tiep tuc, 1 de Thoat:");
            isExit  = scanner.nextInt();
        }while (isExit.equals(0));
    }
    //Get student by id using linear search
    private Student GetStudentByIdusingLinearSearch(Integer id){
        for (Student student : students){
            if (student.getId().equals(id)){
                return student;
            }
        }
        return  null;
    }
    //Get student by id using map to store students
    private Student GetStudentByIdusingMapSearch(Integer id){
        Student student = mapStudentsID.get(id);
        if(student != null){
            return student;
        }else {
            return null;
        }
    }
}
