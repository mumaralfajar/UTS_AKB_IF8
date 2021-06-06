package com.example.a10118340_uts_akb_if8;

import android.database.Cursor;

import com.example.a10118340_uts_akb_if8.Note;
import com.example.a10118340_uts_akb_if8.Note;

/*
    Tanggal         : 07/06/2021
    NIM             : 10118340
    Nama            : Muhammad Umar Al Fajar
    Kelas           : IF8
    Matakuliah      : Aplikasi Komputasi Bergerak
*/

public interface NoteInterfaces {
    public Cursor read();
    public boolean create(Note note);
    public boolean update(Note note);
    public boolean delete(String id);
}