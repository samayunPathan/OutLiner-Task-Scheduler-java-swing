/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.outliner.listener;

import com.mycompany.outliner.model.Task;


public interface PreviewPanelListener {
    public void onEditButtonClicked(Task task);
    public void onDeleteButtonClicked(Task task);
    public void onTaskItemUpdated(Task task);
}
