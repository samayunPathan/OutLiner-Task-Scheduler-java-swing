/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.outliner.model;

import java.util.Comparator;


public class TaskByTargetDateAscendingComparator implements Comparator<Task> {
  
    @Override
    public int compare(Task firstTask, Task secondTask) {
              return firstTask.getTargetDate().compareTo(secondTask.getTargetDate());
    }
}
