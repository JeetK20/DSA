package W4Day3;

class Node{
    int data;
    Node left;
    Node right;
}

public class BST {
    private Node root;
    public BST(){
        root = null;
    }

    public void insert(int i){
        Node newNode = new Node();
        newNode.data = i;
        if(root == null)
            root = newNode;
        else{
            Node current = root;
            Node parent;
            while(true){
                parent = current;
                if(i < current.data){
                    current = current.left;
                    if(current==null){
                        parent.left = newNode;
                        return;
                    }
                }
                else{
                    current = current.right;
                    if(current==null){
                        parent.right = newNode;
                        return;
                    }
                }
            }
        }
    }

    public Node find(int i){
        Node current = root;
        while(current.data != i){
            if(i<current.data)
                current = current.left;
            else
                current = current.right;

            if(current == null)
                return null;
        }
        return current;
    }


    public void inOrder(Node root){
        if(root!=null){
            inOrder(root.left);
            System.out.println(root.data);
            inOrder(root.right);
        }
    }

    public void preOrder(Node root){
        if(root!=null){
            System.out.println(root.data);
            inOrder(root.left);
            inOrder(root.right);
        }
    }

    public void postOrder(Node root){
        if(root!=null){
            inOrder(root.left);
            inOrder(root.right);
            System.out.println(root.data);
        }
    }

    public static void main(String[] args) {
        
        BST bst = new BST();
        
        bst.insert(15);
        bst.insert(4);
        bst.insert(8);
        bst.preOrder(bst.root);
        int key = 4;
        System.out.println(bst.find(key).data == key );
    }
}
