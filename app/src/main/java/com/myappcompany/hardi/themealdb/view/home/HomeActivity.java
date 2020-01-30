package com.myappcompany.hardi.themealdb.view.home;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.myappcompany.hardi.themealdb.R;

public class HomeActivity extends AppCompatActivity {

    /*
     * TODO 32 Add @BindView Annotation (1)
     *
     * 1. viewPagerHeader
     * 2. recyclerCategory
     *
     */

    /*
     *  TODO 33 Create variable for presenter;
     */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        /*
         *  TODO 34 bind the ButterKnife (2)
         */

        /*
         *  TODO 35 Declare the presenter
         *  new HomePresenter(this)
         */
    }

    // TODO 36 Overriding the interface
}
