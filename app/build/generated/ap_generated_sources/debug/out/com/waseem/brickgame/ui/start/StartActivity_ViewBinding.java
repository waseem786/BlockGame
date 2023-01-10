// Generated code from Butter Knife. Do not modify!
package com.waseem.brickgame.ui.start;

import android.view.View;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.waseem.brickgame.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class StartActivity_ViewBinding implements Unbinder {
  private StartActivity target;

  private View view7f07004e;

  private View view7f07004c;

  private View view7f070099;

  @UiThread
  public StartActivity_ViewBinding(StartActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public StartActivity_ViewBinding(final StartActivity target, View source) {
    this.target = target;

    View view;
    target.gameTitle = Utils.findRequiredViewAsType(source, R.id.tvGameTitle, "field 'gameTitle'", TextView.class);
    view = Utils.findRequiredView(source, R.id.bStartGame, "field 'startGameButton' and method 'startGame'");
    target.startGameButton = Utils.castView(view, R.id.bStartGame, "field 'startGameButton'", TextView.class);
    view7f07004e = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.startGame();
      }
    });
    view = Utils.findRequiredView(source, R.id.bOpenScores, "field 'openScoresButton' and method 'openScores'");
    target.openScoresButton = Utils.castView(view, R.id.bOpenScores, "field 'openScoresButton'", TextView.class);
    view7f07004c = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.openScores();
      }
    });
    view = Utils.findRequiredView(source, R.id.ivSettings, "method 'openSettings'");
    view7f070099 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.openSettings();
      }
    });
  }

  @Override
  @CallSuper
  public void unbind() {
    StartActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.gameTitle = null;
    target.startGameButton = null;
    target.openScoresButton = null;

    view7f07004e.setOnClickListener(null);
    view7f07004e = null;
    view7f07004c.setOnClickListener(null);
    view7f07004c = null;
    view7f070099.setOnClickListener(null);
    view7f070099 = null;
  }
}
