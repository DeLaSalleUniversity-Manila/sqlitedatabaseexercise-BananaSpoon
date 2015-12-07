package com.christian.amiibo;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Christian on 12/6/2015.
 */
public class amiibohelper extends SQLiteOpenHelper {
    public static final String DB_NAME = "amiibo";
    public static final int DB_VERSION = 2;
    amiibohelper(Context context) {
        super(context, DB_NAME,null,DB_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
updateMyDatabase(db, 0, DB_VERSION);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
updateMyDatabase(db,oldVersion,newVersion);
    }

    private void updateMyDatabase(SQLiteDatabase db, int oldVersion, int newVersion){
        if (oldVersion <1){
            db.execSQL("CREATE TABLE CHARACTERS (_id INTEGER PRIMARY KEY AUTOINCREMENT,"+"NAME TEXT,"+ "DESCRIPTION TEXT,"+ "IMAGE_RESOURCE_ID INTEGER);");
            insertcharacter(db, "Mewtwo", "Mewtwo (description)", R.drawable.a);
            insertcharacter(db,"Splatoon","Splatoon (description)", R.drawable.b);
            insertcharacter(db,"Retro NES Characters","Retro NES Characters (description)", R.drawable.c);

        }
        if (oldVersion < 2){
            db.execSQL("ALTER TABLE CHARACTERS ADD COLUMN FAVORITE NUMERIC'");
        }
    }
    private static void insertcharacter(SQLiteDatabase db, String name,
                                    String description, int resourceId) {
        ContentValues characval = new ContentValues();
        characval.put("NAME", name);
        characval.put("DESCRIPTION", description);
        characval.put("IMAGE_RESOURCE_ID", resourceId);
        db.insert("CHARACTERS", null, characval);
    }
}
