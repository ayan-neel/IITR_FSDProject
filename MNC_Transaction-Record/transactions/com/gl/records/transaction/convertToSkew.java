package com.gl.records.transaction;

class convertToSkew{
public static void Skew(Node node) 
{ 
	if (node != null) { 
		Skew(node.left); 
		if (node.left == null) { 
			node.left = node.right; 
			node.right = null; 
		} 
		Skew(node.left); 
	} 
	
} 
}