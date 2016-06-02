package Views;

import android.content.Context;
import android.util.AttributeSet;

import com.grizzly.baseViews.BaseLinearLayout;

import Views.Behavior.LandingBehavior;

/**
 * Created by FcoPardo on 5/31/16.
 * Esta vista abstracta se utiliza como signature para toda activity o viewgroup que necesite
 * cargar una implementación específica. El propósito de estas vistas es proporcionar los accesores
 * a las interfaces que la vista debe accionar, y los modelos que las vistas usen para llenarse.
 */
public abstract class BaseLandingView <T extends LandingBehavior> extends BaseLinearLayout {

    /*
    Una conducta o behavior no es más que un listener cualquiera, que lleva el código de
    negocio que la vista ejecuta. La conducta puede estar tan separada como se desee; puedes tener
    todos los métodos de la vista en una única interfaz, en diferentes interfaces,
    en interfaces compuestas de interfaces...
     */
    protected T behavior;

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

    public void setBehavior(T aBehavior) {
        this.behavior = aBehavior;
    }
}
