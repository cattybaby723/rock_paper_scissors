package com.example.anrou_hu.rock_paper_scissors;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.ViewModel;

/**
 * @author anrou_hu
 */

public class MainViewModel extends ViewModel {

    private LiveData<Shape> mOpponentShape;
    private LiveData<Shape> mPlayerShape;
    private LiveData<Result> mResult;




}
