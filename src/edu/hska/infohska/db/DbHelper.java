package edu.hska.infohska.db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import com.dfuerniss.pmg.dbhelper.PmgDbHelper;

public class DbHelper extends PmgDbHelper {

	public DbHelper(Context context) {
		super(context);
	}

	@Override
	public void onCreate(SQLiteDatabase db) {
		super.onCreate(db);
	}

	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
		super.onUpgrade(db, oldVersion, newVersion);
	}

}
