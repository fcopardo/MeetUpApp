package Views;

import android.content.Context;
import android.util.AttributeSet;

import com.grizzly.baseViews.BaseLinearLayout;

import Views.Behavior.LandingBehavior;

/**
 * Created by FcoPardo on 5/31/16.
 */
public abstract class BaseLandingView extends BaseLinearLayout {

    protected LandingBehavior behavior;

    public BaseLandingView(Context context) {
        super(context);
    }

    public BaseLandingView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public BaseLandingView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public BaseLandingView(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }

    public void setBehavior(LandingBehavior aBehavior) {
        this.behavior = aBehavior;
    }
}
