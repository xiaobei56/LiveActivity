package gridlife.cn.liveactivity.broadcast;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

import gridlife.cn.liveactivity.activity.HooliganActivity;

/**
 * ProjectName LiveActivity
 * PackageName gridlife.cn.liveactivity.broadcast
 * Created by damaren_bzb on 2017/7/11.
 */

public class BootCompleteReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        if(intent.getAction().equals(Intent.ACTION_SCREEN_OFF)) {
            Log.e("BootCompleteReceiver","has action");
            HooliganActivity. startHooligan();
        } else if(intent.getAction().equals(Intent.ACTION_SCREEN_ON)){
            HooliganActivity. killHooligan();
        }
    }
}
