// Generated code from Butter Knife. Do not modify!
package com.waseem.brickgame.ui.main;

import android.view.View;
import android.widget.ImageView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.waseem.brickgame.R;
import com.waseem.brickgame.ui.main.views.PlayingAreaView;
import com.waseem.brickgame.ui.main.views.PreviewAreaView;
import com.waseem.brickgame.ui.main.views.ScoreView;
import java.lang.IllegalStateException;
import java.lang.Override;

public class MainActivity_ViewBinding implements Unbinder {
  private MainActivity target;

  private View view7f070097;

  private View view7f070096;

  @UiThread
  public MainActivity_ViewBinding(MainActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public MainActivity_ViewBinding(final MainActivity target, View source) {
    this.target = target;

    View view;
    target.playingAreaView = Utils.findRequiredViewAsType(source, R.id.playingArea, "field 'playingAreaView'", PlayingAreaView.class);
    target.scoreView = Utils.findRequiredViewAsType(source, R.id.tvScore, "field 'scoreView'", ScoreView.class);
    target.previewAreaView = Utils.findRequiredViewAsType(source, R.id.tvNextFigure, "field 'previewAreaView'", PreviewAreaView.class);
    view = Utils.findRequiredView(source, R.id.ivPausePlay, "field 'playPauseImage' and method 'pausePlay'");
    target.playPauseImage = Utils.castView(view, R.id.ivPausePlay, "field 'playPauseImage'", ImageView.class);
    view7f070097 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.pausePlay();
      }
    });
    target.rotateImage = Utils.findRequiredViewAsType(source, R.id.ivRotate, "field 'rotateImage'", ImageView.class);
    view = Utils.findRequiredView(source, R.id.ivMoveDown, "field 'moveDownImage' and method 'moveDown'");
    target.moveDownImage = Utils.castView(view, R.id.ivMoveDown, "field 'moveDownImage'", ImageView.class);
    view7f070096 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.moveDown();
      }
    });
  }

  @Override
  @CallSuper
  public void unbind() {
    MainActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.playingAreaView = null;
    target.scoreView = null;
    target.previewAreaView = null;
    target.playPauseImage = null;
    target.rotateImage = null;
    target.moveDownImage = null;

    view7f070097.setOnClickListener(null);
    view7f070097 = null;
    view7f070096.setOnClickListener(null);
    view7f070096 = null;
  }
}
