package com.ventapratama.alarmmanager;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

import androidx.core.app.NotificationCompat;

import com.ventapratama.alarmmanager.NotificationHelper;

public class AlertReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        NotificationHelper notificationHelper = new
                NotificationHelper(context);
        NotificationCompat.Builder nb =
                notificationHelper.getChannelNotification();
        notificationHelper.getManager().notify(1, nb.build());
    }
}
