package comqq.example.asus_pc.baidutuision;

import android.content.Context;
import android.util.Log;

import com.baidu.android.pushservice.PushMessageReceiver;

import java.util.List;

/**
 * Created by asus-pc on 2017/4/24.
 */

public class PushTestReceiver extends PushMessageReceiver {
    @Override
    public void onBind(Context context, int i, String s, String s1, String s2, String s3) {
        Log.e("aaa",""+s2);
    }

    @Override
    public void onUnbind(Context context, int i, String s) {
        Log.e("aaa",""+i);
    }

    @Override
    public void onSetTags(Context context, int i, List<String> list, List<String> list1, String s) {
        Log.e("aaa",""+i);
    }

    @Override
    public void onDelTags(Context context, int i, List<String> list, List<String> list1, String s) {
        Log.e("aaa",""+i);
    }

    @Override
    public void onListTags(Context context, int i, List<String> list, String s) {
        Log.e("aaa",""+i);
    }

    @Override
    public void onMessage(Context context, String s, String s1) {
        Log.e("aaa",""+s+s1);
    }

    @Override
    public void onNotificationClicked(Context context, String s, String s1, String s2) {
        Log.e("aaa2",""+s+s1+s2);
    }

    @Override
    public void onNotificationArrived(Context context, String s, String s1, String s2) {
        Log.e("aaa1",""+s+s1+s2);
    }
}
