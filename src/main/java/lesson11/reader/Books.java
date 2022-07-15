package lesson11.reader;

public class Books {
    private String writer;
    private String bookName;

    public Books(String writer, String bookName) {
        this.writer = writer;
        this.bookName = bookName;
    }

    public Books() {
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }
    public String getInfo(){
        return bookName + " / Writer : " + writer;
    }
}
