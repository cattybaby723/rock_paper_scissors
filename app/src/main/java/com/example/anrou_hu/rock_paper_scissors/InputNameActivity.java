package com.example.anrou_hu.rock_paper_scissors;

import android.arch.lifecycle.LifecycleActivity;
import android.arch.lifecycle.ViewModelProviders;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

/**
 * @author anrou_hu
 */

public class InputNameActivity extends LifecycleActivity implements View.OnClickListener, TextWatcher {

    private EditText mPlayerName;
    private TextView mWelcome;
    private TextView mPlayBtn;

    private InputNameViewModel mViewModel;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input_name);

        initViews();
        initViewModel();
    }


    private void initViews() {
        mPlayerName = (EditText) findViewById(R.id.playerName);
        mWelcome = (TextView) findViewById(R.id.welcome);
        mPlayBtn = (TextView) findViewById(R.id.playBtn);
        mPlayBtn.setOnClickListener(this);
    }

    private void initViewModel() {
        mViewModel = ViewModelProviders.of(this).get(InputNameViewModel.class);
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.playBtn:
                goPlayPage();
                break;
        }
    }

    private void goPlayPage() {
        String playerName = mPlayerName.getText().toString();
        mViewModel.setPlayerName(playerName);

        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }


    @Override
    public void beforeTextChanged(CharSequence s, int start, int count, int after) {
    }

    @Override
    public void onTextChanged(CharSequence s, int start, int before, int count) {
    }

    @Override
    public void afterTextChanged(Editable s) {
        String greeting = getString(R.string.welcome, s.toString());
        mWelcome.setText(greeting);
    }
}
