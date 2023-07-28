package binary_trees_as_pattarn;

import java.util.Scanner;

/**
 * Author: Saifullah Mansoori
 * 
 * 
 * 
 * 
 * Class binary_Trees represents a binary tree. 
 */
public class binary_Trees {

    public binary_Trees() {

    }

    // Private inner class Node to represent a single node in the binary tree
    private static class Node {

        int value;
        Node left;
        Node right;

        public Node(int value) {
            this.value = value;
        }
    }

    private Node Root; // The root node of the binary tree.

    // Method to populate the binary tree by taking user input
    public void populate() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the value for Root Node : ");
        int value = input.nextInt();
        Root = new Node(value); // Create the root node with the provided value.
        children(Root, input); // Ask for children (left and right nodes) of the root node.
    }

    // Private helper method to recursively populate children nodes of a given node.
    private void children(Node node, Scanner input) {
        // Ask the user if they want to insert a node to the left of the current node.
        System.out.print("Do you want to insert to the left of " + node.value + " : ");
        String ques = input.next();
        if (ques.equals("yes")) {
            // If the user wants to insert to the left, prompt for the value and create the left node.
            System.out.print("Enter value for left of " + node.value + " : ");
            int value = input.nextInt();
            node.left = new Node(value);
            // Recursively populate the children of the left node.
            children(node.left, input);
        }

        // Ask the user if they want to insert a node to the right of the current node.
        System.out.print("Do you want to insert to the right of " + node.value + " : ");
        ques = input.next();
        if (ques.equals("yes")) {
            // If the user wants to insert to the right, prompt for the value and create the right node.
            System.out.print("Enter the value for right of " + node.value + " : ");
            int value = input.nextInt();
            node.right = new Node(value);
            // Recursively populate the children of the right node.
            children(node.right, input);
        }
    }

    // Method to display the binary tree in a tree-like structure
    public void display() {
        display(Root, "");
    }

    // Private helper method to recursively display the binary tree in a tree-like structure
    private void display(Node node, String indent) {
        if (node == null) {
            return; // Base case: If the node is null, return.
        } else {
            // Print the current node's value with proper indentation based on its depth in the tree.
            System.out.println(indent + node.value);
            // Recursively display the left and right subtrees with increased indentation.
            display(node.left, indent + "\t");
            display(node.right, indent + "\t");
        }
    }

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int test = input.nextInt(); // Read the number of test cases.
        while (test-- > 0) {
            caller(); // Call the caller method for each test case.
        }
    }

    // Private static method to handle each test case.
    private static void caller() {
        binary_Trees tree = new binary_Trees(); // Create a new binary tree object.
        tree.populate(); // Populate the binary tree by taking user input.
        tree.display(); // Display the binary tree in a tree-like structure.
    }
}
