package Tree;

import com.sun.source.tree.Tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class DFSTraversal {

    public void preOrderTraversal(TreeNode rootNode) {
        if (rootNode == null) {
            return;
        }
        System.out.println(rootNode.value);
        preOrderTraversal(rootNode.leftNode);
        preOrderTraversal(rootNode.rightNode);
    }

    public void postOrderTraversal(TreeNode rootNode) {
        if (rootNode == null) {
            return;
        }
        postOrderTraversal(rootNode.leftNode);
        postOrderTraversal(rootNode.rightNode);
        System.out.println(rootNode.value);
    }

    public void inOrderTraversal(TreeNode rootNode) {
        if (rootNode == null) {
            return;
        }
        inOrderTraversal(rootNode.leftNode);
        System.out.println(rootNode.value);
        inOrderTraversal(rootNode.rightNode);
    }

    public void preOrderTraversalUsingStack(TreeNode rootNode) {
        Stack<TreeNode> treeNodeStack = new Stack<>();
        List<Integer> integerList = new ArrayList<>();

        if (rootNode != null) {
            treeNodeStack.push(rootNode);
            while (!treeNodeStack.isEmpty()) {
                rootNode = treeNodeStack.pop();
                integerList.add(rootNode.value);
                if (rootNode.rightNode != null) {
                    treeNodeStack.push(rootNode.rightNode);
                }
                if (rootNode.leftNode != null) {
                    treeNodeStack.push(rootNode.leftNode);
                }
            }
        }
        integerList.forEach(integer -> System.out.println(integer));
    }

    //incomplete
    public void postOrderTraversalUsingStack(TreeNode rootNode) {
        Stack<TreeNode> treeNodeStack = new Stack<>();
        List<Integer> integerList = new ArrayList<>();

        if (rootNode != null) {
            treeNodeStack.push(rootNode);
            while (!treeNodeStack.isEmpty()) {
                if (treeNodeStack.peek().leftNode != null) {
                    treeNodeStack.push(rootNode.leftNode);
                }
                if (treeNodeStack.peek().rightNode != null) {
                    treeNodeStack.push(rootNode.rightNode);
                }
            }
        }
    }

    public void inOrderTraversalUsingStack(TreeNode treeNode) {
        Stack<TreeNode> treeNodeStack = new Stack<>();
        List<Integer> integerList = new ArrayList<>();

        TreeNode rootNode = treeNode;
        while (true) {
            if (rootNode != null) {
                treeNodeStack.push(rootNode);
                rootNode = rootNode.leftNode;
            } else {
                if(treeNodeStack.isEmpty()) {
                    break;
                }
                rootNode = treeNodeStack.pop();
                integerList.add(rootNode.value);
                rootNode = rootNode.rightNode;
            }
        }

        integerList.forEach(integer -> System.out.println(integer));
    }
}
