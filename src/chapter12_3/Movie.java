package chapter12_3;

public class Movie {
    private String title;
    private double revenue;
    private int year;

    public Movie(String title, double revenue, int year) {
        this.title = title;
        this.revenue = revenue;
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public double getRevenue() {
        return revenue;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "title='" + title + '\'' +
                ", revenue=" + revenue +
                ", year=" + year +
                '}';
    }
}
