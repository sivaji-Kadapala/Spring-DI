package com.constructor;

public class Student2 {
	//constructor
		private int ht;
		private String branch;
		public Student2(int ht) {
			this.ht=ht;
		}
		public Student2(int ht, String branch) {
			this.ht = ht;
			this.branch = branch;
		}

		
		
		public void displayStudent1() {
			System.out.println("hall ticket is:"+ht+",branch is:"+branch);
		}

}
