package com.example.anrou_hu.rock_paper_scissors;

import android.arch.lifecycle.LifecycleActivity;
import android.arch.lifecycle.ViewModelProvider;
import android.arch.lifecycle.ViewModelProviders;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends LifecycleActivity {


    private TextView mResult;
    private ImageView mOpponentShape;
    private ImageView mPlayerShape;
    private ImageButton mRock;
    private ImageButton mPaper;
    private ImageButton mScissors;

    private MainViewModel mViewModel;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mViewModel = ViewModelProviders.of(this).get(MainViewModel.class);
        initViews();
    }

    private void initViews() {
        mResult = (TextView) findViewById(R.id.result);
        mOpponentShape = (ImageView) findViewById(R.id.opponentShape);
        mPlayerShape = (ImageView) findViewById(R.id.playerShape);
        mRock = (ImageButton) findViewById(R.id.rock);
        mPaper = (ImageButton) findViewById(R.id.paper);
        mScissors = (ImageButton) findViewById(R.id.scissors);
    }




}
