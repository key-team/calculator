/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package MASCalculator;

import com.sun.corba.se.impl.orbutil.closure.Constant;

/**
 *
 * @author dell
 */
class Base {
    private int curentBase;
    
     
    public Base()
    {
        
    }
    public void setBase(int b)
    {
        this.curentBase=b;
    }
    public int getBase()
    {
        return this.curentBase;
    }
    public String outConvert (Operand op)
    {
        String o="";
        switch(curentBase)
            {
                case Constants.BASE_BINARY:
                    o = OutputConvertor.toBin(op);
                    break;
                case Constants.BASE_OCTAL:
                    o=OutputConvertor.toOct(op);
                    break;
                case Constants.BASE_HEX:
                    o=OutputConvertor.toHex(op);
                    break;
                case Constants.BASE_DECIMAL:
                    o=OutputConvertor.toDec(op);
                    break;    
        } 
    }
    public Operand inConvert(String inStr)
    {
        Operand op =new Operand();
        String o="";
        switch(curentBase)
            {
            case Constants.BASE_BINARY:
                    op=InputConvertor.toBin(o);
                    break;
                case Constants.BASE_OCTAL:
                    op=InputConvertor.toOct(o);
                    break;
                case Constants.BASE_HEX:
                    op=InputConvertor.toHex(o);
                    break;
                case Constants.BASE_DECIMAL:
                    op=InputConvertor.toDec(o);
                    break;     
            }
    }
    
}
