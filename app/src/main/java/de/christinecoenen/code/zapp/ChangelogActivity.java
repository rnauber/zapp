package de.christinecoenen.code.zapp;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;

import com.github.porokoro.paperboy.ViewTypes;
import com.github.porokoro.paperboy.builders.PaperboyChainBuilder;

public class ChangelogActivity extends AppCompatActivity {

	public static Intent getStartIntent(Context context) {
		return new Intent(context, ChangelogActivity.class);
	}

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_changelog);

		if (savedInstanceState == null) {
			Fragment fragment = new PaperboyChainBuilder(this)
					.viewType(ViewTypes.HEADER)
					.buildFragment();

			getSupportFragmentManager()
					.beginTransaction()
					.add(R.id.activity_changelog, fragment)
					.commit();
		}
	}
}
