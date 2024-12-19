import java.util.*;
interface BookDetails {
    void addBook(String bookName, String authorName);
    void displayBooks();
}

interface LibraryMembership {
    void registerMember(String memberName);
    void displayMembers();
}

class Library implements BookDetails, LibraryMembership {
    List<String> books = new ArrayList<>();
    List<String> members = new ArrayList<>();

    @Override
    public void addBook(String bookName, String authorName) {
        books.add(bookName + " by " + authorName);
    }

    @Override
    public void displayBooks() {
        System.out.println("Books in the Library:");
        for (String book : books) {
            System.out.println(book);
        }
    }

    @Override
    public void registerMember(String memberName) {
        members.add(memberName);
    }

    @Override
    public void displayMembers() {
        System.out.println("Library Members:");
        for (String member : members) {
            System.out.println(member);
        }
    }
}

public class LibrarySystem {
    public static void main(String[] args) {
        Library library = new Library();

        library.addBook("1984", "George Orwell");
        library.addBook("To Kill a Mockingbird", "Harper Lee");

        library.registerMember("Nitakshi");
        library.registerMember("Anushka");

        library.displayBooks();
        library.displayMembers();
    }
}
