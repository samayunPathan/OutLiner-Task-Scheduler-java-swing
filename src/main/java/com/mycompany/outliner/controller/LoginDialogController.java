/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.outliner.controller;

import javax.swing.JOptionPane;
import com.mycompany.outliner.data.TaskListManager;
import com.mycompany.outliner.listener.LoginDialogListener;
import com.mycompany.outliner.model.AppException;
import com.mycompany.outliner.view.AppView;
import com.mycompany.outliner.view.LoginDialog;


public class LoginDialogController implements LoginDialogListener {
    
    @Override
    public void onLoginButtonPressed(String emailAddress, String password) {
        
        boolean loginSuccessful = false;
        
        try
        {
            if(emailAddress.length() == 0) {
                 TaskListManager.getInstance().loginUser("", "");
            }
            else {
                TaskListManager.getInstance().loginUser(emailAddress, password);
            }
            
            loginSuccessful = true;
        }
        catch(AppException aex) {
            JOptionPane.showMessageDialog(LoginDialog.getInstance(), aex.getMessage(), "Login", JOptionPane.INFORMATION_MESSAGE);
        }
        
        if(loginSuccessful) {
            LoginDialog.getInstance().dispose();
        }
        else {
            LoginDialog.getInstance().setFocus();
        }        
    }

    @Override
    public void onCancelButtonPressed() {
        LoginDialog.getInstance().dispose();
        AppView.getInstance().dispose();
    } 
    
}
