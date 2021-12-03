package ro.uvt.services;
import ro.uvt.models.*;

public class BookSaveVisitor implements Visitor {
    private String book_json = "";
    private String section_json = "";
    private String table_of_contents_json = "";
    private String paragraph_json = "";
    private String image_proxy_json = "";
    private String image_json = "";
    private String table_json = "";

    @Override
    public void visitBook(Book b) {
//        book_json += "{ \"type\" : \"book\",\n" +
//                        "\"authors\" : [\"";
//        List<Author> authors = b.getAuthors();
//        for (Author a : authors) {
//            book_json += a.getName() + "\",";
//        }
//        book_json += "],\n" +
//                    "\"title\" : \"" + b.getTitle() + "\",\n" +
//                    "\"content\" : {\n";
//        List<Element> contents = b.getContent();
//        for (Element el : contents) {
//            Visitee viz = (Visitee) el;
//            viz.accept(this);
//        }
//        book_json += "}\n}\n";
    }

    @Override
    public void visitSection(Section s) {
//        book_json += "\"type\" : \"section\",\n" +
//                     "\"name\" : \"" + s.getName() + "\",\n" +
//                     "\"subElements\" : {";
//        List<Element> elements = s.getSubElements();
//        for (Element el : elements) {
//            Visitee viz = (Visitee) el;
//            viz.accept(this);
//        }
//        book_json += "},";
    }

    @Override
    public void visitTableOfContents(TableOfContents table) {
//        book_json += "{\"type\" : \"table_of_contents\",\n" +
//                     "\"name\" : \"" + table.getName() +
//                     "\"},";
    }

    @Override
    public void visitParagraph(Paragraph p) {
//        book_json += ("{\"type\" : \"paragraph\",\n" +
//                     "\"text\" : \"" + p.getText() + "\",\n" +
//                     "\"align_strategy\" : " + p.getAlignStrategy().render(p, null) +
//                     "\"},");
    }

    @Override
    public void visitImageProxy(ImageProxy image) {

    }

    @Override
    public void visitImage(Image img) {

    }

    @Override
    public void visitTable(Table tbl) {
//        book_json += "{\"type\" : \"table\",\n" +
//                     "\"title\" : \"" + tbl.getTitle() + "\"},";
    }
}
