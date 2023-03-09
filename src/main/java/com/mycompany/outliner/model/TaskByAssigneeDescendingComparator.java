/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.outliner.model;

import java.util.Comparator;


public class TaskByAssigneeDescendingComparator implements Comparator<Task> {
  
    @Override
    public int compare(Task firstTask, Task secondTask) {
       return secondTask.getAssignee().compareTo(firstTask.getAssignee());
    }
}
