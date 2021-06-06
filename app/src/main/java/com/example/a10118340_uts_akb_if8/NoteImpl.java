package com.example.a10118340_uts_akb_if8;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

import com.example.a10118340_uts_akb_if8.Note;

/*
    Tanggal         : 07/06/2021
    NIM             : 10118340
    Nama            : Muhammad Umar Al Fajar
    Kelas           : IF8
    Matakuliah      : Aplikasi Komputasi Bergerak
*/

public class NoteImpl extends SQLiteOpenHelper implements NoteInterfaces {

    public NoteImpl(@Nullable Context context) {
        super(context, "db_note", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE tbl_note (id TEXT,title TEXT,category TEXT ,description TEXT,date TEXT)");

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE tbl_note");
    }


    @Override
    public Cursor read() {
        SQLiteDatabase db = getReadableDatabase();
        return db.rawQuery("SELECT * FROM tbl_note ",null);
    }

    @Override
    public boolean create(com.example.a10118340_uts_akb_if8.Note note) {
        SQLiteDatabase db = getWritableDatabase();
        db.execSQL("INSERT INTO tbl_note VALUES ('"+note.getId()+"','"+note.getTitle()+"','"+note.getCategory()+"','"+note.getDesc()+"','"+note.getDate()+"')");
        return true;
    }

    @Override
    public boolean update(com.example.a10118340_uts_akb_if8.Note note) {
        SQLiteDatabase db = getWritableDatabase();
        db.execSQL("UPDATE tbl_note SET title ='"+note.getTitle()+"' , category = '"+note.getCategory()+"' , description = '"+note.getDesc()+"' , date = '"+note.getDate()+"' WHERE id='"+note.getId()+"'");
        return true;
    }

    @Override
    public boolean delete(String id) {
        SQLiteDatabase db = getWritableDatabase();
        db.execSQL("DELETE FROM tbl_note WHERE id='"+id+"'");
        return true;
    }

}