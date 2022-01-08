package com.example.a1818080navigation.ui.biodata;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class BiodataViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public BiodataViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is biodata fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}