import anonymous.AbstractClass;
import structures.Node;
import structures.Tree;
import structures.TreeInfo;

import java.util.Arrays;
import java.util.function.Function;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws NoSuchFieldException {
//        Tree tree = new Tree(10);
//        tree.insert(8);
//        tree.insert(4);
//        tree.insert(7);
//        tree.insert(11);
//        tree.insert(15);
//        tree.insert(5);
//        tree.insert(17);
//        tree.insert(9);
//        tree.insert(1);
//        tree.insert(12);
//
//        tree.PrintMinMax(tree.find(10));
//
//        tree.PrintMaxMin(tree.find(10));
//
//        Node node = tree.find(10);
//        if(node != null) {
//            TreeInfo leftInfo = node
//                    .getLeft()
//                    .getClass()
//                    .getDeclaredField("left")
//                    .getAnnotation(TreeInfo.class);
//            System.out.println(leftInfo.info());
//        }

//        AbstractClass isOdd = new AbstractClass() {
//            @Override
//            public boolean test(int value) {
//                return value % 2 != 0;
//            }
//        };
//
//        if (isOdd.test(5)) {
//            System.out.println("Odd ...");
//        }else {
//            System.out.println("Even ...");
//        }
//
//        isOdd.printInfo();

//        Function<Integer, Integer> inc = (x) -> x + 1;
//        System.out.println(inc.apply(8));

        Function<Integer, Integer> inc = (x) -> x + 1;
        Function<int[][], int[][]> incmatr = (matr) -> {
            int [][] res = new int[matr.length][matr.length];
            for (int i = 0; i < matr.length; i++) {
                for (int j = 0; j < matr[i].length; j++)
                {
                    res[i][j] = inc.apply(matr[i][j]);
                }
            }
            return res;
        };
        int [][] matr1 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++)
            {
                System.out.print(matr1[i][j] + " ");
            }            System.out.println();
        }
        System.out.println();
        int [][] matr2 = incmatr.apply(matr1);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++)
            {
                System.out.print(matr2[i][j] + " ");
            }            System.out.println();
        }
            // Початкова матриця
            int[][] matrix = {
                    {1, 2, 3},
                    {4, 5, 6},
                    {7, 8, 9}
            };

            // Значення, яке потрібно додати до кожного елемента
            int valueToAdd = 10;

            // Анонімний метод для додавання значення до елемента матриці
            Function<Integer, Integer> addValue = (x) -> x + valueToAdd;

            // Застосування методу до кожного елемента матриці
            int[][] updatedMatrix = applyFunctionToMatrix(matrix, addValue);

            // Виведення результату
            System.out.println("Updated Matrix:");
            for (int[] row : updatedMatrix) {
                for (int element : row) {
                    System.out.print(element + " ");
                }
                System.out.println();
            }
        }

        // Метод для застосування функції до кожного елемента матриці
        public static int[][] applyFunctionToMatrix ( int[][] matrix, Function<Integer, Integer> function){
            int[][] result = new int[matrix.length][matrix[0].length];
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length; j++) {
                    result[i][j] = function.apply(matrix[i][j]);
                }
            }
            return result;
        }
    }
