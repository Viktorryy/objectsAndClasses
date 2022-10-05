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

}
