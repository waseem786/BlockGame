package com.waseem.brickgame;


import com.waseem.brickgame.enums.FigureSpeed;

public class Values {

    private static final String NAMESPACE                   = "com.waseem.brickgame";

    public static final int EXTRA_ROWS                      = 4;
    public static final int FIGURE_STOPPED_SCORE            = 10;
    public static final int COUNT_DOWN_INTERVAL             = 750;
    public static final long DELAY_IN_MILLIS                = 1500;
    public static final long DEBOUNCE_DELAY_IN_MILLIS       = 450;
    public static final long GAME_OVER_DELAY_IN_MILLIS      = 4000;
    public static final float LINE_WIDTH                    = 1f;

    public static final String[] RECIPIENTS         = {"mohwaseem13@gmail.com"};
    public static final String PLAY_MARKET_URL      = "https://play.google.com/store/apps/details?id=com.waseem.brickgame";
    public static final String SHARE_INTENT_TYPE    = "text/plain";
    public static final String DEV_NAME             = "Waseem Iqbal";

    /*PREFERENCES*/
    public static final String PREFERENCES_KEY          = NAMESPACE + "PREFERENCE_KEY";
    public static final String FIRST_VALUE_KEY          = "first_value";
    public static final String SECOND_VALUE_KEY         = "second_value";
    public static final String THIRD_VALUE_KEY          = "third_value";
    public static final int DEFAULT_VALUE               = 0;
    public static final String FIGURE_COLOR_KEY         = "default_color";
    public static final int DEFAULT_COLOR               = R.color.zFigure;
    public static final String FIGURE_SPEED_KEY         = "default_speed";
    public static final long DEFAULT_SPEED              = FigureSpeed.DEFAULT.getFigureSpeedInMillis();
    public static final String ENABLE_HINTS_KEY         = "enable_hints_key";
    public static final boolean ENABLED_HINTS           = true;
    public static final String SQUARES_COUNT_IN_ROW_KEY = "default_squares_in_row";
    public static final int SQUARES_COUNT_IN_ROW        = 10;

    /*NOTIFICATIONS*/
    public static final int NOTIFICATION_ID             = 123;
    public static final String CHANNEL_NAME             = "SCORES";
    public static final String SCORE_CHANNEL            = NAMESPACE + ".scores";
}
