package Views.Behavior.Specifics;

import android.content.Context;
import android.widget.Toast;

import Views.Behavior.GiganticLandingBehavior;
import Views.Behavior.LandingBehavior;

/**
 * Created by FcoPardo on 6/1/16.
 * Ejemplo de composición mixta. Podemos tanto crear una instancia de una interfaz (new interfaz)
 * como una implementación de una interfaz (implements interfaz)... usaremos el segundo caso cuando
 * necesitemos tener información de la clase para tomar decisiones.
 */
public class ChromeBookBehavior implements GiganticLandingBehavior {

    private Context myContext;
    private LandingBehavior commonBehavior;

    @Override
    public void useCaseFour() {
        Toast.makeText(myContext, "Case Use Four", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void useCaseFive() {
        Toast.makeText(myContext, "Case Use Five", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void useCaseSix() {
        Toast.makeText(myContext, "Case Use Six", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void useCaseOne() {
        commonBehavior.useCaseOne();
    }

    @Override
    public void useCaseTwo() {
        commonBehavior.useCaseTwo();
    }

    @Override
    public void useCaseThree() {
        commonBehavior.useCaseThree();
    }

    @Override
    public void setContext(Context context) {
        myContext = context;

    }

    public void setCommonBehavior(LandingBehavior aCommonBehavior){
        commonBehavior = aCommonBehavior;
    }

    public ChromeBookBehavior(LandingBehavior aCommonBehavior, Context context){
        setContext(context);
        aCommonBehavior.setContext(context);
        setCommonBehavior(aCommonBehavior);
    }
}
