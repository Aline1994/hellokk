package hellokk.designDemo.composite;

import java.util.Enumeration;
import java.util.Vector;

public class TreeNode {
	private String name;
	private TreeNode parent;
	private Vector<TreeNode>chirldren = new Vector<TreeNode>();
	
	public TreeNode(String name){
		this.name = name;
	}
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name = name;
	}
	public TreeNode getParent(){
		return parent;
	}
	public void setParent(TreeNode parent){
		this.parent = parent;
	}
	public void add(TreeNode node){
		chirldren.add(node);
	}
	public void remove(TreeNode node){
		chirldren.remove(node);
	}
	public Enumeration<TreeNode>getChirldren(){
		return chirldren.elements();
	}
}
