/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package MASCalculator;


/**
 *
 * @author SajadRobati
 * @
 */
class Memory {

    private Operand memory;
    public Memory()
    {
        memory = null;
    }
    public Memory(Operand memory)
    {
        this.memory = memory.clone();
    }
    public void setValue(Operand op)
    {
        this.memory = op.clone();
    }
    public Operand getValue()
    {
        return this.memory;
    }
    public boolean getState()
    {
        if( memory == null  )
            return false;

        return true;
    }
}
