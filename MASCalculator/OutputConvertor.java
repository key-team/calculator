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
        return String.format("%X", op1.getValue());
    }
    public static String toOct(Operand op1)
    {
        return String.format("%o", op1.getValue());
    }
    public static String toBin(Operand op1)
    {
        return String.format("%b", op1.getValue());
    }
    public static String toDec(Operand op1)
    {
        return String.format("%d", op1.getValue());
    }
}
