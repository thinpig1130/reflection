
@CustomAnnotation("hash_002")
public class Book {

    public static String staticAttr = "기본값";

    private static int secretStaticNumber = 1;

    public String publicAttr;

    private String name;
    private String isbn;

    private String secretName;

    private double randomNumber= Math.random();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    private int sum(int a, int b){
        return a + b;
    }

    public Book() {
    }

    public Book(String name, String isbn, double randomNumber) {
        this.name = name;
        this.isbn = isbn;
        this.randomNumber = randomNumber;
    }
}
