package recovery;

import parser.*;

import java.util.*;
import parser.langBlaConstants;

public class First { //implementa os conjuntos first p/ alguns n.terminais

    static public final RecoverySet methoddecl = new RecoverySet();
    static public final RecoverySet vardecl = new RecoverySet();
    static public final RecoverySet classlist = new RecoverySet();
    static public final RecoverySet constructdecl = new RecoverySet();
    static public final RecoverySet statlist = new RecoverySet();
    static public final RecoverySet program = classlist;

    static {
        methoddecl.add(new Integer(langBlaConstants.INT));
        methoddecl.add(new Integer(langBlaConstants.STRING));
        methoddecl.add(new Integer(langBlaConstants.IDENT));
        methoddecl.add(new Integer(langBlaConstants.FLOAT));
        methoddecl.add(new Integer(langBlaConstants.BOOLEAN));
        methoddecl.add(new Integer(langBlaConstants.CHAR));
        

        vardecl.add(new Integer(langBlaConstants.INT));
        vardecl.add(new Integer(langBlaConstants.STRING));
        vardecl.add(new Integer(langBlaConstants.IDENT));
        vardecl.add(new Integer(langBlaConstants.FLOAT));
        vardecl.add(new Integer(langBlaConstants.BOOLEAN));
        vardecl.add(new Integer(langBlaConstants.CHAR));

        classlist.add(new Integer(langBlaConstants.CLASS));

        constructdecl.add(new Integer(langBlaConstants.CONSTRUCTOR));

        statlist.addAll(vardecl);
        statlist.add(new Integer(langBlaConstants.IDENT)); // first do atribstat
        statlist.add(new Integer(langBlaConstants.PRINT));
        statlist.add(new Integer(langBlaConstants.READ));
        statlist.add(new Integer(langBlaConstants.RETURN));
        statlist.add(new Integer(langBlaConstants.SUPER));
        statlist.add(new Integer(langBlaConstants.IF));
        statlist.add(new Integer(langBlaConstants.FOR));
        statlist.add(new Integer(langBlaConstants.LBRACE));
        statlist.add(new Integer(langBlaConstants.BREAK));
        statlist.add(new Integer(langBlaConstants.SEMICOLON));
    }
}