package binary_trees_as_pattarn;

import java.util.Scanner;

/**
 * Author: Saifullah Mansoori
 * 
 * 
 * 
 * Class binary_Search_Tree_3 represents a binary search tree.
 */
public class binary_Search_Tree_3 {

    // Node class represents a single node in the binary search tree
    public class Node {
        private int value;
        private Node left;
        private Node right;
        private int height; 

        public Node(int value) {
            this.value = value;
        }

        public int getValue() {
            return this.value;
        }
    }

    private Node Root; // The root node of the binary search tree.

    // get the height of a particular node in the tree
    public int height(Node node) {
        if (node == null) {
            return -1; // Base case: If the node is null, its height is -1 (no height).
        } else {
            return node.height; // Return the height of the node.
        }
    }

    // check if the tree is empty or not
    public boolean isEmpty() {
        return Root == null; // Returns true if the root node is null (empty tree), otherwise false.
    }

    // insertion method to add a new node with the given value to the tree
    public void insert(int value) {
        Root = insert(value, Root); // Calls the private insert method starting from the root node.
    }

    // private insert method to recursively add a new node with the given value to the tree
    private Node insert(int value, Node node) {
        if (node == null) {
            node = new Node(value); // Base case: If the node is null, create a new node with the given value.
            return node;
        }
        // Recursive cases: Check if the value is less or greater than the current node's value.
        // If less, go to the left subtree; otherwise, go to the right subtree.
        if (value < node.value) {
            node.left = insert(value, node.left);
        } else if (value > node.value) {
            node.right = insert(value, node.right);
        }

        // Update the height of the current node based on the maximum height of its left and right subtrees, then add 1.
        node.height = Math.max(height(node.left), height(node.right)) + 1;

        return node;
    }

    // method to populate the tree with multiple values
    public void populate(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            insert(nums[i]); // Insert each value from the array into the tree.
        }
    }

    // method to populate the tree with a sorted array to maintain balance
    public void populateSorted(int[] nums) {
        populateSorted(nums, 0, nums.length - 1);
    }

    // private method to recursively populate the tree with a sorted array to maintain balance
    private void populateSorted(int[] nums, int start, int end) {
        if (start >= end) {
            return; // Base case: If the start index is greater than or equal to the end index, return.
        }
        int mid = start + (end - start) / 2; // Find the middle index to balance the tree.
        insert(nums[mid]); // Insert the value at the middle index into the tree.
        // Recursively populate the left and right subtrees with values from the left and right halves of the array.
        populateSorted(nums, start, mid);
        populateSorted(nums, mid + 1, end);
    }

    // method to check if the tree is balanced (i.e., the difference in heights between left and right subtrees is at most 1)
    public boolean balanced() {
        return balanced(Root); // Call the private balanced method starting from the root node.
    }

    // private balanced method to recursively check if the tree is balanced
    private boolean balanced(Node node) {
        if (node == null) {
            return true; // Base case: If the node is null, it is balanced.
        } else {
            // Recursive case: Check if the difference in heights of the left and right subtrees is at most 1,
            // and recursively check the balance of left and right subtrees.
            return Math.abs(height(node.left) - height(node.right)) <= 1 &&
                   balanced(node.left) && balanced(node.right);
        }
    }

    // method to display the contents of the tree (in-order traversal)
    public void display() {
        display(Root, "Root Node ");
    }

    // private display method to recursively display the contents of the tree
    private void display(Node node, String details) {
        if (node == null) {
            return; // Base case: If the node is null, return.
        }
        // Print the current node's value and recursively display its left and right subtrees.
        System.out.println(details + node.getValue());
        display(node.left, "Left child of " + node.getValue() + " : ");
        display(node.right, "Right child of " + node.getValue() + " : ");
    }

    // Main method
    static Scanner input = new Scanner(System.in);

    public static void main(String arg[]) {
        int test = input.nextInt(); // Read the number of test cases.
        while (test-- > 0) {
            caller(); // Call the caller method for each test case.
        }
    }

    // private method to handle each test case
    private static void caller() {
        binary_Search_Tree_3 bst = new binary_Search_Tree_3(); // Create a new binary search tree object.
        int n = input.nextInt(); // Read the number of elements in the tree for this test case.
        int[] nums = new int[n]; // Create an array to store the elements.
        for (int i = 0; i < nums.length; i++) {
            nums[i] = input.nextInt(); // Read each element and store it in the array.
        }
        bst.populate(nums); // Populate the binary search tree with the elements from the array.
        bst.display(); // Display the contents of the binary search tree.
        
        //note if you insert the sorted data please use this function
        //populateSorted(nums)
    }
}
