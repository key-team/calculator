/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package MASCalculator;

/**
 *
 * @author dell
 */
class Operand {
    private double value;

    public Operand(double value)
    {
        this.value = value;
    }

    public Operand()
    {
        this.value = 0.0;
    }
    public void setValue(double v)
    {
        this.value = v;
    }
    public double getValue()
    {
        return this.value;
    }
}
