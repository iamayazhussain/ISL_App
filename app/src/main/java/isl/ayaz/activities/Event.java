package isl.ayaz.activities;

public class Event {
    private int id;
    private String title;
    private String date;
    private String venue;
    private String link;
    private String image;

    public Event(int id, String title,  String date, String venue, String link, String image) {
        this.id = id;
        this.title = title;
        this.date = date;
        this.venue = venue;
        this.link = link;
        this.image = image;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getDate() {
        return date;
    }

    public String getVenue() {
        return venue;
    }

    public String getLink() {
        return link;
    }

    public String getImage() {
        return image;
    }
}