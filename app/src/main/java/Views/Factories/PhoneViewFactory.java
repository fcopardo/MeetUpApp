package Views.Factories;

import android.content.Context;
import android.os.Build;

import com.grizzly.functions.DeviceFunctions;

import Views.BaseLandingView;
import Views.ChromebookLandingView;
import Views.PhoneLandingView;
import Views.ShitPhoneLandingView;

/**
 * Created by FcoPardo on 5/31/16.
 */
public class PhoneViewFactory {

    public static BaseLandingView getLandingView(Context context){

        /*TODO: AQUI DEBERIAN FABRICARSE MUUUCHAS MAS VIEWS... SEGUN TAMAÑO, RAM DISPONIBLE,
         CALIDAD DE LA RED, PAÍS, TIPO DE DISPOSITIVO... COMO EJEMPLO, REVISEMOS SI EL DISPOSITIVO
         TIENE AL MENOS 1GB de RAM, Y COMO MINIMO 700 MEGAS LIBRES...
         */

        BaseLandingView view;
        if(DeviceFunctions.isMemoryLow(context, 70000, 100000)) {
            view = new ShitPhoneLandingView(context);
        }else{
            /*TODO: HAGAMOS MAS SUPOSICIONES...
            * */

            if(Build.MODEL.contains("Nexus")){
                view = new ChromebookLandingView(context);
                LandingBehaviorFactory.setBehavior((ChromebookLandingView) view, ChromebookLandingView.class, context);
                return view;
            }else{
                view = new PhoneLandingView(context);
            }
        }
        view.setBehavior(LandingBehaviorFactory.getBehavior(view.getClass(), context));
        return view;

    }

}
