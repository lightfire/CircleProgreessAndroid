package com.lightfire.circleprogress;

/**
 * Created by Kadir-PC on 23.12.2016.
 * Project : DBoard
 */
import android.content.res.Resources;

public final class Utils {

    private Utils() {
    }

    public static float dp2px(Resources resources, float dp) {
        final float scale = resources.getDisplayMetrics().density;
        return  dp * scale + 0.5f;
    }

    public static float sp2px(Resources resources, float sp){
        final float scale = resources.getDisplayMetrics().scaledDensity;
        return sp * scale;
    }
}