package NVKH;

import Generator.StudentGenerator;
import Model.Student;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// write your code here

        try{
            DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
            Document document = documentBuilder.newDocument();
            // Element
            //Super cars Element
            // setting attribute to element

            // carname element

            //Sutdent
            Element ListStudent = document.createElement("ListStudent");
            document.appendChild(ListStudent);
            //Generate students
            StudentGenerator studentGenerator = new StudentGenerator();
            ArrayList<Student> data = studentGenerator.GenerateStudent();
            for(Student student : data){
                System.out.println(student.getBirthYear()+"  "+student.getName());
                Element Student =document.createElement("student");
                //ID Element
                Element Id = document.createElement("ID");
                Id.appendChild(document.createTextNode(student.getId().toString()));
                Student.appendChild(Id);
                //Name Element
                Element Name = document.createElement("Name");
                Name.appendChild(document.createTextNode(student.getName()));
                Student.appendChild(Name);
                //BirthYear Element
                Element BirthYear = document.createElement("BirthYear");
                BirthYear.appendChild(document.createTextNode(student.getBirthYear().toString()));
                Student.appendChild(BirthYear);
                //List Student
                ListStudent.appendChild(Student);
            }

            // write the content into xml file
            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            DOMSource source = new DOMSource(document);
            StreamResult result = new StreamResult(new File("file.xml"));
            transformer.transform(source, result);

            // Output to console for testing
            //StreamResult consoleResult = new StreamResult(System.out);
            //transformer.transform(source, consoleResult);;
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
