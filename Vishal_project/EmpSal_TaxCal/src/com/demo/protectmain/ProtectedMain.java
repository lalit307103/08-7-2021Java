package com.demo.protectmain;
import com.demo.testprotected.TestProtected;

 class ProtectedMain extends TestProtected
{ 
		public static void main(String[] args) {
		// TODO Auto-generated method stub
          ProtectedMain pm = new ProtectedMain();
          pm.displaymsg();// use protected
          System.out.println(pm.pub+"  i am from public accessible anywhere");//use public
          TestProtected tp = new TestProtected();
         
        
		}

		
}
