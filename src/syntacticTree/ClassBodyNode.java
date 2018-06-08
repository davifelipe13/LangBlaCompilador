package syntacticTree;

import parser.*;


public class ClassBodyNode extends GeneralNode {
	
    public ListNode fcnode; // nodo que representa a primeira chamada

    public ClassBodyNode(Token t1, ListNode f) {
        super(t1); // passa token de referência para construtor da superclasse
        fcnode = f;
    }
}