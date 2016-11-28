package com.zhangxu.realpath;

import android.annotation.TargetApi;
import android.content.ContentUris;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.provider.DocumentsContract;
import android.provider.MediaStore;

import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;

/**
 * Created by zhangxu on 2016/11/28.
 */
public class RCTRealPathModule extends ReactContextBaseJavaModule {
    public RCTRealPathModule(ReactApplicationContext reactContext) {
        super(reactContext);
    }

    @Override
    public String getName() {
        return "RCTRealPath";
    }

    @ReactMethod
    public void getRealPath(String uri, Promise promise) {
        promise.resolve(PathUtil.getPath(getReactApplicationContext(),Uri.parse(uri)));
    }
}