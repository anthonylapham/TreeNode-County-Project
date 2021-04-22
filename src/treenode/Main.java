/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package treenode;

/**
 *
 * @author Anthony
 */
public class Main {
    public static void main(String args[]){
        County firstCounty = new County("Franklin", 49, "Columbus", 1264518, 539.87);
        //System.out.println(firstCounty.toString());
        County secondCounty = new County("Hamilton", 61, "Cincinatti", 802374, 407.36);
        County thirdCounty = new County("Butler", 17, "Hamilton", 368130, 467.27);
        County fourthCounty = new County("Montgomery", 113, "Dayton", 535153, 461.68);
        County fifthCounty = new County("Clinton", 27, "Wilmington", 42040, 410.88);
        
       TreeNode root = new TreeNode(firstCounty);
       root.insert(secondCounty);
       root.insert(thirdCounty);
       root.insert(fourthCounty);
       root.insert(fifthCounty);
       
       /*System.out.println("Insertion: ");
       System.out.println(root.getString(root));
       System.out.println();*/
       System.out.println("Pre-order Traversal: ");
       root.preOrder(root);
       System.out.println();
       System.out.println("In-Order Traversal: ");
       root.inOrder(root);
       System.out.println();
       
       County sixthCounty = new County("Cuyahoga", 35, "Cleveland", 1249352, 458.49);
       root.insert(sixthCounty);
       
       
       System.out.println();
       System.out.println("New County Inserted: ");
       System.out.println();
       System.out.println("Pre-order Traversal: ");
       root.preOrder(root);
       System.out.println();
       System.out.println("In-Order Traversal: ");
       root.inOrder(root);
       System.out.println();
       
       root.delete(firstCounty);
       System.out.println("Deletion of First County: ");
       System.out.println();
       System.out.println("Pre-order Traversal: ");
       root.preOrder(root);
       System.out.println();
       System.out.println("In-Order Traversal: ");
       root.inOrder(root);
       
    }
    
  
    
}
