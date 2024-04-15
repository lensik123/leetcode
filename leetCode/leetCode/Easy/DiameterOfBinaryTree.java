package leetCode.Easy;

public class DiameterOfBinaryTree {


    private int diameter;

    public int diameterOfBinaryTree1(TreeNode root) {
        diameter = 0;
        longestPath(root);
        return diameter;
    }

    private int longestPath(TreeNode node) {
        if (node == null) return 0;

        int leftPath = longestPath(node.left);
        int rightPath = longestPath(node.right);

        diameter = Math.max(diameter, leftPath + rightPath);

        return Math.max(leftPath, rightPath) + 1;
    }



    public static void main(String[] args) {
        // Создаем объекты TreeNode для каждого узла
        TreeNode root = new TreeNode(1);
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(3);
        TreeNode node4 = new TreeNode(4);
        TreeNode node5 = new TreeNode(5);

        // Связываем узлы вместе, чтобы представить структуру бинарного дерева
        root.left = node2;
        root.right = node3;
        node2.left = node4;
        node2.right = node5;

        DiameterOfBinaryTree diameter = new DiameterOfBinaryTree();
        diameter.diameterOfBinaryTree1(root);


    }
}


