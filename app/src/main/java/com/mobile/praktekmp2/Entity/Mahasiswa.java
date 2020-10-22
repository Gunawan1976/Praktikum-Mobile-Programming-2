package com.mobile.praktekmp2.Entity;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class Mahasiswa {
    @PrimaryKey(autoGenerate = true)
    int id;
    @ColumnInfo(name = " namamahasiswa")
    String namamahasiswa;
    @ColumnInfo(name = " NIM ")
    String NIM;
    @ColumnInfo(name = " jurusan ")
    String jurusan;

    public int getId(){return id;}
    public void setId(int id){this.id=id;}
    public String getNamamahasiswa(){return namamahasiswa;}
    public void setNamamahasiswa(String namamahasiswa){this.namamahasiswa=namamahasiswa;}
    public String getNIM(){return NIM;}
    public void setNIM(String NIM){this.NIM=NIM;}
    public String getJurusan(){return jurusan;}
    public void setJurusan(String jurusan){this.jurusan=jurusan;}

}
