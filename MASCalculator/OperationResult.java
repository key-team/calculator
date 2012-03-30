/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package MASCalculator;

/**
 *
 * @author dell
 */
public class OperationResult
{
    private Error err;
    private String result;

    public OperationResult()
    {
        //err = null;
        err = new Error();
        result = "";
    }

    public int getErrorCode()
    {
        return err.getErrorCode();
    }

    public String getErrorMessage()
    {
        return err.getErrorMessage();
    }

    public String getResult()
    {
        return result;
    }

    public void setResult(String res)
    {
        result = res;
    }

    public void setErr(Error err1)
    {
        err = err1;
    }
    
}
