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
    private String opCode;
    
    public OperationParams(String operand1, String operand2, String opCode)
    {
        this.op1 = operand1;
        this.op2 = operand2;
        this.opCode = opCode; 
    }
    
    public OperationParams()
    {
        this.op1 = "";
        this.op2 = "";
        this.opCode = ""; 
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
    
    public void setOpCode(String strOpCode)
    {
        this.opCode = strOpCode;                
    }
    
    public String getOpCode(String strOpCode)
    {
        return this.opCode;
    }
    
}
