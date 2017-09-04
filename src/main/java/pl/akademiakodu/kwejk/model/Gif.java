package pl.akademiakodu.kwejk.model;

public class Gif {
    private String title;
    private String username;

    public Gif(){}

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Gif(String title, String username) {
        this.title = title;
        this.username = username;
    }
}
