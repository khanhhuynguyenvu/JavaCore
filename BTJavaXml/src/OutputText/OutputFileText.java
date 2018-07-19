package OutputText;

import Model.Student;
import org.w3c.dom.Document;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class OutputFileText {
    public OutputFileText() {
    }
    public void WriteFileText(ArrayList<Student> data) throws IOException {
       String str = "Danh Sach Hoc Sinh"+"\n";
        BufferedWriter writer = new BufferedWriter(new FileWriter("file.txt"));
        for(Student student : data){
            str+=student.toString();
        }
        writer.write(str);
        writer.close();
        System.out.println("Wrote on txt file");
    }
}
