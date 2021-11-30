package model;

public class model {
    private int image;
    private String post;

    public model(int image, String post) {
        this.image = image;
        this.post = post;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }
}
