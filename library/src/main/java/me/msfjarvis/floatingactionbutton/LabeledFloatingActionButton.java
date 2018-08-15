/*
 * Copyright © 2014 Jerzy Chalupski
 * Copyright © 2018 Jason A. Donenfeld <Jason@zx2c4.com>. All Rights Reserved.
 * SPDX-License-Identifier: Apache-2.0
 */

package me.msfjarvis.floatingactionbutton;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.TextView;
import androidx.annotation.ColorInt;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class LabeledFloatingActionButton extends FloatingActionButton {

    private String title;

    public LabeledFloatingActionButton(final Context context) {
        this(context, null);
    }

    public LabeledFloatingActionButton(final Context context, final AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public LabeledFloatingActionButton(final Context context, final AttributeSet attrs, final int defStyle) {
        super(context, attrs, defStyle);

        final TypedArray attr = context.obtainStyledAttributes(attrs, R.styleable.LabeledFloatingActionButton, 0, 0);
        title = attr.getString(R.styleable.LabeledFloatingActionButton_fab_title);
        attr.recycle();
    }

    TextView getLabelView() {
        return (TextView) getTag(R.id.fab_label);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(final String newTitle) {
        title = newTitle;
    }

    public void setColorNormalResId(@ColorInt int colorNormalResId) {
        this.setBackgroundColor(colorNormalResId);
    }

    @Override
    public void setVisibility(final int visibility) {
        final TextView label = getLabelView();
        if (label != null) {
            label.setVisibility(visibility);
        }

        super.setVisibility(visibility);
    }

}
