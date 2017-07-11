package gridlife.cn.liveactivity;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;

import gridlife.cn.liveactivity.broadcast.BootCompleteReceiver;

/**
 * ProjectName LiveActivity
 * PackageName gridlife.cn.liveactivity
 * Created by damaren_bzb on 2017/7/11.
 */

public class DWApplication extends Application {
    static Context context;
    @Override
    public void onCreate() {
        super.onCreate();
        context=this;
        registerBroadCast();
    }

    private void registerBroadCast() {
        IntentFilter filter = new IntentFilter();
        filter.addAction(Intent.ACTION_SCREEN_ON);
        filter.addAction(Intent.ACTION_SCREEN_OFF);
        registerReceiver(new BootCompleteReceiver(),filter);
    }

    public static Context getAppContext() {
        return context;
    }
}
