package com.mobile.praktekmp2.Roomdata;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

import com.mobile.praktekmp2.Entity.Mahasiswa;

import java.util.List;

@Dao
public interface mahasiswaDAO {
    @Query("SELECT * From Mahasiswa")
    List<Mahasiswa> getAll();
    @Query("SELECT * FROM mahasiswa WHERE ` namamahasiswa` LIKE :nama ")
    Mahasiswa findByName(String nama);
    @Insert
    void insertAll(Mahasiswa... mahasiswa);
    @Delete
    public void deleteUsers(Mahasiswa... users);
}
