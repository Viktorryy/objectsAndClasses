import java.util.Objects;

public class Book {
        String bookName;
        Author authorName;
        int yearPublication;

    public Book (String bookName, Author authorName, int yearPublication) {
        this.bookName = bookName;
        this.authorName = authorName;
        this.yearPublication = yearPublication;
        //return;
    }

    public String getBookName () {
        return bookName;
    }
    public  Author getAuthorName () {
        return authorName;
    }
    public int getYearPublication() {
        return yearPublication;
    }
    public void setYearPublication(int yearPublication) {
        this.yearPublication = yearPublication;
    }
    public Author getAuthor() {
        return this.authorName;
    }

    public String toString() {
        return this.bookName + ", Автор: " + this.authorName +
                ", Год публикации: " + this.yearPublication;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book)) return false;
        Book book = (Book) o;
        return getYearPublication() == book.getYearPublication() && getBookName().equals(book.getBookName()) && getAuthorName().equals(book.getAuthorName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getBookName(), getAuthorName(), getYearPublication());
    }
}
