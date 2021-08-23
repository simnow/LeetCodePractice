package com.android.leetcode.offer;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Offer32
 * 从上到下打印出二叉树的每个节点，同一层的节点按照从左到右的顺序打印。
 * <p>
 *  
 * <p>
 * 例如:
 * 给定二叉树: [3,9,20,null,null,15,7],
 * <p>
 * 3
 * / \
 * 9  20
 * /  \
 * 15   7
 * 返回：
 * <p>
 * [3,9,20,15,7]
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/cong-shang-dao-xia-da-yin-er-cha-shu-lcof
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 * @author liangzhen
 * @date 8/23/21 8:07 PM
 */
public class Offer32 {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }

        class Solution {
            public int[] levelOrder(final TreeNode root) {
                if (null == root) {
                    return new int[0];
                }
                Queue<TreeNode> queue = new LinkedList<TreeNode>() {{
                    add(root);
                }};
                ArrayList<Integer> arrayList = new ArrayList<>();
                while (!queue.isEmpty()) {
                    TreeNode node = queue.poll();
                    arrayList.add(node.val);
                    if (null != node.left) {
                        queue.add(node.left);
                    }
                    if (null != node.right) {
                        queue.add(node.right);
                    }
                }
                int[] res = new int[arrayList.size()];
                for (int i = 0; i < arrayList.size(); i++) {
                    res[i] = arrayList.get(i);
                }
                return res;
            }
        }
        //从上到下按层打印二叉树，同一层的节点按从左到右的顺序打印，每一层打印到一行。
        public List<List<Integer>> levelOrder(TreeNode root) {
            List<List<Integer>> mLists=new ArrayList<>();
            if (null == root) {
                return mLists;
            }
            Queue<TreeNode> queue = new LinkedList<>();
            queue.add(root);
            while (!queue.isEmpty()){
                List<Integer> tmp=new ArrayList<>();
                for (int i=queue.size();i>0;i--){
                    TreeNode node=queue.poll();
                    tmp.add(node.val);
                    if (null != node.left) {
                        queue.add(node.left);
                    }
                    if (null != node.right) {
                        queue.add(node.right);
                    }
                }
                mLists.add(tmp);
            }
            return mLists;
        }
        //请实现一个函数按照之字形顺序打印二叉树，即第一行按照从左到右的顺序打印，第二层按照从右到左的顺序打印，第三行再按照从左到右的顺序打印，其他行以此类推。
        public List<List<Integer>> levelOrder2(TreeNode root) {
            List<List<Integer>> mLists=new ArrayList<>();
            if (null == root) {
                return mLists;
            }


            Queue<TreeNode> queue = new LinkedList<>();
            queue.add(root);
            while (!queue.isEmpty()){
                LinkedList<Integer> tmp=new LinkedList<>();
                for (int i=queue.size();i>0;i--){
                    TreeNode node=queue.poll();
                    if(mLists.size() % 2 == 0) {
                        tmp.addLast(node.val); // 偶数层 -> 队列头部
                    } else {
                        tmp.addFirst(node.val); // 奇数层 -> 队列尾部
                    }
                    if (null != node.left) {
                        queue.add(node.left);
                    }
                    if (null != node.right) {
                        queue.add(node.right);
                    }
                }
                mLists.add(tmp);
            }
            return mLists;
        }
    }
}
