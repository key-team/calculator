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

    public AC(Operand ac)
    {
        this.ac = ac;
    }
    public void setValue(Operand ac)
    {
        this.ac = ac;
    }
    public Operand getValue()
    {
        return this.ac;
    }
}
