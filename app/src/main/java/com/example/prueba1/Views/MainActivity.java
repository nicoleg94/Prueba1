package com.example.prueba1.Views;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.ListAdapter;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.ViewGroup;

import com.example.prueba1.Models.Model;
import com.example.prueba1.R;
import com.example.prueba1.RetroFitInstance;

import retrofit2.Callback;

import java.util.List;

public class MainActivity extends AppCompatActivity {
    public String apiUrl ="https://digimon-api.vercel.app/api/";

    public List<Model> digimon;
    public RecyclerView mainView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mainView =findViewById(R.id.rv_main);
        mainView.setLayoutManager(new LinearLayoutManager(this));
        RetroFitInstance.getInstance().getApiInterface.getDigimon().get(new Callback<List <Model>>(digimon));

        public void call(List<Model> digimon){
            mainView.setAdapter(new ListAdapter(digimon) {
                @NonNull
                @Override
                public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
                    return List<Model>;

                @Override
                public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {

                }
            }
        }

    }


}