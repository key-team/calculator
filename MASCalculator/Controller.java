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
        OperationResult opRes = new OperationResult();
        int opCode;
        opCode = opParams.getOpCode();

        switch (opCode)
        {
            case Constants.OPCODE_SUM:
                op1 = base.inConvert(opParams.getOp1());
                op2 = base.inConvert(opParams.getOp2());
                operation.sum(op1, op2);

                if (!err.isErrorOccured())
                    opRes.setResult(base.outConvert(ac.getValue()));
                opRes.setErr(err);
                break;

            case Constants.OPCODE_SUB:
                op1 = base.inConvert(opParams.getOp1());
                op2 = base.inConvert(opParams.getOp2());
                operation.subtract(op1, op2);

                if (!err.isErrorOccured())
                    opRes.setResult(base.outConvert(ac.getValue()));
                opRes.setErr(err);
                break;

            case Constants.OPCODE_MUL:
                op1 = base.inConvert(opParams.getOp1());
                op2 = base.inConvert(opParams.getOp2());
                operation.multiply(op1, op2);

                if (!err.isErrorOccured())
                    opRes.setResult(base.outConvert(ac.getValue()));
                opRes.setErr(err);
                break;

            case Constants.OPCODE_DIV:
                op1 = base.inConvert(opParams.getOp1());
                op2 = base.inConvert(opParams.getOp2());
                operation.division(op1, op2);

                if (!err.isErrorOccured())
                    opRes.setResult(base.outConvert(ac.getValue()));
                opRes.setErr(err);
                break;

            case Constants.OPCODE_MOD:
                op1 = base.inConvert(opParams.getOp1());
                op2 = base.inConvert(opParams.getOp2());
                operation.mod(op1, op2);

                if (!err.isErrorOccured())
                    opRes.setResult(base.outConvert(ac.getValue()));
                opRes.setErr(err);
                break;

            case Constants.OPCODE_ROUND:
                op1 = base.inConvert(opParams.getOp1());
                operation.round(op1);

                if (!err.isErrorOccured())
                    opRes.setResult(base.outConvert(ac.getValue()));
                opRes.setErr(err);
                break;

            case Constants.OPCODE_CEIL:
                op1 = base.inConvert(opParams.getOp1());
                operation.ceil(op1);

                if (!err.isErrorOccured())
                    opRes.setResult(base.outConvert(ac.getValue()));
                opRes.setErr(err);
                break;

            case Constants.OPCODE_FLOOR:
                op1 = base.inConvert(opParams.getOp1());
                
                operation.floor(op1);

                if (!err.isErrorOccured())
                    opRes.setResult(base.outConvert(ac.getValue()));
                opRes.setErr(err);
                break;

            case Constants.OPCODE_INT:
                op1 = base.inConvert(opParams.getOp1());
                operation.Int(op1);

                if (!err.isErrorOccured())
                    opRes.setResult(base.outConvert(ac.getValue()));
                opRes.setErr(err);

                break;

            case Constants.OPCODE_POWER:
                op1 = base.inConvert(opParams.getOp1());
                op2 = base.inConvert(opParams.getOp2());
                operation.power(op1, op1);

                if (!err.isErrorOccured())
                    opRes.setResult(base.outConvert(ac.getValue()));
                opRes.setErr(err);
                break;

            case Constants.OPCODE_LOG:
                op1 = base.inConvert(opParams.getOp1());
                operation.logarithm(op1);

                if (!err.isErrorOccured())
                    opRes.setResult(base.outConvert(ac.getValue()));
                opRes.setErr(err);
                break;

            case Constants.OPCODE_SIN:
                 op1 = base.inConvert(opParams.getOp1());
                
                operation.sin(op1);

                if (!err.isErrorOccured())
                    opRes.setResult(base.outConvert(ac.getValue()));
                opRes.setErr(err);
                break;

            case Constants.OPCODE_COS:
                op1 = base.inConvert(opParams.getOp1());
                op2 = base.inConvert(opParams.getOp2());
                operation.cos(op1);

                if (!err.isErrorOccured())
                    opRes.setResult(base.outConvert(ac.getValue()));
                opRes.setErr(err);
                break;

            case Constants.OPCODE_TAN:
                op1 = base.inConvert(opParams.getOp1());
                operation.tan(op1);

                if (!err.isErrorOccured())
                    opRes.setResult(base.outConvert(ac.getValue()));
                opRes.setErr(err);
                break;

            case Constants.OPCODE_COT:
                op1 = base.inConvert(opParams.getOp1());
                operation.cot(op1);

                if (!err.isErrorOccured())
                    opRes.setResult(base.outConvert(ac.getValue()));
                opRes.setErr(err);
                break;

            case Constants.OPCODE_AND:
                op1 = base.inConvert(opParams.getOp1());
                op2 = base.inConvert(opParams.getOp2());
                operation.and(op1, op1);

                if (!err.isErrorOccured())
                    opRes.setResult(base.outConvert(ac.getValue()));
                opRes.setErr(err);

                break;

            case Constants.OPCODE_OR:
                op1 = base.inConvert(opParams.getOp1());
                op2 = base.inConvert(opParams.getOp2());
                operation.or(op1, op2);

                if (!err.isErrorOccured())
                    opRes.setResult(base.outConvert(ac.getValue()));
                opRes.setErr(err);
                break;

            case Constants.OPCODE_XOR:
                op1 = base.inConvert(opParams.getOp1());
                op2 = base.inConvert(opParams.getOp2());
                operation.xor(op1, op1);

                if (!err.isErrorOccured())
                    opRes.setResult(base.outConvert(ac.getValue()));
                opRes.setErr(err);
                break;

            case Constants.OPCODE_NOT:
                op1 = base.inConvert(opParams.getOp1());
                operation.not(op1);

                if (!err.isErrorOccured())
                    opRes.setResult(base.outConvert(ac.getValue()));
                opRes.setErr(err);
                break;

            case Constants.OPCODE_SHIFT_LEFT:
                op1 = base.inConvert(opParams.getOp1());
                op2 = base.inConvert(opParams.getOp2());
                operation.shiftTleft(op1, op2);

                if (!err.isErrorOccured())
                    opRes.setResult(base.outConvert(ac.getValue()));
                opRes.setErr(err);
                break;

            case Constants.OPCODE_SHIFT_RIGHT:
                op1 = base.inConvert(opParams.getOp1());
                op2 = base.inConvert(opParams.getOp2());
                operation.shiftTright(op1, op2);

                if (!err.isErrorOccured())
                    opRes.setResult(base.outConvert(ac.getValue()));
                opRes.setErr(err);
                break;

            case Constants.OPCODE_ROTATE_LEFT:
                op1 = base.inConvert(opParams.getOp1());
                op2 = base.inConvert(opParams.getOp2());
                operation.rotateLeft(op1, op2);

                if (!err.isErrorOccured())
                    opRes.setResult(base.outConvert(ac.getValue()));
                opRes.setErr(err);
                break;

            case Constants.OPCODE_ROTATE_RIGHT:
                op1 = base.inConvert(opParams.getOp1());
                op2 = base.inConvert(opParams.getOp2());
                operation.rotateRight(op1, op1);

                if (!err.isErrorOccured())
                    opRes.setResult(base.outConvert(ac.getValue()));
                opRes.setErr(err);
                break;

        }
        return opRes;
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
