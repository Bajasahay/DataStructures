package Tree;

public class TreeMain {
    public TreeNode addElements() {
        TreeNode rootNode = new TreeNode();
        rootNode.value = 1;

        TreeNode firstLeftNode = new TreeNode();
        firstLeftNode.value = 2;

        TreeNode firstRightNode = new TreeNode();
        firstRightNode.value = 3;

        TreeNode leftNodeToFirstLeftNode = new TreeNode();
        leftNodeToFirstLeftNode.value = 4;

        TreeNode rightNodeToFirstLeftNode = new TreeNode();
        rightNodeToFirstLeftNode.value = 5;

        TreeNode leftNodeToFirstRightNode = new TreeNode();
        leftNodeToFirstRightNode.value = 6;

        TreeNode rightNodeToFirstRightNode = new TreeNode();
        rightNodeToFirstRightNode.value = 7;

        rootNode.leftNode = firstLeftNode;
        rootNode.rightNode = firstRightNode;

        firstLeftNode.rightNode = rightNodeToFirstLeftNode;
        firstLeftNode.leftNode = leftNodeToFirstLeftNode;

        firstRightNode.leftNode = leftNodeToFirstRightNode;
        firstRightNode.rightNode = rightNodeToFirstRightNode;

        return rootNode;
    }

    public void executeCode() {
        TreeNode rootNode = addElements();
        DFSTraversal dfsTraversal = new DFSTraversal();
        //dfsTraversal.preOrderTraversal(rootNode);
        //dfsTraversal.postOrderTraversal(rootNode);
        //dfsTraversal.inOrderTraversal(rootNode);

        BFSTraversal bfsTraversal = new BFSTraversal();
        //bfsTraversal.levelOrderTraversal(rootNode);

        //dfsTraversal.preOrderTraversalUsingStack(rootNode);
        dfsTraversal.inOrderTraversal(rootNode);
    }
}
