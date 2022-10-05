public class Author {
    String authorFirstName;
    String authorLastName;
    //String getFullName;

    public Author (String authorFirstName, String authorLastName) {
        this.authorFirstName = authorFirstName;
        this.authorLastName = authorLastName;
    }



    public String getFullName() {
        return this.authorFirstName + " " + this.authorLastName;
    }

    // public static Author getFullName(Author djerom) {    }

    public String getAuthorFirstName() {
        return authorFirstName;
    }

    public String getAuthorLastName() {
        return authorLastName;
    }
   // public String getfFullName() {    }

}
