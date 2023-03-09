/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.outliner.listener;

import com.mycompany.outliner.model.Task;
import com.mycompany.outliner.model.TaskQuery;
import com.mycompany.outliner.model.User;


public interface TaskListListener {
    public void onLogin(User user);
    public void onLogout();    
    public void onTasksUpdated();   
    public void onTaskSelected(Task task);
    public void onTaskAdded(Task task);
    public void onTaskDeleted(Task task);
    public void onTaskUpdated(Task task);
    public void onTaskQueryChanged(TaskQuery taskQuery);
}
