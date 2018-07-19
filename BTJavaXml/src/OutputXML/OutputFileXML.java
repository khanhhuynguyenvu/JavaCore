package OutputXML;

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

public class OutputFileXML {
    public OutputFileXML() {
    }

    public void WriteFileXml(ArrayList<Student> data){
        try {
            //Create new document
            DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
            Document document = documentBuilder.newDocument();
            //Add element ListStudent to document
            Element ListStudent = document.createElement("ListStudent");
            document.appendChild(ListStudent);
            //Generate and write file
        for(Student student : data){
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
        //Transform Domsource to Stream file
            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer =transformerFactory.newTransformer();
            //Transformer transformer = transformerFactory.newTransformer()
            DOMSource source = new DOMSource(document);
            StreamResult result = new StreamResult(new File("file.xml"));
            transformer.transform(source, result);
            System.out.println("Wrote on XML file!");
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
