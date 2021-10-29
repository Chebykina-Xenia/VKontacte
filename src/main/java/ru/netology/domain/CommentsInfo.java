package ru.netology.domain;
import java.util.Date;

public class CommentsInfo {
    private int countComment;           //количество комментариев
    private boolean commentCurrentPost; //можно ли комментировать текущую запись
    private int idComment;              //идентификатор комментария
    private String textComment;         //текст комментария
    private int idAvtorComment;         //идентификатор автора комментария
    private String nameAvtorComment;    //имя автора
    private String dateTimeComment;     //дата и время комментария
    private int countLikeComment;       //количество Мне нравится на комментарии

    public int getCountComment() {
        return countComment;
    }

    public void setCountComment(int countComment) {
        this.countComment = countComment;
    }

    public boolean isCommentCurrentPost() {
        return commentCurrentPost;
    }

    public void setCommentCurrentPost(boolean commentCurrentPost) {
        this.commentCurrentPost = commentCurrentPost;
    }

    public int getIdComment() {
        return idComment;
    }

    public void setIdComment(int idComment) {
        this.idComment = idComment;
    }

    public String getTextComment() {
        return textComment;
    }

    public void setTextComment(String textComment) {
        this.textComment = textComment;
    }

    public int getIdAvtorComment() {
        return idAvtorComment;
    }

    public void setIdAvtorComment(int idAvtorComment) {
        this.idAvtorComment = idAvtorComment;
    }

    public String getNameAvtorComment() {
        return nameAvtorComment;
    }

    public void setNameAvtorComment(String nameAvtorComment) {
        this.nameAvtorComment = nameAvtorComment;
    }

    public String getDateTimeComment() {
        return dateTimeComment;
    }

    public void setDateTimeComment(String dateTimeComment) {
        this.dateTimeComment = dateTimeComment;
    }

    public int getCountLikeComment() {
        return countLikeComment;
    }

    public void setCountLikeComment(int countLikeComment) {
        this.countLikeComment = countLikeComment;
    }
}
