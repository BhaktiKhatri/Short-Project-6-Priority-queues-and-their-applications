package cs6301.g45;

/*
 * Class to hold the node information
 * @author Bhakti Khatri
 * @author Lopamudra Muduli
 * @author Sangeeta Kadambala
 * @author Gautam Gunda
 */

public class Tree {

	String item;
	double frequency;
	String label;
	Tree left;
	Tree right;
	public Tree(){
		label="";
		item="";
	}
	public Tree(String item, double frequency) {
		label="";
		this.item = item;
		this.frequency = frequency;
		left = null;
		right = null;
	}

	public Tree getLeft() {
		return left;
	}

	public void setLeft(Tree left) {
		this.left = left;
	}

	public Tree getRight() {
		return right;
	}

	public void setRight(Tree right) {
		this.right = right;
	}

}
