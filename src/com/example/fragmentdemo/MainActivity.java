package com.example.fragmentdemo;


import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.Menu;
import android.view.View;

public class MainActivity extends FragmentActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	public void onFirstButton(View view) {
		FirstFragment ff = new FirstFragment();
		FragmentManager manager = getSupportFragmentManager();
		FragmentTransaction tr = manager.beginTransaction();
		tr.replace(R.id.ftcontainer, ff);
		tr.commit();
	}
	
	public void onSecondButton(View view) {
		SecondFragment sf = new SecondFragment();
		FragmentManager manager = getSupportFragmentManager();
		FragmentTransaction tr = manager.beginTransaction();
		tr.replace(R.id.ftcontainer, sf);
		tr.commit();
	}
}
