package com.example.toysstore.database;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import java.util.List;

public class LaterViewModel extends AndroidViewModel {

    private final LiveData< List<Toy> > BuyLater;

    public LaterViewModel(@NonNull Application application) {
        super(application);
        AppDatabase db = AppDatabase.getInstance(this.getApplication());
        BuyLater = db.laterDAO().loadLater();
    }

    public LiveData<List<Toy>> getLater() {
        return BuyLater;
    }
}