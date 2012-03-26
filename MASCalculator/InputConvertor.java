/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package MASCalculator;

/**
 *
 * @author dell
 */
class InputConvertor {

    public static Operand toHex(String str)
    {
      int intValue = Integer.parseInt(str, 16);
      double doubleValue = (double) intValue;
      Operand tempOperand = new Operand(doubleValue);
      return tempOperand;
    }
    
    public static Operand toOct(String str)
    {
      int intValue = Integer.parseInt(str, 8);
      double doubleValue = (double) intValue;
      Operand tempOperand = new Operand(doubleValue);
      return tempOperand;
    }
    
    public static Operand toBin(String str)
    {
      int intValue = Integer.parseInt(str, 2);
      double doubleValue = (double) intValue;
      Operand tempOperand = new Operand(doubleValue);
      return tempOperand;
    }
    
    public static Operand toDec(String str)
    {
      Double doubleValue = Double.valueOf(str).doubleValue();
      Operand tempOperand = new Operand(doubleValue);
      return tempOperand;
    }
    
}
