// Generated code from Butter Knife. Do not modify!
package com.waseem.brickgame.ui.settings;

import android.view.View;
import android.widget.Switch;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import androidx.constraintlayout.widget.ConstraintLayout;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.shawnlin.numberpicker.NumberPicker;
import com.waseem.brickgame.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class SettingsActivity_ViewBinding implements Unbinder {
  private SettingsActivity target;

  private View view7f0700c9;

  private View view7f07007b;

  private View view7f07007c;

  private View view7f07007a;

  private View view7f07007d;

  private View view7f070133;

  private View view7f070135;

  private View view7f070134;

  private View view7f070137;

  private View view7f070136;

  private View view7f070132;

  private View view7f070126;

  private View view7f070123;

  private View view7f07010f;

  private View view7f070110;

  private View view7f070125;

  @UiThread
  public SettingsActivity_ViewBinding(SettingsActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public SettingsActivity_ViewBinding(final SettingsActivity target, View source) {
    this.target = target;

    View view;
    target.colorPicker = Utils.findRequiredViewAsType(source, R.id.clColorPicker, "field 'colorPicker'", ConstraintLayout.class);
    target.squaresNumberPicker = Utils.findRequiredViewAsType(source, R.id.squaresCountNumberPicker, "field 'squaresNumberPicker'", NumberPicker.class);
    view = Utils.findRequiredView(source, R.id.sEnableHints, "field 'enableHintsSwitch' and method 'enableHints'");
    target.enableHintsSwitch = Utils.castView(view, R.id.sEnableHints, "field 'enableHintsSwitch'", Switch.class);
    view7f0700c9 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.enableHints();
      }
    });
    view = Utils.findRequiredView(source, R.id.flMoreApps, "method 'showMoreApps'");
    view7f07007b = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.showMoreApps();
      }
    });
    view = Utils.findRequiredView(source, R.id.flPrivacyPolicy, "method 'openPrivacyPolicy'");
    view7f07007c = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.openPrivacyPolicy();
      }
    });
    view = Utils.findRequiredView(source, R.id.flFeedback, "method 'sendFeedback'");
    view7f07007a = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.sendFeedback();
      }
    });
    view = Utils.findRequiredView(source, R.id.flRate, "method 'rateApp'");
    view7f07007d = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.rateApp();
      }
    });
    view = Utils.findRequiredView(source, R.id.vLFigureColor, "method 'chooseColorFirst'");
    view7f070133 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.chooseColorFirst();
      }
    });
    view = Utils.findRequiredView(source, R.id.vSquareFigureColor, "method 'chooseColorSecond'");
    view7f070135 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.chooseColorSecond();
      }
    });
    view = Utils.findRequiredView(source, R.id.vLongFigureColor, "method 'chooseColorThird'");
    view7f070134 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.chooseColorThird();
      }
    });
    view = Utils.findRequiredView(source, R.id.vZFigureColor, "method 'chooseColorFourth'");
    view7f070137 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.chooseColorFourth();
      }
    });
    view = Utils.findRequiredView(source, R.id.vTFigureColor, "method 'chooseColorFifth'");
    view7f070136 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.chooseColorFifth();
      }
    });
    view = Utils.findRequiredView(source, R.id.vJFigureColor, "method 'chooseColorSixth'");
    view7f070132 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.chooseColorSixth();
      }
    });
    view = Utils.findRequiredView(source, R.id.tvVerySlow, "method 'chooseVerySlowSpeed'");
    view7f070126 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.chooseVerySlowSpeed();
      }
    });
    view = Utils.findRequiredView(source, R.id.tvSlow, "method 'chooseSlowSpeed'");
    view7f070123 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.chooseSlowSpeed();
      }
    });
    view = Utils.findRequiredView(source, R.id.tvDefault, "method 'chooseDefaultSpeed'");
    view7f07010f = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.chooseDefaultSpeed();
      }
    });
    view = Utils.findRequiredView(source, R.id.tvFast, "method 'chooseFastSpeed'");
    view7f070110 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.chooseFastSpeed();
      }
    });
    view = Utils.findRequiredView(source, R.id.tvVeryFast, "method 'chooseVeryFastSpeed'");
    view7f070125 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.chooseVeryFastSpeed();
      }
    });
    target.speedItems = Utils.listFilteringNull(
        Utils.findRequiredViewAsType(source, R.id.tvVeryFast, "field 'speedItems'", TextView.class), 
        Utils.findRequiredViewAsType(source, R.id.tvFast, "field 'speedItems'", TextView.class), 
        Utils.findRequiredViewAsType(source, R.id.tvDefault, "field 'speedItems'", TextView.class), 
        Utils.findRequiredViewAsType(source, R.id.tvSlow, "field 'speedItems'", TextView.class), 
        Utils.findRequiredViewAsType(source, R.id.tvVerySlow, "field 'speedItems'", TextView.class));
  }

  @Override
  @CallSuper
  public void unbind() {
    SettingsActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.colorPicker = null;
    target.squaresNumberPicker = null;
    target.enableHintsSwitch = null;
    target.speedItems = null;

    view7f0700c9.setOnClickListener(null);
    view7f0700c9 = null;
    view7f07007b.setOnClickListener(null);
    view7f07007b = null;
    view7f07007c.setOnClickListener(null);
    view7f07007c = null;
    view7f07007a.setOnClickListener(null);
    view7f07007a = null;
    view7f07007d.setOnClickListener(null);
    view7f07007d = null;
    view7f070133.setOnClickListener(null);
    view7f070133 = null;
    view7f070135.setOnClickListener(null);
    view7f070135 = null;
    view7f070134.setOnClickListener(null);
    view7f070134 = null;
    view7f070137.setOnClickListener(null);
    view7f070137 = null;
    view7f070136.setOnClickListener(null);
    view7f070136 = null;
    view7f070132.setOnClickListener(null);
    view7f070132 = null;
    view7f070126.setOnClickListener(null);
    view7f070126 = null;
    view7f070123.setOnClickListener(null);
    view7f070123 = null;
    view7f07010f.setOnClickListener(null);
    view7f07010f = null;
    view7f070110.setOnClickListener(null);
    view7f070110 = null;
    view7f070125.setOnClickListener(null);
    view7f070125 = null;
  }
}
