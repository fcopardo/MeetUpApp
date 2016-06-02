package Views;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.grizzly.meetupapp.R;

import Views.Behavior.Specifics.ChromeBookBehavior;
import Views.Behavior.GiganticLandingBehavior;
import Views.Behavior.LandingBehavior;

/**
 * Created by FcoPardo on 5/31/16.
 */
public class ChromebookLandingView extends BaseLandingView {

    private Button buttonOne;
    private Button buttonTwo;
    private Button buttonThree;
    private Button buttonFour;
    private Button buttonFive;
    private Button buttonSix;

    private ChromeBookBehavior specificBehavior;


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
        buttonOne = (Button) findViewById(R.id.button);
        buttonTwo = (Button) findViewById(R.id.button2);
        buttonThree = (Button) findViewById(R.id.button3);
        buttonFour = (Button) findViewById(R.id.button4);
        buttonFive = (Button) findViewById(R.id.button5);
        buttonSix = (Button) findViewById(R.id.button6);
    }

    @Override
    protected void setContainer() {
        layout = R.layout.chromebook_view;
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

    public void setSpecificBehavior(ChromeBookBehavior aSpecificBehavior){
        specificBehavior = aSpecificBehavior;

        buttonOne.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                aSpecificBehavior.useCaseOne();
            }
        });
        buttonTwo.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                specificBehavior.useCaseTwo();
            }
        });
        buttonThree.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                specificBehavior.useCaseThree();
            }
        });
        buttonFour.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                specificBehavior.useCaseFour();
            }
        });
        buttonFive.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                specificBehavior.useCaseFive();
            }
        });
        buttonSix.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                specificBehavior.useCaseSix();

            }
        });
    }

}
