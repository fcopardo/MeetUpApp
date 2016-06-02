package Views.Factories;

import android.content.Context;
import android.util.Log;
import android.widget.Toast;

import Views.BaseLandingView;
import Views.Behavior.LandingBehavior;
import Views.Behavior.Specifics.ChromeBookBehavior;
import Views.ChromebookLandingView;

/**
 * Created by FcoPardo on 5/31/16.
 */
public class LandingBehaviorFactory {

    public static <T extends BaseLandingView> LandingBehavior getBehavior(Class<T> myClass, final Context context){


        /*TODO: ¿AQUI DEBERIAMOS CREAR MAS COSAS SEGUN LA CLASE NO?
        * */

        LandingBehavior behavior;

        if(myClass.equals(ChromebookLandingView.class)){
            behavior = new LandingBehavior() {

                private Context myContext;

                @Override
                public void useCaseOne() {
                    Toast.makeText(myContext, "Case Use One for Big ass screen", Toast.LENGTH_SHORT).show();
                }

                @Override
                public void useCaseTwo() {
                    Toast.makeText(myContext, "Case Use Two for Big ass screen", Toast.LENGTH_SHORT).show();
                }

                @Override
                public void useCaseThree() {
                    Toast.makeText(myContext, "Case Use Three for Big ass screen", Toast.LENGTH_SHORT).show();
                }

                @Override
                public void setContext(Context context) {
                    myContext = context;

                }
            };
        }
        else{
            behavior = new LandingBehavior() {

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
        }

        behavior.setContext(context);
        return behavior;

    }

    /**
     * Es posible que queramos hacer una composición más compleja, y utilizar subclases o
     * mecanismos similares para crear nuestras interfaces de conducta; en este caso, podemos
     * encapsular el seteo de la conducta, de tal manera que el borrado de tipos no nos afecte.
     * @param view
     * @param myClass
     * @param context
     * @param <T>
     */
    public static <T extends BaseLandingView> void setBehavior(T view, Class<T> myClass, final Context context){


        LandingBehavior behavior;

        behavior = getBehavior(myClass, context);

        if(myClass.equals(ChromebookLandingView.class)){
            ChromeBookBehavior chromeBookBehavior = new ChromeBookBehavior(behavior, context);
            ((ChromebookLandingView)view).setSpecificBehavior(chromeBookBehavior);
        }else{
            view.setBehavior(behavior);
        }
    }

}
