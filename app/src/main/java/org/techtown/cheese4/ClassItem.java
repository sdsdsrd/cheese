package org.techtown.cheese4;

public class ClassItem {
    String title;
    String name;
    String phoneNumber;
    String location;
    String time;
    String price;
    int resId;

    public ClassItem(String title, String name, String phoneNumber, String location, String time, String price, int resId) {
        this.title = title;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.location = location;
        this.time = time;
        this.price = price;
        this.resId = resId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public int getResId() {
        return resId;
    }

    public void setResId(int resId) {
        this.resId = resId;
    }
}
