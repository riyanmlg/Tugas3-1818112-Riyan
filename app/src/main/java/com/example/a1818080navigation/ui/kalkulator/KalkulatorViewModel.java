package com.example.a1818080navigation.ui.kalkulator;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class KalkulatorViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public KalkulatorViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is kalkulator fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}