
    public class Main {
        public static void main(String[] args) {
            Movie movie = new Movie("Top Gun: Maverick", "Joseph Kosinski", 131, 2022);
            System.out.println("Movie tittle: " + movie.getMovieTittle());
            System.out.println("Movie director: " + movie.getMovieDirector());
            System.out.println("Movie duration in minutes: " + movie.getMovieDurationInMinutes());
            System.out.println("Movie year production: " + movie.getYearOfProcudtion());
        }
    }
