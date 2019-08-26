package com.xuxi.advancedtechniquestest;

import android.os.Parcel;
import android.os.Parcelable;

public class Person1 implements Parcelable {

    private String name;

    private int age;

    protected Person1(Parcel in) {
    }

    public static final Creator<Person1> CREATOR = new Creator<Person1>() {
        @Override
        public Person1 createFromParcel(Parcel in) {
            Person1 person1 = new Person1();
            person1.name = in.readString();//读取name
            person1.age = in.readInt();//读取age

            return new Person1(in);
        }

        @Override
        public Person1[] newArray(int size) {
            return new Person1[size];
        }
    };

    public Person1() {

    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
    }
}
