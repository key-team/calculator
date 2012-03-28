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
    public Operand floor(Operand op)
    {
        Operand tempOperand = new Operand();
        double temp=Math.floor(op.getValue());
        tempOperand.setValue(temp);
        ac.setValue(tempOperand);
        return tempOperand;

    }
    public Operand Int(Operand op)
    {
        Operand tempOperand= new Operand();
        tempOperand.setValue((int)op.getValue());
        ac.setValue(tempOperand);
        return tempOperand;

    }
    public Operand power(Operand op,Operand op1)
    {
        Operand tempOperand = new Operand();
        double temp=Math.pow(op.getValue(), op1.getValue());
        tempOperand.setValue(temp);
        ac.setValue(tempOperand);
        return tempOperand;

    }
    public Operand logarithm(Operand op)
    {
        Operand tempOperand = new Operand();
        tempOperand.setValue(Math.log10(op.getValue()));
        ac.setValue(tempOperand);
        return tempOperand;

    }
    public Operand sin(Operand op)
    {
        Operand tempOperand=new Operand();
        
        double res = Math.sin(op.getValue());
        tempOperand.setValue(res);
        
        ac.setValue(tempOperand);
        return tempOperand;

    }    
    public Operand cos(Operand op)
    {
        Operand tempOperand=new Operand();
        
        double res = Math.cos(op.getValue());
        tempOperand.setValue(res);
        
        ac.setValue(tempOperand);
        return tempOperand;

    }
    
    public Operand tan(Operand op)
    {
        Operand tempOperand=new Operand();
        
        double res = Math.tan(op.getValue());
        tempOperand.setValue(res);
        
        ac.setValue(tempOperand);
        return tempOperand;

    }    
    public Operand cot(Operand op)
    {
        Operand tempOperand=new Operand();
        
        double res =1.0/(Math.tan(op.getValue()));
        tempOperand.setValue(res);
        
        ac.setValue(tempOperand);
        return tempOperand;

    }
    public Operand and(Operand op,Operand op1)
    {
        Operand tempOperand = new Operand();
        tempOperand.setValue((int)op.getValue() & (int)op1.getValue());
        ac.setValue(tempOperand);
        return tempOperand;

    }
    public Operand or(Operand op,Operand op1)
    {
        Operand tempOperand = new Operand();
        tempOperand.setValue((int)op.getValue() | (int)op1.getValue());
        ac.setValue(tempOperand);
        return tempOperand;

    }
    public Operand xor(Operand op,Operand op1)
    {
        Operand tempOperand = new Operand();
        tempOperand.setValue((int)op.getValue() ^ (int)op1.getValue());
        ac.setValue(tempOperand);
        return tempOperand;

    }
    public Operand not(Operand op)
    {
        Operand tempOperand = new Operand();
        tempOperand.setValue(~ ((int)op.getValue()));
        ac.setValue(tempOperand);
        return tempOperand;

    }
    
     public Operand shiftTleft(Operand op1, Operand op2)
    {
        Operand tempOperand = new Operand();
       
        int tempintop1 = Double.valueOf(op1.getValue()).intValue();
        int tempintop2 = Double.valueOf(op2.getValue()).intValue();
        tempOperand.setValue( tempintop1 << tempintop2 );
        ac.setValue(tempOperand);
        return tempOperand;
    }
    
     public Operand rightTleft(Operand op1, Operand op2)
    {
        Operand tempOperand = new Operand();
       
        int tempintop1 = Double.valueOf(op1.getValue()).intValue();
        int tempintop2 = Double.valueOf(op2.getValue()).intValue();
        tempOperand.setValue( tempintop1 >> tempintop2 );
        ac.setValue(tempOperand);
        return tempOperand;
    }
 

}
