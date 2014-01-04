package com.gaurav.tree;
import org.testng.Assert;
import org.testng.annotations.Test;

@Test
public class BinaryTreeTest {
	public static void add() throws NodeNotFoundException {
		Assert.assertEquals(true, new BinaryTree<String>().add(null, "00000000"));
	}
}