public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        // Добавление книг в библиотеку
        Book<String> book1 = new Book<>("Война и Мир");
        library.addBook(book1, 354, "Лев Толстой", 1869);

        Book<String> book2 = new Book<>("Преступление и наказание");
        library.addBook(book2, 357, "Федор Достоевский", 1866);

        Book<String> book3 = new Book<>("Мастер и Маргарита");
        library.addBook(book1, 368, "Михаил Булгаков", 1966);

        Book<String> book4 = new Book<>("Мертвые души");
        library.addBook(book1, 373, "Николай Гоголь", 1842);

        LibraryCard<Integer, String> card1 = library.lendBook(354);
        LibraryCard<Integer, String> card2 = library.lendBook(357);
        LibraryCard<Integer, String> card3 = library.lendBook(368);
        LibraryCard<Integer, String> card4 = library.lendBook(373);

        library.displayIssuedBooks();
    }
}