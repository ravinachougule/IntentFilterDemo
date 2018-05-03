package com.example.simpleactivity;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

/**
 * Created by LENOVO on 27/04/2018.
 */
enum ActivityState {
    CREATED,STARTED, RESUMED, PAUSED, STOPPED, DESTR0YED;
}
public class activityStateCheck implements Application.ActivityLifecycleCallbacks {
    private ActivityState mainAct;
    @Override
    public void onActivityCreated(Activity activity, Bundle bundle) {
        if (activity instanceof MainActivity) {
            mainAct = ActivityState.CREATED;
            Toast.makeText(activity,"Created",Toast.LENGTH_SHORT).show();
        }else {
            Intent intent=new Intent(activity,MainActivity.class);
            activity.startActivity(intent);
            Toast.makeText(activity,"Activity Created",Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    public void onActivityStarted(Activity activity) {
        if (activity instanceof MainActivity) {
            mainAct = ActivityState.STARTED;
            Toast.makeText(activity,"Started",Toast.LENGTH_SHORT).show();
        }else {
            Intent intent=new Intent(activity,MainActivity.class);
            activity.startActivity(intent);
            Toast.makeText(activity,"Activity Started",Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    public void onActivityResumed(Activity activity) {

    }

    @Override
    public void onActivityPaused(Activity activity) {

    }

    @Override
    public void onActivityStopped(Activity activity) {

    }

    @Override
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {

    }

    @Override
    public void onActivityDestroyed(Activity activity) {

    }
    public ActivityState getMainState(){
        return mainAct;
    }
}
