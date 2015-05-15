/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package calculator;

import javax.naming.spi.DirStateFactory.Result;

/**
 *
 * @author smw
 */
public class Calculator {
    private double a;
    private double b;

    public double getA()
    {
        return a;
    }
    public double getB()
    {
        return b;
    }

    public void setA(double param_a)
    {
        a = param_a;
    }
    public void setB(double param_b)
    {
        b = param_b;
    }

    public double plus()
    {
        return getA() + getB();
    }
    public double minus()
    {
        return getA() - getB();
    }
    public double division()
    {
        return getA() / getB();
    }
    public double multiply()
    {
        return getA() * getB();
    }


}
