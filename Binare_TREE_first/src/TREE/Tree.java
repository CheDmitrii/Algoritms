package TREE;

public class Tree<T extends Comparable> {
    private Node<T> root;
    private int numberEllement;


    public Tree() {
        root = new Node<>();
        numberEllement = 0;
    }

    public void addElemment(T ellement){
        if (numberEllement == 0){
            root.date = ellement;
            root.left = null;
            root.rigth = null;
        }else {
            Node<T> el = root;
            while (el != null){
                if (el.date.compareTo(ellement) == 0){
                    el.countEllement++;
                }
                if (el.date.compareTo(ellement) == 1){
                    el = el.rigth;
                }else {
                    el = el.left;
                }
            }
            el.date = ellement;
            el.rigth = null;
            el.left = null;
        }
    }

    public Node<T> getValue(Node<T> NodeEll){
        Node<T> helpNode = NodeEll;
        if (helpNode.rigth == null) {
            if (helpNode.left == null){
                return null;
            }
            return helpNode.left;
        }
        while (true) {
            if (helpNode.left == null) {

            }
            if (helpNode.left == null && NodeEll.rigth == null) {

            }
        }
    }


    public void newRemove(T ellement){
        Node<T> el = root.searchNode(ellement);
        if (el.countEllement > 1){
            el.countEllement--;
        }else {
            Node<T> helpNode = null;
            if (el.left == null && el.rigth == null){
                el.date = null;
                return;
            }
            if (el.rigth != null && el.left != null) {
                helpNode = el.rigth;
                if (helpNode.left == null){
                    Node<T> helpLeft = el.left;
                    el = helpNode;
                    el.left = helpLeft;
                    return;
                }
                while (helpNode.left != null || helpNode.rigth != null){
                    if (helpNode.left != null){
                        helpNode = helpNode.left;
                    }else {
                        helpNode = helpNode.rigth;
                    }
                }
                Node<T> elLeft =el.left;
                Node<T> elRight = el.rigth;
                el = helpNode;
                el.left = elLeft;
                el.rigth = elRight;
                return;
            }
            if (el.rigth != null && el.left == null){
                el = el.rigth;
                return;
            }
            if (el.left != null && el.rigth == null){
                el = el.left;
                return;
            }
        }
    }




    private static class Node<T extends Comparable>{
        private T date;
        private Node<T> rigth;
        private Node<T> left;
        private Node<T> parent;
        private int countEllement;

        public Node(){
            countEllement = 1;
        }
        public Node(T ellement, Node<T> parent){
            this.date = ellement;
            this.parent = parent;
        }
        public Node(T date, Node<T> left, Node<T> rigth, Node<T> parent){
            this.parent = parent;
            this.rigth = rigth;
            this.left = left;
            this.date = date;
            this.countEllement = 1;
        }
        public Node<T> insertEllement(T ellement){
            if (this.date.compareTo(ellement) == -1){
                if (this.rigth == null){
                    this.rigth = new Node(ellement, this);
                    return this.rigth;
                }else {
                    return this.rigth.insertEllement(ellement);
                }
            }
            if (this.date.compareTo(ellement) == 1) {
                if (this.left == null) {
                    this.left = new Node<>(ellement, this);
                    return this.left;
                } else {
                    return this.left.insertEllement(ellement);
                }
            }
            if (this.date.compareTo(ellement) == 0){
                this.countEllement++;
            }
            return this;
        }
        public Node<T> searchNode(T ellement){
            Node<T> ellNode = this;
            if (ellNode.date.compareTo(ellement) == 0){
                return this;
            }
            while (ellNode.left != null || ellNode.rigth != null){
                if (ellNode.date.compareTo(ellement) == 0){
                    return ellNode;
                }
                if (ellNode.date.compareTo(ellement) == 1){
                    ellNode = ellNode.left;
                }
                if (ellNode.date.compareTo(ellement) == -1){
                    ellNode = ellNode.rigth;
                }
            }
            return ellNode;
        }

    }
}
