package com.example.pathfollower

import android.app.Application
import com.google.android.libraries.places.api.Places

class PathFollower : Application() {
    override fun onCreate() {
        super.onCreate()
        Places.initialize(applicationContext, getString(R.string.google_maps_key));
        Simulator.geoApiContext = GeoApiContext.Builder()
            .apiKey(getString(R.string.google_maps_key))
            .build()

    }
}