package Tree;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BFSTraversal {
    public void levelOrderTraversal(TreeNode treeNode) {
        Queue<TreeNode> treeNodeQueue = new LinkedList<>();
        List<List<Integer>> wrapList = new LinkedList<>();
        if(treeNode!=null) {
            treeNodeQueue.offer(treeNode);
            while(!treeNodeQueue.isEmpty()) {
                Integer length = treeNodeQueue.size();
                List<Integer> subList = new LinkedList<>();
                for(int i = 0; i<length;i++) {
                    if(treeNodeQueue.peek().leftNode!=null) {
                        treeNodeQueue.offer(treeNodeQueue.peek().leftNode);
                    }
                    if(treeNodeQueue.peek().rightNode!=null) {
                        treeNodeQueue.offer(treeNodeQueue.peek().rightNode);
                    }
                    subList.add(treeNodeQueue.poll().value);
                }
                wrapList.add(subList);
            }
        }
        wrapList.forEach(integers -> integers.forEach( integer -> {
            System.out.println(integer);
        }));
    }
}
