package isl.ayaz.activities;

public class Blog {
    private int id;
    private String title;
    private String shortdesc;
    private String link;
    private String date;
    private String image;

    public Blog(int id, String title, String shortdesc, String link, String date, String image) {
        this.id = id;
        this.title = title;
        this.shortdesc = shortdesc;
        this.link = link;
        this.date = date;
        this.image = image;
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

    public String getLink() {
        return link;
    }

    public String getDate() {
        return date;
    }

    public String getImage() {
        return image;
    }
}