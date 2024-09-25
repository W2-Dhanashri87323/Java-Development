import java.util.*;

enum Category {
    FICTION, NON_FICTION, SCIENCE, HISTORY, TECHNOLOGY, MYSTERY, BIOGRAPHY
}

class Book {
    private String isbn;
    private Category category;
    private double price;
    private String publishDate; // YYYY-MM-DD format
    private String authorName;
    private int quantity;

    public Book(String isbn, Category category, double price, String publishDate, String authorName, int quantity) {
        this.isbn = isbn;
        this.category = category;
        this.price = price;
        this.publishDate = publishDate;
        this.authorName = authorName;
        this.quantity = quantity;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getPublishDate() {
        return publishDate;
    }

    @Override
    public String toString() {
        return "Book{" +
                "ISBN='" + isbn + '\'' +
                ", Category=" + category +
                ", Price=" + price +
                ", Publish Date='" + publishDate + '\'' +
                ", Author Name='" + authorName + '\'' +
                ", Quantity=" + quantity +
                '}';
    }
}

public class Program {
    public static void main(String[] args) {
        
        Set<Book> bookSet = new HashSet<>();
        Scanner scanner = new Scanner(System.in);

        
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter details for Book " + (i + 1) + ":");

            System.out.print("ISBN: ");
            String isbn = scanner.nextLine();

            System.out.print("Category (FICTION, NON_FICTION, SCIENCE, HISTORY, TECHNOLOGY, MYSTERY, BIOGRAPHY): ");
            Category category = Category.valueOf(scanner.nextLine().toUpperCase());

            System.out.print("Price: ");
            double price = Double.parseDouble(scanner.nextLine());

            System.out.print("Publish Date (YYYY-MM-DD): ");
            String publishDate = scanner.nextLine();

            System.out.print("Author Name: ");
            String authorName = scanner.nextLine();

            System.out.print("Quantity: ");
            int quantity = Integer.parseInt(scanner.nextLine());

            
            Book book = new Book(isbn, category, price, publishDate, authorName, quantity);
            bookSet.add(book);
        }

        
        List<Book> bookList = new ArrayList<>(bookSet);

      
        bookList.sort(Comparator.comparing(Book::getPublishDate));

    
        System.out.println("\nLibrary Book Details (sorted by publish date):");
        for (Book book : bookList) {
            System.out.println(book);
        }

        scanner.close();
    }
}
