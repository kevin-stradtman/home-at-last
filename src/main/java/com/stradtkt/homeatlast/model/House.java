package com.stradtkt.homeatlast.model;

import javax.persistence.*;
import java.sql.Blob;

@Entity
public class House {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String address1;
    private String address2;
    private String city;
    private Character state;
    private String zipCode;
    private String price;
    private Integer beds;
    private Double baths;
    private Integer garages;
    private Double lotSize;
    private Double sqft;
    private String description;
    private Boolean isHotDeal;
    private Byte[] photoMain;
    private Byte[] photo2;
    private Byte[] photo3;
    private Byte[] photo4;
    private Byte[] photo5;
    private Byte[] photo6;
    private Byte[] photo7;
    private Byte[] photo8;
    private Byte[] photo9;
   @ManyToOne
   @JoinColumn(name="owner_id", nullable=false)
   private Owner owner;

    public House() {
    }

    public House(String address1, String address2, String city, Character state,
                 String zipCode, String price, Integer beds, Double baths, Integer garages,
                 Double lotSize, Double sqft, String description, Boolean isHotDeal, Byte[] photoMain,
                 Byte[] photo2, Byte[] photo3, Byte[] photo4, Byte[] photo5, Byte[] photo6, Byte[] photo7, Byte[] photo8, Byte[] photo9) {
        this.address1 = address1;
        this.address2 = address2;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
        this.price = price;
        this.beds = beds;
        this.baths = baths;
        this.garages = garages;
        this.lotSize = lotSize;
        this.sqft = sqft;
        this.description = description;
        this.isHotDeal = isHotDeal;
        this.photoMain = photoMain;
        this.photo2 = photo2;
        this.photo3 = photo3;
        this.photo4 = photo4;
        this.photo5 = photo5;
        this.photo6 = photo6;
        this.photo7 = photo7;
        this.photo8 = photo8;
        this.photo9 = photo9;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAddress1() {
        return address1;
    }

    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    public String getAddress2() {
        return address2;
    }

    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Character getState() {
        return state;
    }

    public void setState(Character state) {
        this.state = state;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public Integer getBeds() {
        return beds;
    }

    public void setBeds(Integer beds) {
        this.beds = beds;
    }

    public Double getBaths() {
        return baths;
    }

    public void setBaths(Double baths) {
        this.baths = baths;
    }

    public Integer getGarages() {
        return garages;
    }

    public void setGarages(Integer garages) {
        this.garages = garages;
    }

    public Double getLotSize() {
        return lotSize;
    }

    public void setLotSize(Double lotSize) {
        this.lotSize = lotSize;
    }

    public Double getSqft() {
        return sqft;
    }

    public void setSqft(Double sqft) {
        this.sqft = sqft;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Boolean getHotDeal() {
        return isHotDeal;
    }

    public void setHotDeal(Boolean hotDeal) {
        isHotDeal = hotDeal;
    }

    public Byte[] getPhotoMain() {
        return photoMain;
    }

    public void setPhotoMain(Byte[] photoMain) {
        this.photoMain = photoMain;
    }

    public Byte[] getPhoto2() {
        return photo2;
    }

    public void setPhoto2(Byte[] photo2) {
        this.photo2 = photo2;
    }

    public Byte[] getPhoto3() {
        return photo3;
    }

    public void setPhoto3(Byte[] photo3) {
        this.photo3 = photo3;
    }

    public Byte[] getPhoto4() {
        return photo4;
    }

    public void setPhoto4(Byte[] photo4) {
        this.photo4 = photo4;
    }

    public Byte[] getPhoto5() {
        return photo5;
    }

    public void setPhoto5(Byte[] photo5) {
        this.photo5 = photo5;
    }

    public Byte[] getPhoto6() {
        return photo6;
    }

    public void setPhoto6(Byte[] photo6) {
        this.photo6 = photo6;
    }

    public Byte[] getPhoto7() {
        return photo7;
    }

    public void setPhoto7(Byte[] photo7) {
        this.photo7 = photo7;
    }

    public Byte[] getPhoto8() {
        return photo8;
    }

    public void setPhoto8(Byte[] photo8) {
        this.photo8 = photo8;
    }

    public Byte[] getPhoto9() {
        return photo9;
    }

    public void setPhoto9(Byte[] photo9) {
        this.photo9 = photo9;
    }

    @Override
    public String toString() {
        return "Home{" +
                "id=" + id +
                ", address1='" + address1 + '\'' +
                ", address2='" + address2 + '\'' +
                ", city='" + city + '\'' +
                ", state=" + state +
                ", zipCode='" + zipCode + '\'' +
                ", price='" + price + '\'' +
                ", beds=" + beds +
                ", baths=" + baths +
                ", garages=" + garages +
                ", lotSize=" + lotSize +
                ", sqft=" + sqft +
                ", description=" + description +
                ", isHotDeal=" + isHotDeal +
                ", photoMain=" + photoMain +
                ", photo2=" + photo2 +
                ", photo3=" + photo3 +
                ", photo4=" + photo4 +
                ", photo5=" + photo5 +
                ", photo6=" + photo6 +
                ", photo7=" + photo7 +
                ", photo8=" + photo8 +
                ", photo9=" + photo9 +
                '}';
    }
}
