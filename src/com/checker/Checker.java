package com.checker;

import com.bean.UML.XMI;
import com.bean.onto.OntoGenerator;

public class Checker {

	/**
	 * BDD
	 * - 1.每个Block块都有individual，如果没有，提示BlockInstanceMissing，将影响可追溯性传递，可在该Block相关的边上定义
	 * - 检查方法：for xmi中BDD块，{for 从该块出发或到达该块的边，{if有实例名，break} 非break到达 return error}                  
	 * 2.aggregation边尽量使用1：1的multiplicity, 然后标明实例名。如果发现1：多（1：*除外），提示InappropriateMultiplicity from 某块 to 某块，1:1 with instance name is better
	 * 检查方法：BDD的边上是否有1：多（1：*除外）的multiplicity
	 * 3.aggregation边必须有实例名称
	 */

	/**
	 * Act
	 * 1.对象流上的object与块操作返回值应一致，如果没有，提示InconsistentValueType，可修改块操作的返回值类型或object类型
	 * 检查思路:ObjectFlow(f)^hasObject(f1,o)^hasValueType(o,v1)^hasSource(f1,a)^mapToBF(a,bf)^hasValueType(bf,v2)^equals(v1,v2) ->haveNoError(actPartition,"true")
	 */
	
	/**
	 * TIM
	 * 
	 */
	
	/**
	 * BDD.1,BDD.2, BDD.3
	 * @param xmi
	 */
	public static void preCheck(XMI xmi){
		
	}
	/**
	 * BDD.1, Act.1, TIM
	 * @param xmi
	 * @param ont
	 */
	public static void postCheck(XMI xmi, OntoGenerator ont){
		
	}
	/**
	 * inCheck
	 * BDD.1
	 */
	public static void BDDFirstCheck(XMI xmi, OntoGenerator ont) {
		// TODO Auto-generated method stub
		
	}
}
