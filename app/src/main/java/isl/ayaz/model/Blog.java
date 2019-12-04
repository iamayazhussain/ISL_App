package isl.ayaz.model;


public class Blog {

    private String name ;
    private String venue ;
    private String date ;
    private String link1 ;
    private String Description1;
    private String Description2;
    private String image_url;
    private String image_url1;
    private String image_url2;

    public Blog() {
    }

    public Blog(String name, String venue, String date, String link1, String description1, String description2, String image_url, String image_url1, String image_url2) {
        this.name = name;
        this.venue = venue;
        this.date = date;
        this.link1 = link1;
        Description1 = description1;
        Description2 = description2;
        this.image_url = image_url;
        this.image_url1 = image_url1;
        this.image_url2 = image_url2;
    }



    public String getName() {
        return name;
    }

    public String getVenue() {
        return venue;
    }

    public String getDate() {
        return date;
    }

    public String getLink1() { return link1;  }

    public String getDescription1() {
        return Description1;
    }

    public String getDescription2() {
        return Description2;
    }

    public String getImage_url() { return image_url;  }

    public String getImage_url1() {  return image_url1; }

    public String getImage_url2() {  return image_url2; }




    public void setName(String name) {
        this.name = name;
    }

    public void setVenue(String venue) {
        this.venue = venue;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setLink1(String link1) { this.link1 = link1;}

    public void setDescription1(String description1) {
        Description1 = description1;
    }

    public void setDescription2(String description2) {
        Description2 = description2;
    }

    public void setImage_url(String image_url) { this.image_url = image_url;    }

    public void setImage_url1(String image_url1) { this.image_url1 = image_url1; }

    public void setImage_url2(String image_url2) { this.image_url2 = image_url2; }

}
