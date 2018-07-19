package StudentManagement;

import Model.Student;

import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class StudentManager {
    private ArrayList<Student> students;
    private Map<Integer,Student> mapStudentsID;
    private Map<String,ArrayList<Student>> mapStudentsName;
    //Constructor
    public StudentManager(ArrayList<Student> students) {
        this.students = students;
        this.mapStudentsID = students.stream().collect(Collectors.toMap(Student::getId,Student::getStudent));
        for (Student student : students){
            String dummyname = student.getName();
            if(mapStudentsName.get(dummyname) == null){
                this.mapStudentsName.put(dummyname,new ArrayList<>());
            }else {
                this.mapStudentsName.get(dummyname).add(student);
                this.mapStudentsName.put(dummyname, this.mapStudentsName.get(dummyname));
            }
        }
    }
    //Find student by name
    public void FindStudentbyName(){
        Scanner scanner = new Scanner(System.in);
        Integer isExit;
        do {
            System.out.printf("Nhap Name hoc sinh can tim :");
            String name = scanner.nextLine();
            //Start time
            Long startTime = System.nanoTime() ;
            ArrayList<Student> student = GetStudentbyName(name);
            if (student != null) {
                System.out.println("Thong tin cac hoc sinh can tim la:");
                for (Student student1 : students){
                    System.out.println(student1.toString());
                }
            } else {
                System.out.println("Khong tim thay hoc sinh tren!");
            }
            Long endTime = System.nanoTime();
            //End Time
            Double duration = (endTime-startTime)/1000.0;
            System.out.println("  >>> Runtime = "+duration.toString());
            System.out.printf("Nhap 0 de tiep tuc tim kiem:");
            isExit  = scanner.nextInt();
        }while (isExit.equals(0));
    }
    //Get student list by name
    public ArrayList<Student> GetStudentbyName(String name){
        ArrayList<Student> arrayStudent = mapStudentsName.get(name);
        if(arrayStudent != null){
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
                System.out.println("Khong tim thay hoc sinh tren!");
            }
            Long endTime = System.nanoTime();
            //End Time
            Double duration = (endTime-startTime)/1000.0;
            System.out.println("  >>> Runtime = "+duration.toString());
            System.out.printf("Nhap 0 de tiep tuc tim kiem:");
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
