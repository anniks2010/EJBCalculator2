package calculation.beans;

import calculation.ejbs.CalculationSessionLocal;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import javax.ejb.EJB;

@Named(value = "calculationBean")
@SessionScoped
public class CalculationBean implements Serializable {

    @EJB
    private CalculationSessionLocal calculationSession;
    
    private int value1, value2, value3;
   
    public CalculationBean() {
    }

    public int getValue1() {
        return value1;
    }

    public void setValue1(int value1) {
        this.value1 = value1;
    }

    public int getValue2() {
        return value2;
    }

    public void setValue2(int value2) {
        this.value2 = value2;
    }

    public int getValue3() {
        return value3;
    }

    public void setValue3(int value3) {
        this.value3 = value3;
    }
    
    public void clear(){
        value1 = 0;
        value2 = 0;
        value3 = 0;
    }
    public void addition(){
        value3 = calculationSession.add(value1, value2);
    }
    public void subtract(){value3 = calculationSession.sub(value1,value2);}
    public void divide(){value3 = calculationSession.div(value1,value2);}
    public void multiply(){value3 = calculationSession.mul(value1,value2);}
    public void modolus(){value3 = calculationSession.mod(value1,value2);}
}
