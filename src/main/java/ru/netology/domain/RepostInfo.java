package ru.netology.domain;

public class RepostInfo {
    private int countRepost;            //количество репостов
    private int idAvtorRepost  ;        //идентификатор автора, кто репостнул
    private boolean repostCurrentIdAvtor; //есть ли репост от текущего пользователя

    public int getCountRepost() {
        return countRepost;
    }

    public void setCountRepost(int countRepost) {
        this.countRepost = countRepost;
    }

    public int getIdAvtorRepost() {
        return idAvtorRepost;
    }

    public void setIdAvtorRepost(int idAvtorRepost) {
        this.idAvtorRepost = idAvtorRepost;
    }

    public boolean isRepostCurrentIdAvtor() {
        return repostCurrentIdAvtor;
    }

    public void setRepostCurrentIdAvtor(boolean repostCurrentIdAvtor) {
        this.repostCurrentIdAvtor = repostCurrentIdAvtor;
    }
}
