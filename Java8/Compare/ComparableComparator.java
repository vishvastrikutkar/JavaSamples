package Java8.Compare;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Movie implements Comparable<Movie> {
    private final double rating;
    private final String name;
    private final int releaseYear;

    @Override
    public int compareTo(Movie o) {
        // Descending Order
        // return o.releaseYear - this.releaseYear;

        // Ascending Order
        //return this.releaseYear - o.releaseYear;
        return Integer.compare(o.releaseYear,this.releaseYear);
    }

    public Movie(double movieRating, String movieName, int movieReleaseYear) {
        this.rating = movieRating;
        this.name = movieName;
        this.releaseYear = movieReleaseYear;
    }

    public String getName() {
        return name;
    }

    public double getRating() {
        return rating;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    @Override
    public String toString() {
        return this.getName() + " " +
                this.getRating() + " " +
                this.getReleaseYear();
    }
}

class RatingCompare implements Comparator<Movie> {
    @Override
    public int compare(Movie o1, Movie o2) {
        if (o1.getRating() < o2.getRating())
            return -1;
        if (o1.getRating() > o2.getRating())
            return 1;
        else
            return 0;
    }
}

class NameCompare implements Comparator<Movie> {
    @Override
    public int compare(Movie o1, Movie o2) {
        return o1.getName().compareTo(o2.getName());
    }
}

public class ComparableComparator {
    public static void main(String[] args) {
        ArrayList<Movie> movies = new ArrayList<Movie>();
        movies.add(new Movie(9.3,"Pursuit Of HappYness",1994));
        movies.add(new Movie(8.7,"Star Wars",1990));
        movies.add(new Movie(9.1,"Dil Chahata hai",2006));
        movies.add(new Movie(8.7,"Dil",1992));

        Collections.sort(movies);

        System.out.println();
        System.out.println("Movies Sorted by the year: ");
        System.out.println("----------------------------------------------");
        movies.forEach(m -> System.out.println(m.toString()));

        System.out.println();
        System.out.println("Movies Sorted by the rating");
        System.out.println("----------------------------------------------");
        RatingCompare ratingCompare = new RatingCompare();
        movies.sort(ratingCompare);

        movies.forEach(m -> System.out.println(m.toString()));

        System.out.println();
        System.out.println("Movies Sorted by the Name");
        System.out.println("----------------------------------------------");

        NameCompare nameCompare = new NameCompare();
        movies.sort(nameCompare);
        movies.forEach(m -> System.out.println(m.toString()));
    }
}
