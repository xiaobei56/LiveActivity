package gridlife.cn.liveactivity.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.Gravity;
import android.view.Window;
import android.view.WindowManager;

import gridlife.cn.liveactivity.DWApplication;

/**
 * ProjectName LiveActivity
 * PackageName gridlife.cn.liveactivity
 * Created by damaren_bzb on 2017/7/11.
 */

public class HooliganActivity extends Activity {
    private static HooliganActivity instance;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        instance=this;

        Window window=getWindow();
        window.setGravity(Gravity.LEFT|Gravity.TOP);
        WindowManager.LayoutParams params=window.getAttributes();
        params.x=0;
        params.y=0;
        params.height=1;
        params.width=1;
        window.setAttributes(params);
    }
    /**
     * 开启保活页面
     */
    public static void startHooligan() {
        Intent intent = new Intent(DWApplication.getAppContext(), HooliganActivity.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        DWApplication.getAppContext().startActivity(intent);
        Log.e("HooliganActivity","HooliganActivity is running");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        instance = null;
    }

    /**
     * 关闭保活页面
     */
    public static void killHooligan() {
        if(instance != null) {
            instance.finish();
            Log.e("HooliganActivity","HooliganActivity is killing");
        }
    }
}
