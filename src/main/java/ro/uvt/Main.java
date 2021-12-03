package ro.uvt;
import ro.uvt.services.*;
import ro.uvt.models.*;

/**
 * @author Diana Anton
 *
 */
public class Main {

	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Command cmd1 = new OpenCommand("Titlu 1");
		cmd1.execute();
		// imbunatatire singleton si command pot cauza probleme daca nu sunt folosite intr-o ordine anume
		// si sa propunem o solutie
		Section section = new Section("Capitolul 3");
		Paragraph p1 = new Paragraph("Paragraf 3.1");
		section.add(p1);
		Command cmd3 = new SaveCommand(section);
		cmd3.execute();

		Command cmd2 = new StatisticsCommand();
		cmd2.execute();
	}
}