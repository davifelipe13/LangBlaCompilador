package syntacticTree;

import parser.*;

public class FirstCallNode extends GeneralNode {
	
	public ListNode rd; //
	public FirstCallNode fd;

	public FirstCallNode(Token t1, ListNode r, FirstCallNode f) {
		super(t1);
		rd = r;
		fd = f;
	}
}
