/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package recursion_with_array;

import java.util.Scanner;

/**
 *
 * @author saifullah Mansoori
 */
public class Flood_Fill_19 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int test = input.nextInt();
        while (test-- > 0) {
            int row = input.nextInt();
            int col = input.nextInt();
            int[][] arr = new int[row][col];
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[0].length; j++) {
                    arr[i][j] = input.nextInt();
                }
            }
            boolean visited[][]=new boolean[row][col];
            FloodFill(arr,row,col,"",visited);
        }
    }

    public static void FloodFill(int[][] maze, int row, int col, String psf,boolean visited[][]) {

        if (row < 0 || col < 0 || row == maze.length || col == maze[0].length || maze[row][col] == 1 || visited[row][col]==true) {
            return;
        }
        if (row == maze.length - 1 && col == maze[0].length - 1) {
            System.out.println(psf);
            return;
        }
        visited[row][col]=true;
        FloodFill(maze, row - 1, col, psf + "t",visited);
        FloodFill(maze, row, col - 1, psf + "l",visited);
        FloodFill(maze, row + 1, col, psf + "d",visited);
        FloodFill(maze, row, col + 1, psf + "r",visited);
        visited[row][col]=false;
    }
}
