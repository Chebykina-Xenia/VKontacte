package ru.netology.domain;
import java.util.Date;

public class Post {
    private int idPost;                 //идентификатор поста
    private int idAvtorPost;            //идентификатор автора
    private String nameAvtorPost;       //имя автора
    private String dateTimePost;        //дата и время поста
    private String textPost;            //текст поста
    private int countRepost;            //количество репостов
    private int countPreview;           //количество просмотров
    private int countComment;           //количество комментариев
    private String imageUrl;            //сслыка на изображение или видео
    private String failUrl;             //ссылка на прикреплённый файл
    private boolean recordPinned;       //закреплена запись или нет
    private CommentsInfo commentsInfo;  //класс с комментариями
    private LikeInfo likeInfo;          //класс с лайками

    public int getIdPost() {
        return idPost;
    }

    public void setIdPost(int idPost) {
        this.idPost = idPost;
    }

    public int getIdAvtorPost() {
        return idAvtorPost;
    }

    public void setIdAvtorPost(int idAvtorPost) {
        this.idAvtorPost = idAvtorPost;
    }

    public String getNameAvtorPost() {
        return nameAvtorPost;
    }

    public void setNameAvtorPost(String nameAvtorPost) {
        this.nameAvtorPost = nameAvtorPost;
    }

    public String getDateTimePost() {
        return dateTimePost;
    }

    public void setDateTimePost(String dateTimePost) {
        this.dateTimePost = dateTimePost;
    }

    public String getTextPost() {
        return textPost;
    }

    public void setTextPost(String textPost) {
        this.textPost = textPost;
    }

    public int getCountRepost() {
        return countRepost;
    }

    public void setCountRepost(int countRepost) {
        this.countRepost = countRepost;
    }

    public int getCountPreview() {
        return countPreview;
    }

    public void setCountPreview(int countPreview) {
        this.countPreview = countPreview;
    }

    public int getCountComment() {
        return countComment;
    }

    public void setCountComment(int countComment) {
        this.countComment = countComment;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getFailUrl() {
        return failUrl;
    }

    public void setFailUrl(String failUrl) {
        this.failUrl = failUrl;
    }

    public boolean isRecordPinned() {
        return recordPinned;
    }

    public void setRecordPinned(boolean recordPinned) {
        this.recordPinned = recordPinned;
    }

}
