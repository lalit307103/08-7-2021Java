// class used to display message
package com.utility.displaymsg;

import java.io.PrintStream;

public class DisplayMessage {
private static PrintStream ps;
static {
	ps = new PrintStream(System.out);
}
public static void displayMessage(String obj) {
	ps.println("enter "+obj);
}

}
