package edu.hska.infohska;

import android.app.Activity;
/**
 * 
 * @author tobias
 *	abstractBase Activity Pattern.
 */
public class AbstractBaseActivity extends Activity {

	public HsInfoApplication getHsInfoApplication() {
		return (HsInfoApplication) getApplication();
	}
	
}
