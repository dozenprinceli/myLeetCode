package Problem;

import java.util.ArrayList;
import java.util.List;

class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};

public class LeetCode_590 {
    // 递归法，思路较为简单
    public List<Integer> postorder1(Node root) {
        List<Integer> lst = new ArrayList<>();

        if (root == null) {
            return new ArrayList<>(0);
        } else {
            for (Node child : root.children) {
                lst.addAll(postorder1(child));
            }
            lst.add(root.val);
        }

        return lst;
    }

    // TODO: 迭代法求解
}
