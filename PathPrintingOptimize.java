package com.algos;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PathPrintingOptimize {
	public static void main (String[] args) {
		String s = "a\b";
		System.out.println("length===>"+s.length());
		System.out.println("Hello Java");
    Map<String, List<Node>> pathsMap = new HashMap<String, List<Node>>();
    List<Node> a_MappingList = new ArrayList<Node>();
    a_MappingList.add(new Node("B"));
    a_MappingList.add(new Node("C"));
    a_MappingList.add(new Node("D"));
    
    List<Node> b_MappingList = new ArrayList<Node>();
    b_MappingList.add(new Node("C"));
    b_MappingList.add(new Node("D"));
    
    List<Node> c_MappingList = new ArrayList<Node>();
    c_MappingList.add(new Node("D"));
    
    List<Node> d_MappingList = new ArrayList<Node>();
    
    pathsMap.put("A", a_MappingList);
    pathsMap.put("B", b_MappingList);
    pathsMap.put("C", c_MappingList);
    pathsMap.put("D", d_MappingList);
    
    String tempPath1 = "";
    String tempPath2 = "";
    String tempPath3 = "";
    String tempPath4 = "";
    for(String rootNode : pathsMap.keySet()) {
    	tempPath1 = "";
        tempPath2 = "";
        tempPath3 = "";
        tempPath4 = "";
    	tempPath1+=rootNode;
    	List<Node> nodeList1 = pathsMap.get(rootNode);
    	if(pathsMap.get(rootNode).size()==0) {
    		System.out.println("final path="+tempPath1);
    		tempPath1="";
    	}
    	for(Node rootNode1 : nodeList1) {
    		tempPath2=tempPath1+rootNode1.getName();
        	pathsMap.get(rootNode1.getName());
        	List<Node> nodeList2 = pathsMap.get(rootNode1.getName());
        	if(pathsMap.get(rootNode1.getName()).size()==0) {
        		System.out.println("final path="+tempPath2);
        		tempPath2 = "";
        	}
        	for(Node rootNode2 : nodeList2) {
        		tempPath3 = tempPath2+rootNode2.getName();
            	pathsMap.get(rootNode2.getName());
            	List<Node> nodeList3 = pathsMap.get(rootNode2.getName());
            	if(pathsMap.get(rootNode2.getName()).size()==0) {
            		System.out.println("final path="+tempPath3);
            		tempPath3 = "";
            	}
            	for(Node rootNode3 : nodeList3) {
            		tempPath4 = tempPath3+rootNode3.getName();
                	if(pathsMap.get(rootNode3.getName()).size()==0) {
                		System.out.println("final path="+tempPath4);
                		tempPath4 = "";
                	}
                	
                }
            }
        }
    }
	}
}

class Node2{
  private List<String> nodeList = new ArrayList<String>();
  private String name;
  

public Node2(String name) {
	super();
	this.name = name;
}
public List<String> getNodeList() {
	return nodeList;
}
public void addToNodeList(List<String> nodeList) {
	this.nodeList = nodeList;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
  
  
}