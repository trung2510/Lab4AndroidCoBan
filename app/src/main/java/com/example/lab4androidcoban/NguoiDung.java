package com.example.lab4androidcoban;

public class NguoiDung {
    String mName,mBorn;

    public NguoiDung(String mName, String mBorn) {
        this.mName = mName;
        this.mBorn = mBorn;
    }

    public NguoiDung() {

    }


    public String getmName() {
        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }

    public String getmBorn() {
        return mBorn;
    }

    public void setmBorn(String mBorn) {
        this.mBorn = mBorn;
    }
}
