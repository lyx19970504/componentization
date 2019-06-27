package com.lyx.loginmodule;


import com.lyx.compilelib.IAppComponent;
import com.lyx.compilelib.ServiceFactory;

public class LoginApplication implements IAppComponent {


    @Override
    public void initialize() {
        ServiceFactory.getInstance().setLoginService(new LoginService());
    }
}
