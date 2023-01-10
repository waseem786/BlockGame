package com.waseem.brickgame.ui.main.listeners;

public interface OnTimerStateChangedListener {

    void isTimerRunning(boolean isRunning);

    void disableAllControls();
}
