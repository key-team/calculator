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
        
    }
    
    public void setNumberBase(int numberBase)
    {
        base.setBase(numberBase);
    }
    
    public int getNumberBase()
    {
       return this.base.getBase();
    }   
 
    public int saveToMemory()
    {
        this.mem.setValue(this.ac.getValue());
    }
    
    public OperationResult retriveMemory()
    {
        OperationResult opRes = new OperationResult();
        this.mem.getValue();
        opRes.setResult(base.outConvert(mem.getValue()));
        return opRes;

    }
    
    public void clearMemory()
    {
        mem.setValue(null);
    }
    
    public boolean isMemorySet()
    {
        return this.mem.getState();
    }
}
