package Day05;

public class Imdb {
    public static void main(String[] args) {
        Movie movie = new Movie("Star trek",1964);

        System.out.println(movie.MovieRate(4));
        System.out.println(movie.MovieRate(5));
        System.out.println(movie.MovieRate(2));

        Viewer viewer = new Viewer();
        viewer.watchMovie(movie, 3);

        System.out.println(movie.getAvgRate());
    }
}
