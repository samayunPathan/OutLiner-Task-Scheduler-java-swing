/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.outliner;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import com.mycompany.outliner.view.AppView;


public class OutLiner {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            AppView appView = AppView.getInstance();
            appView.createChildControls();
            appView.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            appView.pack();
            appView.setLocationRelativeTo(null);
            appView.setVisible(true); 
        });
    }
}
