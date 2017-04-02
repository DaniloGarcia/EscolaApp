package br.com.lsds.escolaapp.models;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by Danilo on 01/04/2017.
 */

public class Alunos implements Parcelable {
    private String name;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Alunos(String name) {
        this.name = name;
    }

    /* Parcelable */

    public Alunos(Parcel in) {
        name = in.readString();
    }

    public static final Creator<Alunos> CREATOR = new Creator<Alunos>() {
        @Override
        public Alunos createFromParcel(Parcel in) {
            return new Alunos(in);
        }

        @Override
        public Alunos[] newArray(int size) {
            return new Alunos[size];
        }
    };


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(name);
    }
}
