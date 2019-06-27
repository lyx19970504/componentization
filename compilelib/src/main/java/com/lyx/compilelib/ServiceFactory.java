package com.lyx.compilelib;

public class ServiceFactory {

    private static ServiceFactory serviceFactory;
    private ILoginService loginService;
    private IMineService mineService;

    public static ServiceFactory getInstance(){
        if(serviceFactory == null){
            serviceFactory = new ServiceFactory();
        }
        return serviceFactory;
    }

    public ILoginService getLoginService() {
        return loginService;
    }

    public void setLoginService(ILoginService loginService) {
        if(loginService == null){
            this.loginService = new EmptyLoginService();
        }else {
            this.loginService = loginService;
        }
    }

    public IMineService getMineService() {
        return mineService;
    }

    public void setMineService(IMineService mineService) {
        if(mineService == null){
            this.mineService = new EmptyMineService();
        }else {
            this.mineService = mineService;
        }
    }
}
