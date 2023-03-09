import java.io.File;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;

public class DomParser {
	public static void main(String[] args) {
		Student student;
		ArrayList<Student> studentList = new ArrayList<>();

		try {
			File inputFile = new File("data/student.xml");
			DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newDefaultInstance();
			DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();

			Document xmlFile = dBuilder.parse(inputFile);
			xmlFile.getDocumentElement().normalize();

			System.out.println("Root element: " + xmlFile.getDocumentElement().getNodeName());

		} catch(Exception e) {
			System.out.println("Error in parsing xml : "  + e.getMessage());
		}
	}
}