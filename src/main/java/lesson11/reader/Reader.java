package lesson11.reader;

public class Reader {
    private String fio;
    private Integer number;
    private String faculty;
    private String birthday;
    private Integer phone;

    public Reader (String fio, Integer number, String faculty, String birthday, Integer phone) {
        this.fio = fio;
        this.number = number;
        this.faculty = faculty;
        this.birthday = birthday;
        this.phone = phone;
    }

    public Reader() {
    }

/////////////////////////////////////////////

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public Integer getPhone() {
        return phone;
    }

    public void setPhone(Integer phone) {
        this.phone = phone;
    }

///////////////////////////////////////////////////

    public String getInfo() {
        return "FIO: '" + fio  + " / number: " + number + " / faculty: " + faculty
                + " / birthday: " + birthday  + " / phone: " + phone ;
    }
    public void personTakeBook(Integer number) {
        System.out.println(this.fio + " take " + number + " book");

    }
    public void personTakeBook(String... books) {
        System.out.println(this.fio + " take this books:");
        for (String book : books) {
            System.out.println(book);
        }
        System.out.println();
    }

    public void personTakeBook(Books... books) {
        System.out.println(this.fio + " take this books:");
        for (Books book : books) {
            System.out.println(book.getBookName() + "/ Writer: " + book.getWriter());
        }
        System.out.println();
    }

/////////////////////////////////////////////////

    public void personReturnBook(Integer number) {
        System.out.println(this.fio + " return " + number + " book");
    }
    public void personReturnBook(String...books) {
        System.out.println(this.fio + " return this book: ");
        for (String book : books){
            System.out.println(book);
        }
        System.out.println();
    }
    public void personReturnBook(Books...books) {
        System.out.println(this.fio + " return this book: ");
        for (Books book : books){
            System.out.println(book.getBookName() + "/ Writer: " + book.getWriter());
        }
        System.out.println();
    }

}
