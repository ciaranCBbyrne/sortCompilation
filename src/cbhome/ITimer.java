/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cbhome;

/**
 *
 * @author Administrator
 */
public interface ITimer {
    
    public long start();
    public long stop();
    public long interval();
    public void reset();
    public void print(Integer[] list);
}
