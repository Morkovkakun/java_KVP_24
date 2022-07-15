package lesson11.reader;


public class readerArray {
    public static void main(String[] args) {
        Reader reader1 = new Reader("Nyesabudka Petr Vasilyevich", 2, "ING", "13.01.1990", 243060);
        Reader reader2 = new Reader("Petrova Viktoria Romanovna", 1, "PED", " 24.96.2000", 345040);
        Reader reader3 = new Reader("Petruhin Viktor Olegovich", 4, "ING", "13.02.2005", 233440);

        Reader[] readers = {reader1, reader2, reader3};

        Books books1 = new Books("J. R. R. Tolkien", "The Hobbit");
        Books books2 = new Books("The Little Prince", "Antoine de Saint-Exupéry");
        Books books3 = new Books("Charles Perrault", "Little Red Riding Hood");

        Books[] books = {books1, books2, books3};

        printReaders(readers);
        printBooks(books);

        reader1.personTakeBook(2);
        reader2.personTakeBook("The Cubes of Ganymede");
        reader3.personReturnBook(books1, books3);

        reader1.personReturnBook(2);
        reader1.personReturnBook("The Cubes of Ganymede");
        reader1.personReturnBook(books1);
    }

    private static void printBooks(Books[] books) {
        System.out.println("Books:");
        for (Books book : books) {
            System.out.println(book.getInfo());
        }
        System.out.println();
    }

    private static void printReaders(Reader[] readers) {
        System.out.println("Readers:");
        for (Reader reader : readers) {
            System.out.println(reader.getInfo());
        }
        System.out.println();
    }
}
