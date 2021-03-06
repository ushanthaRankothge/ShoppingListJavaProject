
package project1;
import java.util.*;
import java.io.*;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Ushanta Rankothge
 */
public class ShoppingListMain {
    public static void main (String[] args)
    { 
    ShoppingList myList = new ShoppingList();
    Scanner scan = new Scanner(System.in); 
    Date todayDate = new Date();
    int option; 
    
    do{ 
    System.out.println("MY SHOPPING LIST");
    System.out.println("TODAY IS : " + todayDate);
    System.out.println("1. Add an item");
    System.out.println("2. See my list");
    System.out.println("3. DELETE ALL ITEMS");
    System.out.println("4. EXIT PROGRAM");
    System.out.println("5. Main menu");
     
    System.out.println("enter your option");
     option = scan.nextInt();
    
    switch ( option)
    {   
        case 1: 
            myList.displayList();
            System.out.println("what item you need ? ");
            String itemName = scan.next();
            myList.newTask(itemName);
            myList.displayList();
            System.out.println("if you wana go back to main press 5 ");
            option = scan.nextInt();
            break;
        case 2: 
            myList.displayList();
            break;
        case 3:
            myList.deleteAllList();
            break;
        case 4: 
            System.exit(0);  
        case 5:
            break;
        default:
            System.out.println("if you wana go back to main press 5 ");
            option = scan.nextInt();    
    }
     
    } while (option != 4);
    
    }
    
    }
    

