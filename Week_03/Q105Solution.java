package Week_03;


import Util.TreeNode;

import java.util.HashMap;
import java.util.Map;

/**
 * 递归法实现
 *
 * @author huangtao
 * @date 2020/8/29
 */
public class Q105Solution {
	public TreeNode buildTree(int[] preorder, int[] inorder) {
		int preLen = preorder.length;
		int inLen = inorder.length;

		if (preLen != inLen) {
			return null;
		}

		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < inLen; i++) {
			map.put(inorder[i], i);
		}

		return buildTree(preorder, 0, preLen-1, map, 0, inLen-1);
	}

	private TreeNode buildTree(int[] preorder, int preLeft, int preRight, Map<Integer, Integer> map, int inLeft, int inRight) {
		if (preLeft > preRight || inLeft > inRight) {
			return null;
		}

		int rootVal = preorder[preLeft];
		TreeNode root = new TreeNode(rootVal);
		int rootIndex = map.get(rootVal);
		root.left = buildTree(preorder, preLeft+1, preLeft + rootIndex - inLeft, map, inLeft, rootIndex-1);
		root.right = buildTree(preorder, preLeft + rootIndex - inLeft + 1, preRight, map, rootIndex + 1, inRight);
		return root;
	}
}
