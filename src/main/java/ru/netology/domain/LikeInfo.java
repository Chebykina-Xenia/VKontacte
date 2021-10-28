package ru.netology.domain;

public class LikeInfo {
    private int countLikePost;          //количество лайков
    private int idAvtorLikePost;        //идентификатор автора, кто поставил лайк

    public int getCountLikePost() {
        return countLikePost;
    }

    public void setCountLikePost(int countLikePost) {
        this.countLikePost = countLikePost;
    }

    public int getIdAvtorLikePost() {
        return idAvtorLikePost;
    }

    public void setIdAvtorLikePost(int idAvtorLikePost) {
        this.idAvtorLikePost = idAvtorLikePost;
    }
}
