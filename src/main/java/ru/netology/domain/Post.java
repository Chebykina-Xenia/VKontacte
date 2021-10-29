package ru.netology.domain;
import java.util.Date;

public class Post {
    private int idPost;                 //идентификатор поста (записи)
    private int idAvtor;                //идентификатор владельца стены, на которой размещена запись
    private int idAvtorPost;            //идентификатор автора (от чьего имени опубликована запись)
    private String nameAvtorPost;       //имя автора
    private String dateTimePost;        //дата и время поста
    private String textPost;            //текст поста
    private int countPreview;           //количество просмотров
    private String imageUrl;            //сслыка на изображение или видео/медиавложения
    private String failUrl;             //ссылка на прикреплённый файл/документ
    private boolean recordPinned;       //закреплена запись или нет
    private CommentsInfo commentsInfo;  //класс с комментариями
    private LikeInfo likeInfo;          //класс с лайками
    private RepostInfo RepostInfo;      //класс с репостами
    private GeoInfo GeoInfo;            //класс местоположение

    private boolean curAvtorCanPinPost; //текущий автор может закрепить запись
    private boolean curAvtorCanDeletePost; //текущий автор может удалять запись
    private boolean curAvtorCanEditPost;    //текущий автор может редактировать запись

    public int getIdPost() {
        return idPost;
    }

    public void setIdPost(int idPost) {
        this.idPost = idPost;
    }

    public int getIdAvtor() {
        return idAvtor;
    }

    public void setIdAvtor(int idAvtor) {
        this.idAvtor = idAvtor;
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

    public int getCountPreview() {
        return countPreview;
    }

    public void setCountPreview(int countPreview) {
        this.countPreview = countPreview;
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

    public boolean isCurAvtorCanPinPost() {
        return curAvtorCanPinPost;
    }

    public void setCurAvtorCanPinPost(boolean curAvtorCanPinPost) {
        this.curAvtorCanPinPost = curAvtorCanPinPost;
    }

    public boolean isCurAvtorCanDeletePost() {
        return curAvtorCanDeletePost;
    }

    public void setCurAvtorCanDeletePost(boolean curAvtorCanDeletePost) {
        this.curAvtorCanDeletePost = curAvtorCanDeletePost;
    }

    public boolean isCurAvtorCanEditPost() {
        return curAvtorCanEditPost;
    }

    public void setCurAvtorCanEditPost(boolean curAvtorCanEditPost) {
        this.curAvtorCanEditPost = curAvtorCanEditPost;
    }
}
