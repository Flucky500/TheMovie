public class TheMovie {

    private String title;
    private String author;
    private int duration;
    private int yearOfProduction;

    public TheMovie(String title, String author, int duration, int yearOfProduction) {
        this.title = title;
        this.author = author;
        this.duration = duration;
        this.yearOfProduction = yearOfProduction;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getDuration() {
       return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }

    public void setYearOfProduction(int yearOfProduction) {
        this.yearOfProduction = yearOfProduction;
    }

    }

