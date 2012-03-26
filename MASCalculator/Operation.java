/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package MASCalculator;

/**
 *
 * @author dell
 */
class Operation 
{
    private Error   err;
    private AC      ac;
    
    public Operation(Error errParam, AC acParam)
    {
        this.err = errParam;
        this.ac = acParam;
    }
    
    public Operand sum(Operand op1, Operand op2)
    {
        Operand tempOperand = new Operand();
        tempOperand.setValue( op1.getValue() + op2.getValue() );
        return tempOperand;
    }
    
    public Operand subtract(Operand op1, Operand op2)
    {
        Operand tempOperand = new Operand();
        tempOperand.setValue( op1.getValue() - op2.getValue() );
        return tempOperand;
    }
    
    public Operand multiply(Operand op1, Operand op2)
    {
        Operand tempOperand = new Operand();
        tempOperand.setValue( op1.getValue() * op2.getValue() );
        return tempOperand;
    }
    
    public Operand division(Operand op1, Operand op2)
    {
        Operand tempOperand = new Operand();
        double buf;
        try 
        {
            buf = op1.getValue() / op2.getValue();
        }
        catch (Exception e) 
        {
            err.setErrorCode(Constants.ERROR_DIVBYZERO);
            return null;
        }
        
        tempOperand.setValue(buf);
        return tempOperand;
    }
    
}
