package com.example.hello;

import com.getcapacitor.JSObject;
import com.getcapacitor.NativePlugin;
import com.getcapacitor.Plugin;
import com.getcapacitor.PluginCall;
import com.getcapacitor.PluginMethod;

// Android - Custom Native Plugin: https://capacitor.ionicframework.com/docs/android/custom-code
// Creating Plugins - Android Guide: https://capacitor.ionicframework.com/docs/plugins/android
@NativePlugin()
public class CustomNativePlugin extends Plugin {

    @PluginMethod()
    public void customCall(PluginCall call) {
        String message = call.getString("message");

        JSObject ret = new JSObject();
        ret.put("returnedMessage", message);
        call.success(ret);
    }
}