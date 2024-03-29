package com.waseem.brickgame.ui.main;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.waseem.brickgame.R;
import com.waseem.brickgame.Values;
import com.waseem.brickgame.ui.main.listeners.OnTimerStateChangedListener;
import com.waseem.brickgame.ui.main.views.PlayingAreaView;
import com.waseem.brickgame.ui.main.views.PreviewAreaView;
import com.waseem.brickgame.ui.main.views.ScoreView;
import com.waseem.brickgame.utils.DebouncedOnClickListener;
import com.waseem.brickgame.utils.Utils;

import androidx.appcompat.app.AppCompatActivity;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity implements OnTimerStateChangedListener {

    @BindView(R.id.playingArea)
    PlayingAreaView playingAreaView;

    @BindView(R.id.tvScore)
    ScoreView scoreView;

    @BindView(R.id.tvNextFigure)
    PreviewAreaView previewAreaView;

    @BindView(R.id.ivPausePlay)
    ImageView playPauseImage;

    @BindView(R.id.ivRotate)
    ImageView rotateImage;

    @BindView(R.id.ivMoveDown)
    ImageView moveDownImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        playingAreaView.setDependencies(scoreView, previewAreaView, this);
        playingAreaView.cleanup();
        playingAreaView.createFigureWithDelay();
        ImageView rotate = findViewById(R.id.ivRotate);
        rotate.setOnClickListener(new DebouncedOnClickListener(Values.DEBOUNCE_DELAY_IN_MILLIS) {
            @Override
            public void onDebouncedClick(View v) {
                playingAreaView.rotate();
            }
        });
    }

    @Override
    protected void onResume() {
        super.onResume();
        if (playingAreaView.isTimerRunning()) {
            playingAreaView.startTimer();
            setControlsEnabled(true);
        }
    }

    @Override
    protected void onStop() {
        playingAreaView.cancelTimer();
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        playingAreaView.cleanup();
        super.onDestroy();
    }

    private void setControlsEnabled(boolean isRunning) {
        rotateImage.setEnabled(isRunning);
        moveDownImage.setEnabled(isRunning);
    }

    @OnClick(R.id.ivMoveDown)
    void moveDown() {
        playingAreaView.fastMoveDown();
    }

    @OnClick(R.id.ivPausePlay)
    void pausePlay() {
        playingAreaView.handleTimerState();
    }

    @Override
    public void isTimerRunning(boolean isRunning) {
        playPauseImage.setImageResource(isRunning ? R.drawable.ic_pause : R.drawable.ic_resume);
        setControlsEnabled(isRunning);
    }

    @Override
    public void disableAllControls() {
        playPauseImage.setEnabled(false);
        setControlsEnabled(false);
    }
}
