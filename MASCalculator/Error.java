/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package MASCalculator;

/**
 *
 * @author dell
 */
class Error {
    private int errorCode;
    public Error()
    {
        errorCode = 0;
    }
    public void setErrorCode(int errorCode)
    {
        this.errorCode = errorCode;
    }
    public int getErrorCode()
    {
        return this.errorCode;
    }
    public String getErrorMessage()
    {
        String out = "";

        switch(errorCode)
        {
            case Constants.ERROR_DIVBYZERO:
                out = "Divide By Zero";
                break;
        }

        return out;
    }
}
