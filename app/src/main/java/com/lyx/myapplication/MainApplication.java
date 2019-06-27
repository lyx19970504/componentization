package com.lyx.myapplication;

import android.app.Application;

import com.lyx.compilelib.IAppComponent;
import com.lyx.loginmodule.AppConfig;

public class MainApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        initialize();
    }


    public void initialize(){
        for (String component : AppConfig.COMPONENTS){
            try {
                Class<?> clazz = Class.forName(component);
                Object object = clazz.newInstance();
                if(object instanceof IAppComponent){
                    ((IAppComponent) object).initialize();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }

        }
    }
}
