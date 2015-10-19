package com.koove.koovematerial.Activity;

import android.content.Context;
import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;

import com.koove.koovematerial.Navigation.NavigationDrawerCallbacks;
import com.koove.koovematerial.Navigation.NavigationDrawerFragment;
import com.koove.koovematerial.R;

/**
 * Created by lakshaygirdhar on 24/9/15.
 */
public class BaseActivity extends AppCompatActivity implements NavigationDrawerCallbacks {

    protected FrameLayout mFrameLayout;
    private NavigationDrawerFragment mNavigationDrawerFragment;
    private Toolbar mToolbar;
    private Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.base_activity);
        this.context = BaseActivity.this;
        mToolbar = (Toolbar) findViewById(R.id.toolbar);
        mFrameLayout = (FrameLayout) findViewById(R.id.container);
        setSupportActionBar(mToolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        mNavigationDrawerFragment = (NavigationDrawerFragment) getFragmentManager().findFragmentById(R.id.fragment_drawer);
        mNavigationDrawerFragment.setup(R.id.fragment_drawer, (DrawerLayout) findViewById(R.id.drawer), mToolbar);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case android.R.id.home:
                finish();
                break;
        }
        return true;
    }

    public void setTitle(String message){
        getSupportActionBar().setTitle(message);
    }

    public Toolbar getToolBar(){
        return mToolbar;
    }

    @Override
    public void onNavigationDrawerItemSelected(int position) {
        //Snackbar.make(this.findViewById(android.R.id.content), "Menu Item Selected : " + position, Snackbar.LENGTH_SHORT).show();
    }

    @Override
    public void onBackPressed() {
        if (mNavigationDrawerFragment.isDrawerOpen())
            mNavigationDrawerFragment.closeDrawer();
        else
            super.onBackPressed();
    }
}
