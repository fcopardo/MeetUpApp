package Views;

import android.content.Context;
import android.util.AttributeSet;

import com.grizzly.meetupapp.R;

/**
 * Created by FcoPardo on 5/31/16.
 */
public class ChromebookLandingView extends BaseLandingView {

    public ChromebookLandingView(Context context) {
        super(context);
    }

    public ChromebookLandingView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public ChromebookLandingView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public ChromebookLandingView(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }

    @Override
    protected void inflateComponents() {

    }

    @Override
    protected void setContainer() {
        layout = R.layout.chromebook_view;
    }
}
