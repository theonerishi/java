public class Album {
    private String title;
    private String author;
    private int hours;
    private int minutes;
    private int seconds;
    private int year;
    public Album(String title, String author, int year, int hours, int minutes, int seconds)
    {
        this.title = title;
        this.author = author;
        this.year = year;
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }
}
