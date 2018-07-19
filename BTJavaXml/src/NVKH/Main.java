package NVKH;

import Generator.StudentGenerator;
import Model.Student;
import OutputText.OutputFileText;
import OutputXML.OutputFileXML;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// write your code here

        try{
            //Generate students
            StudentGenerator studentGenerator = new StudentGenerator();
            ArrayList<Student> data = studentGenerator.GenerateStudent();
            //write file XML
            OutputFileXML outputFileXML = new OutputFileXML();
            outputFileXML.WriteFileXml(data);
            //write file Text
            OutputFileText outputFileText = new OutputFileText();
            outputFileText.WriteFileText(data);


        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
