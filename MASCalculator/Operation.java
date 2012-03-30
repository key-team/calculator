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
    public void sum(Operand op1, Operand op2)
    {
        Operand tempOperand = new Operand();
        tempOperand.setValue( op1.getValue() + op2.getValue() );
        ac.setValue(tempOperand);
        

    }
    public void subtract(Operand op1, Operand op2)
    {
        Operand tempOperand = new Operand();
        tempOperand.setValue( op1.getValue() - op2.getValue() );
        ac.setValue(tempOperand);
        

    }
    public void multiply(Operand op1, Operand op2)
    {
        Operand tempOperand = new Operand();
        tempOperand.setValue( op1.getValue() * op2.getValue() );
        ac.setValue(tempOperand);
        

    }
    public void division(Operand op1, Operand op2)
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
            return;
        }

        tempOperand.setValue(buf);
        ac.setValue(tempOperand);
        

    }
    public void mod(Operand op1, Operand op2)
    {
        Operand tempOperand = new Operand();

        double res = op1.getValue() % op2.getValue();
        tempOperand.setValue(res);

        ac.setValue(tempOperand);
        

    }
    public void round(Operand op)
    {
        Operand tempOperand = new Operand();

        double res = Math.round(op.getValue());
        tempOperand.setValue(res);

        ac.setValue(tempOperand);
        

    }
    public void ceil(Operand op)
    {
        Operand tempOperand = new Operand();

        double res = Math.ceil(op.getValue());
        tempOperand.setValue(res);

        ac.setValue(tempOperand);
        

    }
    public void floor(Operand op)
    {
        Operand tempOperand = new Operand();
        double temp=Math.floor(op.getValue());
        tempOperand.setValue(temp);
        ac.setValue(tempOperand);
        

    }
    public void Int(Operand op)
    {
        Operand tempOperand= new Operand();
        tempOperand.setValue((int)op.getValue());
        ac.setValue(tempOperand);
        

    }
    public void power(Operand op,Operand op1)
    {
        Operand tempOperand = new Operand();
        double temp=Math.pow(op.getValue(), op1.getValue());
        tempOperand.setValue(temp);
        ac.setValue(tempOperand);
        

    }
    public void logarithm(Operand op)
    {
        Operand tempOperand = new Operand();
        tempOperand.setValue(Math.log10(op.getValue()));
        ac.setValue(tempOperand);
        

    }
    public void sin(Operand op)
    {
        Operand tempOperand=new Operand();
        
        double res = Math.sin(op.getValue());
        tempOperand.setValue(res);
        
        ac.setValue(tempOperand);
        

    }    
    public void cos(Operand op)
    {
        Operand tempOperand=new Operand();
        
        double res = Math.cos(op.getValue());
        tempOperand.setValue(res);
        
        ac.setValue(tempOperand);
        

    }
    
    public void tan(Operand op)
    {
        Operand tempOperand=new Operand();
        
        double res = Math.tan(op.getValue());
        tempOperand.setValue(res);
        
        ac.setValue(tempOperand);
        

    }    
    public void cot(Operand op)
    {
        Operand tempOperand=new Operand();
        
        double res =1.0/(Math.tan(op.getValue()));
        tempOperand.setValue(res);
        
        ac.setValue(tempOperand);
        

    }

    public void and(Operand op,Operand op1)
    {
        Operand tempOperand = new Operand();
        tempOperand.setValue((int)op.getValue() & (int)op1.getValue());
        ac.setValue(tempOperand);
        

    }
    public void or(Operand op,Operand op1)
    {
        Operand tempOperand = new Operand();
        tempOperand.setValue((int)op.getValue() | (int)op1.getValue());
        ac.setValue(tempOperand);
        

    }
    public void xor(Operand op,Operand op1)
    {
        Operand tempOperand = new Operand();
        tempOperand.setValue((int)op.getValue() ^ (int)op1.getValue());
        ac.setValue(tempOperand);
        

    }
    public void not(Operand op)
    {
        Operand tempOperand = new Operand();
        tempOperand.setValue(~ ((int)op.getValue()));
        ac.setValue(tempOperand);
        



    }
    
    public void rotateLeft(Operand op1, Operand op2)
    {
        Operand tempOperand = new Operand();
        int num = (int)op1.getValue();
        int count = (int)op2.getValue();

        tempOperand.setValue(Integer.rotateLeft(num, count));

        
    }
    
     public void shiftTleft(Operand op1, Operand op2)
    {
        Operand tempOperand = new Operand();
       
        int tempintop1 = Double.valueOf(op1.getValue()).intValue();
        int tempintop2 = Double.valueOf(op2.getValue()).intValue();
        tempOperand.setValue( tempintop1 << tempintop2 );
        ac.setValue(tempOperand);
        
    }

     public void shiftTright(Operand op1, Operand op2)
    {
        Operand tempOperand = new Operand();
       
        int tempintop1 = Double.valueOf(op1.getValue()).intValue();
        int tempintop2 = Double.valueOf(op2.getValue()).intValue();
        tempOperand.setValue( tempintop1 >> tempintop2 );
        ac.setValue(tempOperand);
        
    }
 
     public void rotateRight(Operand op, Operand shiftCount)
    {
        int opIntValue = Double.valueOf(op.getValue()).intValue();
        int shiftCountIntValue = Double.valueOf(shiftCount.getValue()).intValue();
        Operand tempOperand = new Operand(Integer.valueOf(Integer.rotateRight(opIntValue, shiftCountIntValue)).doubleValue());
        
        
    }   




}
