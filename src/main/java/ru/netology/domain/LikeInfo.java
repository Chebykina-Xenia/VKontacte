package ru.netology.domain;

public class LikeInfo {
    private int countLikePost;          //количество лайков
    private int idAvtorLikePost;        //идентификатор автора, кто поставил лайк
    private boolean likeCurrentIdAvtor; //есть ли лайк от текущего пользователя

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

    public boolean isLikeCurrentIdAvtor() {
        return likeCurrentIdAvtor;
    }

    public void setLikeCurrentIdAvtor(boolean likeCurrentIdAvtor) {
        this.likeCurrentIdAvtor = likeCurrentIdAvtor;
    }
}
