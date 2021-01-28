package com.example.lifecycle

import android.app.Activity
import android.app.Application
import android.os.Bundle
import android.util.Log

class MyApplication : Application() {

    override fun onCreate() {
        super.onCreate()

        registerActivityLifecycleCallbacks(object : ActivityLifecycleCallbacks {
            override fun onActivityCreated(activity: Activity, savedInstanceState: Bundle?) {
                Log.d(TAG, "Created: ${activity.javaClass.simpleName}")
            }

            override fun onActivityStarted(activity: Activity) {
                Log.d(TAG, "Started: ${activity.javaClass.simpleName}")
            }

            override fun onActivityResumed(activity: Activity) {
                Log.d(TAG, "Resumed: ${activity.javaClass.simpleName}")
            }

            override fun onActivityPaused(activity: Activity) {
                Log.d(TAG, "Paused: ${activity.javaClass.simpleName}")
            }

            override fun onActivityStopped(activity: Activity) {
                Log.d(TAG, "Stopped: ${activity.javaClass.simpleName}")
            }

            override fun onActivitySaveInstanceState(activity: Activity, outState: Bundle) {
                Log.d(TAG, "SaveInstanceState: ${activity.javaClass.simpleName}")
            }

            override fun onActivityDestroyed(activity: Activity) {
                Log.d(TAG, "Destroyed: ${activity.javaClass.simpleName}")
            }

        })
    }

    companion object {
        const val TAG = "Lifecycle"
    }
}