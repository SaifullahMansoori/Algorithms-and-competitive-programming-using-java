package binary_trees_as_pattarn;

import java.util.Scanner;

/**
 * Author: Saifullah Mansoori
 * 
 * 
 * Class binary_Tree_PrettyDisplay_two represents a binary tree with a pretty display of nodes.
 * 
 */
public class binary_Tree_PrettyDisplay_two {

    public binary_Tree_PrettyDisplay_two() {
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
        System.out.print("Enter the Root value please :  ");
        int value = input.nextInt();
        Root = new Node(value); // Create the root node with the provided value.
        children(Root, input); // Ask for children (left and right nodes) of the root node.
    }

    // Private helper method to recursively populate children nodes of a given node.
    private void children(Node node, Scanner input) {
        // Ask the user if they want to insert data to the left of the current node.
        System.out.print("Do you want to insert data to the left of " + node.value + " : ");
        String Ques = input.next();
        if (Ques.equals("yes")) {
            // If the user wants to insert data to the left, prompt for the value and create the left node.
            System.out.print("Enter the data to the left of " + node.value + " : ");
            int value = input.nextInt();
            node.left = new Node(value);
            // Recursively populate the children of the left node.
            children(node.left, input);
        }

        // Ask the user if they want to insert data to the right of the current node.
        System.out.print("Do you want to insert data to the right of " + node.value + " : ");
        Ques = input.next();
        if (Ques.equals("yes")) {
            // If the user wants to insert data to the right, prompt for the value and create the right node.
            System.out.print("Enter the data to the right of " + node.value + " : ");
            int value = input.nextInt();
            node.right = new Node(value);
            // Recursively populate the children of the right node.
            children(node.right, input);
        }
    }

    // Method to display the binary tree in a pretty format
    public void displayPretty() {
        displayPretty(Root, 0);
    }

    // Private helper method to recursively display the binary tree in a pretty format
    private void displayPretty(Node node, int level) {
        if (node == null) {
            return; // Base case: If the node is null, return.
        }

        // First, recursively display the right subtree.
        displayPretty(node.right, level + 1);

        // Print the current node's value with indentation based on the level in the tree.
        if (level != 0) {
            for (int i = 0; i < level - 1; i++) {
                System.out.print("|\t\t"); // Add vertical bars to represent tree structure.
            }
            System.out.println("|------->" + node.value); // Print the node's value with an arrow pointing to it.
        } else {
            System.out.println(node.value); // If it's the root node, print the value without indentation.
        }

        // Then, recursively display the left subtree.
        displayPretty(node.left, level + 1);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int test = input.nextInt(); // Read the number of test cases.
        while (test-- > 0) {
            Caller(); // Call the caller method for each test case.
        }
    }

    // Private static method to handle each test case.
    private static void Caller() {
        binary_Tree_PrettyDisplay_two tree = new binary_Tree_PrettyDisplay_two(); // Create a new binary tree object.
        tree.populate(); // Populate the binary tree by taking user input.
        tree.displayPretty(); // Display the binary tree in a pretty format.
    }
}
