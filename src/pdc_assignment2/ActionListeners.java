/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pdc_assignment2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author ethan
 */
public class ActionListeners implements ActionListener {

    public void Exit(ActionEvent e) {
        System.out.println("Click2");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
       System.out.println("Click1");
    }
    
}
