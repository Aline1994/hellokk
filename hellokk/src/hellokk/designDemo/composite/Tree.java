package hellokk.designDemo.composite;

public class Tree {
	TreeNode root = null;
	public Tree(String name){
		root = new TreeNode(name);
	}
	public static void main(String[] args) {
		Tree tree = new Tree("zx");
		TreeNode nodezx1 = new TreeNode("zx1");
		TreeNode nodezx2 = new TreeNode("zx2");
		nodezx1.add(nodezx2);
		tree.root.add(nodezx1);
		System.out.println("build the tree finished");
	}
}
