package cn.buaa.myweixin.app;

import android.app.Application;

import com.igexin.sdk.PushManager;

import cn.buaa.myweixin.GetuiDemo.DemoIntentService;
import cn.buaa.myweixin.GetuiDemo.PushService;

public class App extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        // com.getui.demo.DemoPushService 为第三方自定义推送服务
        PushManager.getInstance().initialize(this.getApplicationContext(), PushService.class);
        // com.getui.demo.DemoIntentService 为第三方自定义的推送服务事件接收类
        PushManager.getInstance().registerPushIntentService(this.getApplicationContext(), DemoIntentService.class);
    }
}
