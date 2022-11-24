package datastructures.trees;

public class PerfectBinaryTree {

  private int depth;
  private int level;

  public int getNodeDepth(Node node){
    while(node != null){
      depth++;
      node = node.left;
    }
    return depth;
  }

  public boolean isPerfectTree(Node root){
    return checkIfTreeIsPerfect(root, getNodeDepth(root), 0);
  }

  private boolean checkIfTreeIsPerfect(Node root, int depth, int level) {
    isEmptyTree(root);
    isChildrenExist(root);
    return checkIfTreeIsPerfect(root.left, depth,level + 1) && checkIfTreeIsPerfect(root.right, depth, level + 1);
  }

  public boolean isEmptyTree(Node root){
    return root == null;
  }

  public boolean isChildrenExist(Node root){
    if(root.right == null && root.left == null)
      return (depth == level + 1);

    return (root.left == null || root.right == null);
  }
}
