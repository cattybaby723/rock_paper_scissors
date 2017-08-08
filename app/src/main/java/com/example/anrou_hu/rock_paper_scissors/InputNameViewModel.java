package com.example.anrou_hu.rock_paper_scissors;

import android.arch.lifecycle.ViewModel;

/**
 * @author anrou_hu
 */

public class InputNameViewModel extends ViewModel {

    private String mPlayerName;


    public String getPlayerName() {
        return mPlayerName;
    }


    public void setPlayerName(String playerName) {
        mPlayerName = playerName;
    }

}
