/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package MASCalculator;

/**
 *
 * @author dell
 */
class AC {
    private Operand ac;

    public AC()
    {
        ac = null;
    }
    public AC(Operand ac)
    {
        this.ac = ac.clone();
    }
    public void setValue(Operand ac)
    {
        this.ac = ac.clone();
    }
    public Operand getValue()
    {
        return this.ac.clone();
    }
}
