package com.example.dispro.ui.contacts;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class ContactViewModel extends ViewModel {
    private final MutableLiveData<String> mText;

    public ContactViewModel() {
        mText = new MutableLiveData<>();
        
    }

    public LiveData<String> getText() {
        return mText;
    }
}