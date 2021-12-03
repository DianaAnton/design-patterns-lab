package ro.uvt.services;
import ro.uvt.models.*;

public class BookStatistics implements Visitor {

	private int books = 0;
	private int sections = 0;
	private int table_of_contents = 0;
	private int paragraphs = 0;
	private int image_proxy = 0;
	private int images = 0;
	private int tables = 0;
	
	@Override
	public void visitBook(Book b) {
		// TODO Auto-generated method stub
		books++;
		for (Element el : b.getContent()) {
			Visitee viz = (Visitee) el;
			viz.accept(this);
		}
	}

	@Override
	public void visitSection(Section s) {
		// TODO Auto-generated method stub
		sections++;
		for (Element el : s.getSubElements()) {
			Visitee viz = (Visitee) el;
			viz.accept(this);
		}
	}

	@Override
	public void visitTableOfContents(TableOfContents table) {
		// TODO Auto-generated method stub
		table_of_contents++;
	}

	@Override
	public void visitParagraph(Paragraph p) {
		// TODO Auto-generated method stub
		paragraphs++;
	}

	@Override
	public void visitImageProxy(ImageProxy image) {
		// TODO Auto-generated method stub
		image_proxy++;
	}

	@Override
	public void visitImage(Image img) {
		// TODO Auto-generated method stub
		images++;
	}

	@Override
	public void visitTable(Table tbl) {
		// TODO Auto-generated method stub
		tables++;
	}
	
	public void printStatistics() {
		System.out.println("Visited books:" + books);
		System.out.println("Visited sections:" + sections);
		System.out.println("Visited tables of contents:" + table_of_contents);
		System.out.println("Visited paragraphs:" + paragraphs);
		System.out.println("Visited images proxy:" + image_proxy);
		System.out.println("Visited images:" + images);
		System.out.println("Visited tables:" + tables);
	}

}
