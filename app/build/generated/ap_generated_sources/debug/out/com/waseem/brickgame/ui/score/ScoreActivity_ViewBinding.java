// Generated code from Butter Knife. Do not modify!
package com.waseem.brickgame.ui.score;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.waseem.brickgame.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class ScoreActivity_ViewBinding implements Unbinder {
  private ScoreActivity target;

  private View view7f07009a;

  @UiThread
  public ScoreActivity_ViewBinding(ScoreActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public ScoreActivity_ViewBinding(final ScoreActivity target, View source) {
    this.target = target;

    View view;
    target.firstScore = Utils.findRequiredViewAsType(source, R.id.tvFirstScore, "field 'firstScore'", TextView.class);
    target.secondScore = Utils.findRequiredViewAsType(source, R.id.tvSecondScore, "field 'secondScore'", TextView.class);
    target.thirdScore = Utils.findRequiredViewAsType(source, R.id.tvThirdScore, "field 'thirdScore'", TextView.class);
    target.scoresLayout = Utils.findRequiredViewAsType(source, R.id.llScores, "field 'scoresLayout'", LinearLayout.class);
    view = Utils.findRequiredView(source, R.id.ivShare, "field 'shareScore' and method 'share'");
    target.shareScore = Utils.castView(view, R.id.ivShare, "field 'shareScore'", ImageView.class);
    view7f07009a = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.share();
      }
    });
  }

  @Override
  @CallSuper
  public void unbind() {
    ScoreActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.firstScore = null;
    target.secondScore = null;
    target.thirdScore = null;
    target.scoresLayout = null;
    target.shareScore = null;

    view7f07009a.setOnClickListener(null);
    view7f07009a = null;
  }
}
