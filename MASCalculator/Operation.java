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
        ac.setValue(tempOperand);
        return tempOperand;
    }

    public Operand subtract(Operand op1, Operand op2)
    {
        Operand tempOperand = new Operand();
        tempOperand.setValue( op1.getValue() - op2.getValue() );
        ac.setValue(tempOperand);
        return tempOperand;
    }

    public Operand multiply(Operand op1, Operand op2)
    {
        Operand tempOperand = new Operand();
        tempOperand.setValue( op1.getValue() * op2.getValue() );
        ac.setValue(tempOperand);
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
        ac.setValue(tempOperand);
        return tempOperand;
    }

    public Operand mod(Operand op1, Operand op2)
    {
        Operand tempOperand = new Operand();

        double res = op1.getValue() % op2.getValue();
        tempOperand.setValue(res);

        ac.setValue(tempOperand);
        return tempOperand;
    }
    public Operand round(Operand op)
    {
        Operand tempOperand = new Operand();

        double res = Math.round(op.getValue());
        tempOperand.setValue(res);

        ac.setValue(tempOperand);
        return tempOperand;
    }
    public Operand ceil(Operand op)
    {
        Operand tempOperand = new Operand();

        double res = Math.ceil(op.getValue());
        tempOperand.setValue(res);

        ac.setValue(tempOperand);
        return tempOperand;
    }
}
