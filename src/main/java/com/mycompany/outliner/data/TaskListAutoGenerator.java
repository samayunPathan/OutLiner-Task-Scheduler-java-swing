/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.outliner.data;

import java.time.LocalDate;
import java.util.regex.Pattern;
import com.mycompany.outliner.model.SubTask;
import com.mycompany.outliner.model.Task;
import com.mycompany.outliner.model.TaskList;


public class TaskListAutoGenerator {
   
    public static TaskList CreateDummyTaskList() {

        String[] sentences = "".replace(",", "").split(Pattern.quote("."));
        String[] subSentences = "".replace(",", "").split(Pattern.quote("."));    
        String[] names = new String[] {""};
        
        TaskList taskList = new TaskList();
        
        for(int t = 1; t < sentences.length; t++) {
            
            LocalDate targetDate;
            if(((int)(Math.random() * 2) + 1) == 1) {
                targetDate = LocalDate.now().minusDays(((int)(Math.random() * 60) + 1));
            }
            else {
                targetDate = LocalDate.now().plusDays(((int)(Math.random() * 60) + 1));
            }
            
            Task task = new Task(t+1, getSentence(sentences[t], ((int)(Math.random() * 5) + 1)), names[((int)(Math.random() * names.length-1) + 1)], targetDate);
            task.setCompleted(((int)(Math.random() * 2) + 1) == 1);
            task.setPriority(((int)(Math.random() * 3) + 1));
            int numberOfSubtasks = ((int)(Math.random() * 8) + 1);
            for(int s = 0; s < numberOfSubtasks; s++) {
                task.getSubTasks().add(new SubTask(s+1, getSentence(subSentences[((int)(Math.random() * 74) + 1)], ((int)(Math.random() * 5) + 1)), s+1));
            }
            taskList.addTask(task);
        }
        
        return taskList;
    }
    
    private static String getSentence(String sentence, int maxNumberOfWords) {

        String[] words = sentence.split(" ");
        
        int numberOfWords = words.length >= maxNumberOfWords ? words.length-1 : maxNumberOfWords-1;
        
        String newSentence = "";
        
        for(int i = 0; i < numberOfWords; i++) {
            newSentence += i == 0 ? "" : " ";
            newSentence += words[i];
        }
        return newSentence;
    }
}
