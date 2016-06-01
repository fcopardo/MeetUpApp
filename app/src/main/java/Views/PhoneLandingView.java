package Views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;

import com.grizzly.meetupapp.R;

import Views.Behavior.LandingBehavior;

/**
 * Created by FcoPardo on 5/31/16.
 */
public class PhoneLandingView extends BaseLandingView {

    private Button buttonOne;
    private Button buttonTwo;
    private Button buttonThree;

    public PhoneLandingView(Context context) {
        super(context);
    }

    public PhoneLandingView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public PhoneLandingView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public PhoneLandingView(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }

    @Override
    protected void inflateComponents() {

        buttonOne = (Button) findViewById(R.id.button);
        buttonTwo = (Button) findViewById(R.id.button2);
        buttonThree = (Button) findViewById(R.id.button3);
    }

    @Override
    protected void setContainer()
    {
        //TODO: AQUI PODRIAMOS CARGAR DIFERENTES LAYOUTS, ¿NO?
        layout = R.layout.phone_view;
    }

    @Override
    public void setBehavior(LandingBehavior aBehavior){
        super.setBehavior(aBehavior);

        buttonOne.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                behavior.useCaseOne();
            }
        });
        buttonTwo.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                behavior.useCaseTwo();
            }
        });
        buttonThree.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                behavior.useCaseThree();
            }
        });
    }
}
