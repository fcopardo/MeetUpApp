package Views.Factories;

import android.content.Context;
import android.widget.Toast;

import Views.BaseLandingView;
import Views.Behavior.LandingBehavior;

/**
 * Created by FcoPardo on 5/31/16.
 */
public class LandingBehaviorFactory {

    public static <T extends BaseLandingView> LandingBehavior getBehavior(Class<T> myClass, final Context context){


        //TODO: ¿AQUI DEBERIAMOS CREAR MAS COSAS SEGUN LA CLASE NO?
        LandingBehavior behavior = new LandingBehavior() {

            private Context myContext;

            @Override
            public void useCaseOne() {
                Toast.makeText(myContext, "Case Use One", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void useCaseTwo() {
                Toast.makeText(myContext, "Case Use Two", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void useCaseThree() {
                Toast.makeText(myContext, "Case Use Three", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void setContext(Context context) {
                myContext = context;

            }
        };

        behavior.setContext(context);

        return behavior;

    }


}
