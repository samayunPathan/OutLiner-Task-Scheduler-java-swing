/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.outliner.listener;

import java.util.ArrayList;
import com.mycompany.outliner.model.User;


public interface UserDialogListener {
    public void onCloseClicked();
    public ArrayList<User> getUsers();

    public void onAddUser(User user);

    public void onEditUser(User user);

    public boolean userIsUnique(User user);
}
