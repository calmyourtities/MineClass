package com.dannyyyy.mineclass;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v4.content.ContextCompat;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.dannyyyy.mineclass.R;

/**
 * Created by daf28 on 11/15/2017.
 */

public class ChatView extends android.support.v7.widget.AppCompatTextView {

    public static enum SIDES {
        LEFT,
        RIGHT,
        CENTER //???
    }

    public SIDES side = SIDES.CENTER;

    public Context context;

    //all three necessary constructors
    public ChatView(Context ctx) {
        super(ctx);
        init();
    }

    public ChatView(Context ctx, AttributeSet attrSet) {
        super(ctx, attrSet);
        init();
    }

    public ChatView(Context ctx, AttributeSet attrSet, int idkwhatthisintisusedfor) {
        super(ctx, attrSet, idkwhatthisintisusedfor);
        init();
    }

    public void setSide(SIDES side) {
        //TODO implement this
        this.side = side;
    }

    public void display() {
        //TODO add animation
    }

    public void init() {
        LinearLayout.LayoutParams lps = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        lps.gravity = Gravity.BOTTOM;
        this.setLayoutParams(lps);
        this.setBackgroundDrawable(ContextCompat.getDrawable(getContext(), R.drawable.chat_bubble));
    }
}
