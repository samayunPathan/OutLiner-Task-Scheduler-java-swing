/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.outliner.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class SubTask extends TaskItem{
    
    @SerializedName("order")
    @Expose    
    private int order;
    
    public SubTask() {
        
    }
    
    public SubTask(int id, String title, int order) {
        super(id, title);
        this.order = order;
    }
    /**
     * @return the order
     */
    public int getOrder() {
        return order;
    }

    /**
     * @param order the order to set
     */
    public void setOrder(int order) {
        this.order = order;
    }
    
    @Override
    public String toString(){
        return this.getTitle();
    }    
    
    public String toString(boolean includeOrder){
        String formattedString = includeOrder ? this.getOrder() + ". " + this.getTitle() : this.getTitle();
        return formattedString;
    } 
    
    public String toHtml(boolean strikethrough, boolean includeOrder) {
        return strikethrough ? 
                    "<html><body><span style='text-decoration: line-through;'>" + toString(includeOrder) + "</span></body></html>" : 
                    "<html><body><span>" + toString(includeOrder) + "</span></body></html>";
    }    
}
