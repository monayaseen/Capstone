package com.example.toysstore.database;

import android.os.Parcel;
import android.os.Parcelable;

import androidx.room.Entity;
import androidx.room.Ignore;
import androidx.room.PrimaryKey;

@Entity(tableName = "Later_on")
public class Toy implements Parcelable {

    @PrimaryKey
    private int id;
    private String name;
    private String desc;
    private String buy_url;
    private String pic_url;
    @Ignore
    public Toy(){ }

    public Toy(int id, String name, String desc, String buy_url ,String pic_url ) {
        this.id = id;
        this.name = name;
        this.desc = desc;
        this.buy_url=buy_url;
        this.pic_url=pic_url;
//        this.toy_pic=toy_pic;


    }

    @Ignore
    protected Toy(Parcel in) {
        id = in.readInt();
        name = in.readString();
        buy_url = in.readString();
        desc = in.readString();
        pic_url = in.readString();

    }
    public static final Creator<Toy> CREATOR = new Creator<Toy>() {
        @Override
        public Toy createFromParcel(Parcel in) {
            return new Toy(in);
        }

        @Override
        public Toy[] newArray(int size) {
            return new Toy[size];
        }
    };
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBuy_url() {
        return buy_url;
    }

    public void setBuy_url(String cover_url) {
        this.buy_url = cover_url;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getPic_url() {
        return pic_url;
    }

    public void setPic_url(String cover_url) {
        this.pic_url = cover_url;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(id);
        parcel.writeString(name);
        parcel.writeString(buy_url);
        parcel.writeString(pic_url);
        parcel.writeString(desc);
    }
}