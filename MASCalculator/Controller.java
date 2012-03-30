/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package MASCalculator;

import java.nio.Buffer;

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
}
