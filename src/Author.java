import java.util.Objects;

public class Author {
    String authorFirstName;
    String authorLastName;
    //String getFullName;

    public Author (String authorFirstName, String authorLastName) {
        this.authorFirstName = authorFirstName;
        this.authorLastName = authorLastName;
    }

    //public String getFullName() {
   //     return this.authorFirstName + " " + this.authorLastName;
   // }

   public String getAuthorFirstName() {
        return authorFirstName;
    }

    public String getAuthorLastName() {
        return authorLastName;
    }

    public String toString() {
        return this.authorFirstName + " " + this.authorLastName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Author)) return false;
        Author author = (Author) o;
        return Objects.equals(getAuthorFirstName(), author.getAuthorFirstName()) && Objects.equals(getAuthorLastName(), author.getAuthorLastName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getAuthorFirstName(), getAuthorLastName());
    }


}
