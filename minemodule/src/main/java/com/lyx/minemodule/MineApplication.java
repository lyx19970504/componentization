package com.lyx.minemodule;

import android.app.Application;

import com.lyx.compilelib.IAppComponent;
import com.lyx.compilelib.ServiceFactory;

public class MineApplication implements IAppComponent {

    @Override
    public void initialize() {
        ServiceFactory.getInstance().setMineService(new MineService());
    }
}
