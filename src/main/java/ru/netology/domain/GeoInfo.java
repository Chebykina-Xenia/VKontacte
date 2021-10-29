package ru.netology.domain;

public class GeoInfo {
    private int idGeo;         //идентификатор места
    private String nameGeo;    //название места
    private int longitude;     //координаты — долгота
    private int latitude;      //координаты — широта
    private int country;       //идентификатор страны
    private int city;          //идентификатор города
    private String address;    //адрес

    public int getIdGeo() {
        return idGeo;
    }

    public void setIdGeo(int idGeo) {
        this.idGeo = idGeo;
    }

    public String getNameGeo() {
        return nameGeo;
    }

    public void setNameGeo(String nameGeo) {
        this.nameGeo = nameGeo;
    }

    public int getLongitude() {
        return longitude;
    }

    public void setLongitude(int longitude) {
        this.longitude = longitude;
    }

    public int getLatitude() {
        return latitude;
    }

    public void setLatitude(int latitude) {
        this.latitude = latitude;
    }

    public int getCountry() {
        return country;
    }

    public void setCountry(int country) {
        this.country = country;
    }

    public int getCity() {
        return city;
    }

    public void setCity(int city) {
        this.city = city;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
