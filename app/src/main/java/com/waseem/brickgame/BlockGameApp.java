package com.waseem.brickgame;

import android.app.Application;
import android.app.NotificationManager;
import android.os.Build;

import com.waseem.brickgame.utils.NotificationUtil;

import static android.app.NotificationManager.IMPORTANCE_DEFAULT;
import static com.waseem.brickgame.Values.CHANNEL_NAME;
import static com.waseem.brickgame.Values.SCORE_CHANNEL;

public class BlockGameApp extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            final NotificationManager nm = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
            if (nm != null) {
                NotificationUtil.createChannel(nm, SCORE_CHANNEL, CHANNEL_NAME, IMPORTANCE_DEFAULT);
            }
        }
    }
}
