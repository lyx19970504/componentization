package com.lyx.loginmodule;

import android.content.Context;
import android.content.Intent;

import com.lyx.compilelib.ILoginService;

public class LoginService implements ILoginService {

    @Override
    public void launch(Context context) {
        Intent intent = new Intent(context,LoginActivity.class);
        context.startActivity(intent);
    }
}
