public class BinaryTree {
    Tree root;

    public Tree addRecursive(Tree current, int value) {
        if (current == null) {
            return new Tree(value);
        }
        if (value < current.value) {
            current.left = addRecursive(current.left, value);
        } else if (value > current.value) {
            current.right = addRecursive(current.right, value);
        } else {
            return current;
        }
        return current;
    }
    public void add(int value) {
        root = addRecursive(root, value);
    }
    private boolean findNumber(Tree current, int value){
        if (current == null) {
            return false;
        }
        if (value == current.value) {
            return true;
        }
        return value < current.value
                ? findNumber(current.left, value)
                : findNumber(current.right, value);
    }
    public boolean contains(int value){
        return findNumber(root, value);
    }
    private Tree delete(Tree current, int value){
        if (current == null){
            return null;
        }
        if (value == current.value){
            if (current.left == null && current.right == null) {
                return null;
            }
            if (current.right == null) {
                return current.left;
            }
            if (current.left == null){
                return current.right;
            }
        }
        if (value < current.value) {
            current.left = delete(current.left, value);
            return current;
        }
        current.right = delete(current.right, value);
        return current;
    }
    private int smallValue(Tree root) {
        return root.left == null ? root.value : smallValue(root.left);
    }
    public void deletes(int value){
        root = delete(root, value);
    }
    public void traverseInOrder(Tree tree){
        if (tree != null){
            traverseInOrder(tree.left);
            System.out.print(" " + tree.value);
            traverseInOrder(tree.right);

        }
    }
}
