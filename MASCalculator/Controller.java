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
        opRes.setResult(this.base.outConvert(this.mem.getValue()));
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
