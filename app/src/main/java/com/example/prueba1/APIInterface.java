package com.example.prueba1;

import android.telecom.Call;

import androidx.core.view.accessibility.AccessibilityEventCompat;

public interface APIInterface {

    //https://digimon-api.vercel.app/api/digimon
    @GET (digimon)
    Call <list<Model>> getDigimon();

}
