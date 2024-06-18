package bitcamp.myapp.vo;

public class Board {

    private String postTitle;
    private String postDescription;
    private String postDate;
    private int postViews; // 조회수 필드 추가

    public String getPostTitle() {
        return postTitle;
    }

    public void setPostTitle(String postTitle) {
        this.postTitle = postTitle;
    }

    public String getPostDescription() {
        return postDescription;
    }

    public void setPostDescription(String postDescription) {
        this.postDescription = postDescription;
    }

    public String getPostDate() {
        return postDate;
    }

    public void setPostDate(String postDate) {
        this.postDate = postDate;
    }

    public int getPostViews() {
        return postViews;
    }

    public void increasePostViews() {
        this.postViews++;
    }
}
