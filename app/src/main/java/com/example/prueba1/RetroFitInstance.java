package com.example.prueba1;

public class RetroFitInstance {
    public RetroFitInstance instance;
    private APIInterface apiInterface;
    RetroFitInstance(){

        RetroFit retroFit = new retrofit.Builder()
                .baseUrl(apiUrl)

                .build();
        apiInterface=retroFit.new(apiInterface);




        }
    }
}
