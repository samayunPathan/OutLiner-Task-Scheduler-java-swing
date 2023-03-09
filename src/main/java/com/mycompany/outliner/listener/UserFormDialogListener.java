/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.outliner.listener;

import com.mycompany.outliner.model.User;


public interface UserFormDialogListener {
    public void onAddUserCancel();
    public void onAddUser(User user);
    public void onEditUser(User user);
    public void onEditUserCancel();    

    public boolean userIsUnique(User user);
}
