/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package MASCalculator;



/**
 *
 * @author dell
 */


public class Controller
{
    private Operand op1;
    private Operand op2;
    private Base base;
    private Memory mem;
    private Operation operation;
    private Error err;
    private AC ac;

    public Controller()
    {
        this.base = new Base();
        this.mem = new Memory();
        this.err = new Error();
        this.ac = new AC();
        this.operation = new Operation(this.err, this.ac);       

    }

    
    
    public OperationResult performOperation(OperationParams opParams)
    {
        int opCode;
        opCode = opParams.getOpCode();

        switch (opCode)
        {
            case Constants.OPCODE_SUM:
                break;

            case Constants.OPCODE_SUB:
                break;

            case Constants.OPCODE_MUL:
                break;

            case Constants.OPCODE_DIV:
                break;

            case Constants.OPCODE_MOD:
                break;

            case Constants.OPCODE_ROUND:
                break;

            case Constants.OPCODE_CEIL:
                break;

            case Constants.OPCODE_FLOOR:
                break;

            case Constants.OPCODE_INT:
                break;

            case Constants.OPCODE_POWER:
                break;

            case Constants.OPCODE_LOG:
                break;

            case Constants.OPCODE_SIN:
                break;

            case Constants.OPCODE_COS:
                break;

            case Constants.OPCODE_TAN:
                break;

            case Constants.OPCODE_COT:
                break;

            case Constants.OPCODE_AND:
                break;

            case Constants.OPCODE_OR:
                break;

            case Constants.OPCODE_XOR:
                break;

            case Constants.OPCODE_NOT:
                break;

            case Constants.OPCODE_SHIFT_LEFT:
                break;

            case Constants.OPCODE_SHIFT_RIGHT:
                break;

            case Constants.OPCODE_ROTATE_LEFT:
                break;

            case Constants.OPCODE_ROTATE_RIGHT:
                break;

        }
    }
    
    public void setNumberBase(int numberBase)
    {
        this.base.setBase(numberBase);
    }
    
    public int getNumberBase()
    {
       return this.base.getBase();
    }   
 
    public void  saveToMemory()
    {
       this.mem.setValue(this.ac.getValue());
        
    }
    
    public OperationResult retriveMemory()
    {
        OperationResult opRes = new OperationResult();
        if (mem.getState())
            opRes.setResult(this.base.outConvert(this.mem.getValue()));
        else
        {
            Error tempErr = new Error();
            tempErr.setErrorCode(Constants.MEMORY_EMPTY);
            opRes.setErr(tempErr);
        }
        return opRes;

    }
    
    public void clearMemory()
    {
        this.mem.setValue(null);
    }
    
    public boolean isMemorySet()
    {
        return this.mem.getState();
    }
}
