package project.Movie;
    public class Year {
        private int year;

        public Year(int year) {
            this.year = year;
        }

        public int getYear() {
            return year;
        }

        public void setYear(int year) {
            this.year = year;
        }

        @Override
        public String toString() {
            return "Year{" +
                    "year=" + year +
                    '}';
        }
}
