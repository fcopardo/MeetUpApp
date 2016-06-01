package Views.Factories;

import android.content.Context;

import com.grizzly.functions.DeviceFunctions;

import Views.BaseLandingView;
import Views.PhoneLandingView;
import Views.ShitPhoneLandingView;

/**
 * Created by FcoPardo on 5/31/16.
 */
public class PhoneViewFactory {

    public static BaseLandingView getLandingView(Context context){

        /*TODO: AQUI DEBERIAN FABRICARSE MUUUCHAS MAS VIEWS... SEGUN TAMAÑO, RAM DISPONIBLE,
         CALIDAD DE LA RED, PAÍS, TIPO DE DISPOSITIVO... COMO EJEMPLO, REVISEMOS SI EL DISPOSITIVO
         TIENE AL MENOS 1GB de RAM, y al menos 700 megas libres...
         */

        BaseLandingView view;
        if(DeviceFunctions.isMemoryLow(context, 70000, 100000)) {
            view = new ShitPhoneLandingView(context);
        }else{
            view = new PhoneLandingView(context);
        }
        view.setBehavior(LandingBehaviorFactory.getBehavior(view.getClass(), context));
        return view;

    }

}
