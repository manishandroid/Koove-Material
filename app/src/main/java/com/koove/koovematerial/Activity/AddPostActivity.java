package com.koove.koovematerial.Activity;

import android.os.Bundle;

import com.koove.koovematerial.R;

/**
 * Created by Manish on 10/18/2015.
 */
public class AddPostActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getLayoutInflater().inflate(R.layout.fragment_add_post, mFrameLayout);
    }
}
