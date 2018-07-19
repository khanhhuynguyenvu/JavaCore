package NVKH;

import Generator.StudentGenerator;
import Model.Student;
import OutputText.OutputFileText;
import OutputXML.OutputFileXML;
import StudentManagement.StudentManager;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        try{
            //Generate students
            StudentGenerator studentGenerator = new StudentGenerator();
            ArrayList<Student> data = studentGenerator.GenerateStudent(1000);
            //write file XML
            OutputFileXML outputFileXML = new OutputFileXML();
            outputFileXML.WriteFileXml(data);
            //write file Text
            OutputFileText outputFileText = new OutputFileText();
            outputFileText.WriteFileText(data);
            //Find Student by ID
            StudentManager studentManager = new StudentManager(data);
            studentManager.FindStudentById();
            studentManager.FindStudentbyName();

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
