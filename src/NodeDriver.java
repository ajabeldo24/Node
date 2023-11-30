public class NodeDriver {
    public static void main(String[] args) {
        Node<Integer> node1 = new Node<>();
        Node<Integer> node2 = new Node<>(1);
        Node<Integer> node3 = new Node<>(node1, node2, 1);
        Node<String> node4 = new Node<>("blablabla");
        node1.setChild(node2);
        node3.setParent(node2);
        node2.setData(2);

        System.out.println(node2.getData());
        System.out.println(node1.getChild());
        System.out.println(node3.getParent());

        System.out.println(node2.toString());
        System.out.println(node2.equals(node1, node2)); //return false
        node2.setData(node1.getData());
        System.out.println(node2.equals(node2, node1)); //return true
        }
    }

