package syntacticTree;

import parser.*;

public class RecursiveCallNode extends GeneralNode {
	
    public ListNode atriblist; // lista de classes aninhadas
    public ListNode vlist; // lista de variáveis da classe
    public ListNode ctlist; // lista de construtores
    public ListNode mlist; // lista de métodos

    public RecursiveCallNode(Token t1, ListNode atr, ListNode v, ListNode ct,
                         ListNode m) {
        super(t1); // passa token de referência para construtor da superclasse
        atriblist = atr;
        vlist = v;
        ctlist = ct;
        mlist = m;
    }

}
