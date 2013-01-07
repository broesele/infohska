package edu.hska.infohska.dashboard;

import edu.hska.infohska.AbstractBaseActivity;
import edu.hska.infohska.R;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
/**
 * 
 * @author tobias
 * Dashboard Activity
 */
public class DashboardActivity extends AbstractBaseActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.dashboard_activity);
	}

	public void onButton1Clicked(View view) {
		//Intent intent = new Intent(this, LehrveranstaltungActivity.class);
		//startActivity(intent);
	}
	
	public void onButton2Clicked(View view) {
		//Intent intent = new Intent(this, LehrveranstaltungActivity.class);
		//startActivity(intent);
	}
	
	public void onButton3Clicked(View view) {
		//Intent intent = new Intent(this, LehrveranstaltungActivity.class);
		//startActivity(intent);
	}
	
	public void onButton4Clicked(View view) {
		//Intent intent = new Intent(this, LehrveranstaltungActivity.class);
		//startActivity(intent);
	}
	
}
