package project.Movie;

/**
 * @author: medo , sultan
 * @course: itec 2140
 * @section: 09 fall
 * @writen: dec , 1 , 2023
 * @description: this program is a movie program that takes three objects year , title , genre
 * @quistion:Create a class named movie with three objects 1-title 2- genre 3-year.
 *
 * 6. Create a method that prints the title, year and, genre
 *
 * 7. Create a class Tester for the movie class.
 */
    public class Movie {
        private Title title;
        private Genre genre;
        private Year year;

        public Movie(Title title, Genre genre, Year year) {
            this.title = title;
            this.genre = genre;
            this.year = year;
        }

        public Title getTitle() {
            return title;
        }

        public void setTitle(Title title) {
            this.title = title;
        }

        public Genre getGenre() {
            return genre;
        }

        public void setGenre(Genre genre) {
            this.genre = genre;
        }

        public Year getYear() {
            return year;
        }

        public void setYear(Year year) {
            this.year = year;
        }
        public String wright(Title title, Genre genre, Year year ) {
            this.title = title;
            this.genre = genre;
            this.year = year;
            return title + genre + year;
        }

        @Override
        public String toString() {
            return "Movie has a " +
                    "title = " + title +
                    ", a genre = " + genre +
                    "and, a year = " + year;
        }
    }
    class MovieTester {
        public static void main(String[] args) {
            Movie m1 = new Movie(new Title ("Nacho Libre"),new Genre("Comedy"), new Year(2006));
            m1.wright;
        }
}
