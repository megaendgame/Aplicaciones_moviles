package com.example.lenovo.splashfirebase;

import com.google.firebase.database.FirebaseDatabase;

public class MyFirebaseApp extends android.app.Application{

    @Override
    public void onCreate() {
        super.onCreate();
        //persistencia de datos para usarla en toda la aplicacion
        //app sin internet agrega datos a la BD cuando se vuelve a conectar a la red
        FirebaseDatabase.getInstance().setPersistenceEnabled(true);
    }
}
