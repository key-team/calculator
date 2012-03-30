/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package MASCalculator;

/**
 *
 * @author dell
 */
public class OperationParams 
{
    private String op1;
    private String op2;
    private int opCode;
    
    public OperationParams(String operand1, String operand2, int opCode)
    {
        this.op1 = operand1;
        this.op2 = operand2;
        this.opCode = opCode; 
    }
    
    public OperationParams()
    {
        this.op1 = "";
        this.op2 = "";
        this.opCode = 999;
    }
    
    public void setOp1(String strOp1)
    {
        this.op1 = strOp1;
    }
    
    public String getOp1()
    {
        return this.op1;
    }
    
    public void setOp2(String strOp2)
    {
        this.op2 = strOp2;
    }
    
    public String getOp2()
    {
        return this.op2;
    }
    
    public void setOpCode(int strOpCode)
    {
        this.opCode = strOpCode;                
    }
    
    public int getOpCode()
    {
        return this.opCode;
    }
    
}
