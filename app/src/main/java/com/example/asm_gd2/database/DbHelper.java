package com.example.asm_gd2.database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DbHelper extends SQLiteOpenHelper {
    public DbHelper(Context context){
        super(context,"ASM_MOB201",null,1);
    }
    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table KHOAHOC(maKhoahoc integer primary key autoincrement, tenKhoahoc text not null, soBuoihoc text, tenGiaovien text, ngayBatdau date not null, ngayKetthuc date not null, ngaythi date not null)");
        db.execSQL("insert into KHOAHOC values (1,'android nâng cao','28','Huy Nguyễn','19-01-2020','3-03-2020','10-3-2020')");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS KHOAHOC");
        onCreate(db);
    }
}
