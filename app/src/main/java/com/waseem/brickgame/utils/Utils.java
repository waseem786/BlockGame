package com.waseem.brickgame.utils;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.graphics.Path;
import android.net.Uri;

import com.waseem.brickgame.R;
import com.waseem.brickgame.enums.FigureSpeed;

import java.util.List;

import static com.waseem.brickgame.Values.DEV_NAME;
import static com.waseem.brickgame.Values.EXTRA_ROWS;
import static com.waseem.brickgame.enums.FigureSpeed.DEFAULT;
import static com.waseem.brickgame.enums.FigureSpeed.FAST;
import static com.waseem.brickgame.enums.FigureSpeed.SLOW;
import static com.waseem.brickgame.enums.FigureSpeed.VERY_FAST;
import static com.waseem.brickgame.enums.FigureSpeed.VERY_SLOW;

public class Utils {

    public static Path createSmallSquareFigure(int i, int j, int squareWidth, int scale) {
        Path path = new Path();
        int delta = j * squareWidth - (EXTRA_ROWS - 2) * squareWidth - scale;
        path.moveTo(i * squareWidth, delta);
        path.lineTo(i * squareWidth, delta - squareWidth);
        path.lineTo(i * squareWidth + squareWidth, delta - squareWidth);
        path.lineTo(i * squareWidth + squareWidth, delta);
        path.close();
        return path;
    }

    public static int getViewIdByColor(int color) {
        int id = 0;
        switch (color) {
            case R.color.lFigure:
                id = R.id.vLFigureColor;
                break;
            case R.color.squareFigure:
                id = R.id.vSquareFigureColor;
                break;
            case R.color.longFigure:
                id = R.id.vLongFigureColor;
                break;
            case R.color.zFigure:
                id = R.id.vZFigureColor;
                break;
            case R.color.tFigure:
                id = R.id.vTFigureColor;
                break;
            case R.color.jFigure:
                id = R.id.vJFigureColor;
                break;
            default:
                break;
        }
        return id;
    }

    public static FigureSpeed getFiguresSpeedByMillis(long speedMillis) {
        FigureSpeed speed;
        if (speedMillis == VERY_FAST.getFigureSpeedInMillis()) {
            speed = VERY_FAST;
        } else if (speedMillis == FAST.getFigureSpeedInMillis()) {
            speed = FAST;
        } else if (speedMillis == DEFAULT.getFigureSpeedInMillis()) {
            speed = DEFAULT;
        } else if (speedMillis == SLOW.getFigureSpeedInMillis()) {
            speed = SLOW;
        } else {
            speed = VERY_SLOW;
        }
        return speed;
    }

    public static Intent openGmail(Activity activity, String[] email, String subject) {
        Intent emailIntent = new Intent(Intent.ACTION_SEND);
        emailIntent.putExtra(Intent.EXTRA_EMAIL, email);
        emailIntent.putExtra(Intent.EXTRA_SUBJECT, subject);
        emailIntent.setType("text/plain");
        final PackageManager pm = activity.getPackageManager();
        final List<ResolveInfo> matches = pm.queryIntentActivities(emailIntent, 0);
        ResolveInfo best = null;
        for (final ResolveInfo info : matches)
            if (info.activityInfo.packageName.endsWith(".gm") || info.activityInfo.name.toLowerCase().contains("gmail"))
                best = info;
        if (best != null)
            emailIntent.setClassName(best.activityInfo.packageName, best.activityInfo.name);
        return emailIntent;
    }

    public static Intent openMarket(Activity activity) {
        Uri uri = Uri.parse("market://details?id=" + activity.getPackageName());
        return new Intent(Intent.ACTION_VIEW, uri);
    }

    public static Intent showMoreApps() {
        Uri uri = Uri.parse("market://search?q=pub:" + DEV_NAME);
        return new Intent(Intent.ACTION_VIEW, uri);
    }
}
