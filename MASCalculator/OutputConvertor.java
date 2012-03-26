/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package MASCalculator;



/**
 *
 * @author dell
 */
class OutputConvertor {
    public static String toHex(Operand op1)
    {
        int intValue = Double.valueOf(op1.getValue()).intValue();
        return String.format("%X", intValue);
    }
    
    public static String toOct(Operand op1)
    {
        int intValue = Double.valueOf(op1.getValue()).intValue();
        return String.format("%o", intValue);
    }
    
    public static String toBin(Operand op1)
    {
        int intValue = Double.valueOf(op1.getValue()).intValue();
        return Integer.toBinaryString(intValue);
    }
    public static String toDec(Operand op1)
    {
        return Double.toString(op1.getValue());
    }
}
