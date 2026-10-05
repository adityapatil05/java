package dsa.tree;

public class BinarySearchTree {

    class Node{
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;

        }
    }
    Node root;

    public void addElement(int data){
        Node newNode =new Node(data);
        if(root==null){
            root=newNode;
            return;
        }
        Node temp=root;
        while(true) {
            if (newNode.data < temp.data) {
                if (temp.left == null) {
                    temp.left = newNode;
                    break;
                }
                temp = temp.left;

            } else {
                if(temp.right==null){
                temp.right = newNode;
                break;

                }
                temp=temp.right;

            }
        }

    }

    public void inOrder(){
        inOrder(root);
    }
    private void inOrder(Node root){
        if(root==null)return;
        inOrder(root.left);
        System.out.println(root.data+" ");
        inOrder(root.right);
    }
    public void postOrder(){
        postOrder(root);
    }
    private void postOrder(Node root){
        if(root==null)return;
        postOrder(root.left);
        postOrder(root.right);
        System.out.println(root.data+" ");
    }
    public void preOrder(){
        preOrder(root);
    }
    private void preOrder(Node root){
        if(root==null)return;
        System.out.println(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);
    }


    static void main(String[] args) {
        BinarySearchTree tree=new BinarySearchTree();

        tree.addElement(50);
        tree.addElement(20);
        tree.addElement(60);
        tree.addElement(90);
        tree.addElement(10);
        tree.addElement(70);
        tree.addElement(100);
        tree.inOrder();
        System.out.println("***********************");
        tree.postOrder();
        System.out.println("******************************");
        tree.preOrder();

    }
}
