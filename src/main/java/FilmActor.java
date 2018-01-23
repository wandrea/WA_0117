public class FilmActor {
    private String filmTitle;
    private String lastName;
    private String firstName;

    public FilmActor() {
    }

    public FilmActor(String filmTitle, String lastName, String firstName) {
        this.filmTitle = filmTitle;
        this.lastName = lastName;
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getFilmTitle() {
        return filmTitle;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public String toString() {
        return "FilmActor{" +
                "filmTitle='" + filmTitle + '\'' +
                ", lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                '}';
    }
}
