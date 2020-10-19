package Problem3;
//Movie Done
import java.util.UUID;

public abstract class Movie implements StoreMediaOperations {
    String rating;
    String title;
    UUID id;

    public Movie(String rating, String title) {
        this.id = UUID.randomUUID();
        // homework
        this.rating = rating;
        this.title = title;
    }

    public Movie(Movie anotherMovie) {
        // homework
        this.rating = anotherMovie.rating;
        this.title = anotherMovie.title;
        this.id = anotherMovie.id;
    }

    @Override
    public boolean equals(Object obj) {
        // homework
        if (obj == this) {
            return true;
        } else if (!(obj instanceof Movie)) {
            return false;
        }
        Movie other = (Movie) obj;
        boolean idEqual = (this.id == other.id);
        System.out.println(other.id + " " + this.id);
        System.out.println(idEqual);
        return idEqual;
    }
}
