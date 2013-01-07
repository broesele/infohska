package edu.hska.infohska;

import com.dfuerniss.pmg.dbhelper.*;

import android.content.Intent;
import android.os.Bundle;
import android.os.StrictMode;
import android.support.v4.app.FragmentActivity;

/**
 * An activity representing a list of Items. This activity has different
 * presentations for handset and tablet-size devices. On handsets, the activity
 * presents a list of items, which when touched, lead to a
 * {@link DashboardDetailActivity} representing item details. On tablets, the
 * activity presents the list of items and item details side-by-side using two
 * vertical panes.
 * <p>
 * The activity makes heavy use of fragments. The list of items is a
 * {@link DashboardListFragment} and the item details (if present) is a
 * {@link DashboardDetailFragment}.
 * <p>
 * This activity also implements the required {@link DashboardListFragment.Callbacks}
 * interface to listen for item selections.
 */
public class DashboardListActivity extends FragmentActivity implements
		DashboardListFragment.Callbacks {

	/**
	 * Whether or not the activity is in two-pane mode, i.e. running on a tablet
	 * device.
	 */
	private boolean mTwoPane;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		// Siehe PDF "Android User Interface" S.50
		// Bei Fertigstellung wieder rausnehmen!
		StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder()
									.detectAll()
									.penaltyDialog()
									.build());
		StrictMode.setVmPolicy(new StrictMode.VmPolicy.Builder().detectAll()
									.penaltyLog ()
									.build ());

		
		setContentView(R.layout.activity_item_list);

		if (findViewById(R.id.item_detail_container) != null) {
			// The detail container view will be present only in the
			// large-screen layouts (res/values-large and
			// res/values-sw600dp). If this view is present, then the
			// activity should be in two-pane mode.
			mTwoPane = true;

			// In two-pane mode, list items should be given the
			// 'activated' state when touched.
			((DashboardListFragment) getSupportFragmentManager().findFragmentById(
					R.id.item_list)).setActivateOnItemClick(true);
		}

		
//		Lehrveranstaltung lehr = new Lehrveranstaltung();
//		PmgDbHelper helpi = new PmgDbHelper(null) ;
//		helpi.onUpgrade(db, oldVersion, newVersion);
	

		
		
		
		// TODO: If exposing deep links into your app, handle intents here.
	}

	/**
	 * Callback method from {@link DashboardListFragment.Callbacks} indicating that
	 * the item with the given ID was selected.
	 */
	@Override
	public void onItemSelected(String id) {
		if (mTwoPane) {
			// In two-pane mode, show the detail view in this activity by
			// adding or replacing the detail fragment using a
			// fragment transaction.
			Bundle arguments = new Bundle();
			arguments.putString(DashboardDetailFragment.ARG_ITEM_ID, id);
			DashboardDetailFragment fragment = new DashboardDetailFragment();
			fragment.setArguments(arguments);
			getSupportFragmentManager().beginTransaction()
					.replace(R.id.item_detail_container, fragment).commit();

		} else {
			// In single-pane mode, simply start the detail activity
			// for the selected item ID.
			Intent detailIntent = new Intent(this, DashboardDetailActivity.class);
			detailIntent.putExtra(DashboardDetailFragment.ARG_ITEM_ID, id);
			startActivity(detailIntent);
		}
	}
}
