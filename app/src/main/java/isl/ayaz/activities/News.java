package isl.ayaz.activities;

public class News {


    private int id;
    private String title;
    private String shortdesc;
    private String date;
    private String link;

    public News(int id, String title, String shortdesc, String date, String link) {
        this.id = id;
        this.title = title;
        this.shortdesc = shortdesc;
        this.date = date;
        this.link = link;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getShortdesc() {
        return shortdesc;
    }

    public String getDate() {
        return date;
    }

    public String getLink() {
        return link;
    }

}