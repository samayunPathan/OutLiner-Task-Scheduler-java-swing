/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.outliner.controller;

import com.mycompany.outliner.data.TaskListManager;
import com.mycompany.outliner.listener.TaskFormDialogListener;
import com.mycompany.outliner.model.Task;
import com.mycompany.outliner.view.AppView;
import com.mycompany.outliner.view.TaskFormDialog;


public final class TaskFormDialogController implements TaskFormDialogListener{

    @Override
    public void onAddTask(Task task) {
        TaskListManager.getInstance().addTask(task);
        AppView.getInstance().setEnabled(true);
        TaskFormDialog.getInstance().dispose();
    }

    @Override
    public void onEditTask(Task task) {
        TaskListManager.getInstance().fireOnTaskUpdated(task);
        AppView.getInstance().setEnabled(true);
        TaskFormDialog.getInstance().dispose();
        
    }

    @Override
    public void onCancelButtonClicked() {
        AppView.getInstance().setEnabled(true);
        TaskFormDialog.getInstance().dispose();
    }
    
}
