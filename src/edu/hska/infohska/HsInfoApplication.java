package edu.hska.infohska;

import edu.hska.infohska.db.DbHelper;
import android.app.Application;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;
/**
 * 
 * @author tobias
 * Application Starting Point.
 */
public class HsInfoApplication extends Application {

	private static final String TAG = "HsInfoApplication";
	
	private DbHelper dbHelper;
	
	@Override
	public void onCreate() {
		super.onCreate();
		Log.i(TAG, "Application onCreate");
	}


	public SQLiteOpenHelper getDbHelper() {
		if (null == dbHelper) {
			dbHelper = new DbHelper(this);
		}
		return dbHelper;
	}
	
}
