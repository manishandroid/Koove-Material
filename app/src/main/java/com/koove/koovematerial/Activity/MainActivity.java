package com.koove.koovematerial.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.koove.koovematerial.Constants.GlobalVariables;
import com.koove.koovematerial.Fragment.AllPost;
import com.koove.koovematerial.Fragment.NewPost;
import com.koove.koovematerial.Model.ResponseModel;
import com.koove.koovematerial.R;
import com.koove.retrofit.MyCallback;
import com.koove.retrofit.RestCallback;
import com.koove.retrofit.RetrofitRequest;
import com.koove.retrofit.UtilitySingleton;

import java.util.ArrayList;
import java.util.List;

import retrofit.RetrofitError;
import retrofit.client.Response;

public class MainActivity extends BaseActivity implements View.OnClickListener, RestCallback{

    private TabLayout tabLayout;
    private ViewPager viewPager;
    private FloatingActionButton mFloatingActionButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getLayoutInflater().inflate(R.layout.activity_main, mFrameLayout);
        mFloatingActionButton = (FloatingActionButton)findViewById(R.id.fab);
        mFloatingActionButton.setOnClickListener(this);
        viewPager = (ViewPager) findViewById(R.id.viewpager);
        tabLayout = (TabLayout) findViewById(R.id.tabs);
        //setupViewPager(viewPager);
       // tabLayout.setupWithViewPager(viewPager);

        RetrofitRequest.getPost(new MyCallback<ArrayList<ResponseModel>>(this, this, true, null, "Fetching Post...", GlobalVariables.SERVICE_MODE.FETCH_POST));
    }

    private void setupViewPager(ViewPager viewPager, ArrayList<ResponseModel> responseModelArrayList) {
        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());
        adapter.addFragment(NewPost.getInstance(responseModelArrayList), "New");
        adapter.addFragment(AllPost.getInstance(responseModelArrayList), "All");
        viewPager.setAdapter(adapter);
    }

    @Override
    public void onClick(View v) {
        switch(v.getId())
        {
            case R.id.fab:
                startActivity(new Intent(this, AddPostActivity.class));
                break;
        }
    }

    @Override
    public void onFailure(RetrofitError e, GlobalVariables.SERVICE_MODE mode) {

    }

    @Override
    public void onSuccess(Object model, Response response, GlobalVariables.SERVICE_MODE mode) {
        switch(mode)
        {
            case FETCH_POST:
                ArrayList<ResponseModel> responseModel = (ArrayList<ResponseModel>) model;
                UtilitySingleton.getInstance(this).ShowSnackBar(responseModel.size()+"", this);
                setupViewPager(viewPager, responseModel);
                tabLayout.setupWithViewPager(viewPager);
                break;
        }
    }

    class ViewPagerAdapter extends FragmentPagerAdapter {
        private final List<Fragment> mFragmentList = new ArrayList<>();
        private final List<String> mFragmentTitleList = new ArrayList<>();

        public ViewPagerAdapter(FragmentManager manager) {
            super(manager);
        }

        @Override
        public Fragment getItem(int position) {
            return mFragmentList.get(position);
        }

        @Override
        public int getCount() {
            return mFragmentList.size();
        }

        public void addFragment(Fragment fragment, String title) {
            mFragmentList.add(fragment);
            mFragmentTitleList.add(title);
        }

        @Override
        public CharSequence getPageTitle(int position) {
            return mFragmentTitleList.get(position);
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
