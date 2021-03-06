/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project1;
import java.util.*;
import java.io.*;

/**
 *
 * @author ranka
 */
public class ShoppingList {
    
    int index;
    ArrayList taskList = new ArrayList(index);
    Date date = new Date ();
    //get
    protected ArrayList getList( )
    {
    taskList.getClass();
    return taskList;
    }
    
    //write a new task
    protected ArrayList newTask(String newTaskInput)
    {
    taskList.add(newTaskInput);
    return taskList;
    }
          
    //delete a task 
    protected void deleteItem(int indexToRemov)
    {
      taskList.remove(index);
    }
    
    //edit a task
    protected String editTask(String editText, String newText)
    {
    editText = newText;
    return newText;   
    }
    
    //display the tasks list 
    protected void displayList ()
    {
    taskList.toString();
    System.out.println(  taskList + " " +  date ); 
    }
  
    //exit menu 
    protected void toMenu ()
    {
    System.out.println("");
    }
      
    //delete all list 
    protected ArrayList deleteAllList()
    {
    taskList.clear();
    System.out.println("SHOPPING LIST IS EMPTY " + taskList );
    return taskList; 
    }
    
}
