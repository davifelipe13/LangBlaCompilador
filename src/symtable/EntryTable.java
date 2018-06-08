package symtable;

//classe geral para as possíveis entradas na tabela de símbolos
public abstract class EntryTable {
	
    public String name; // nome do símbolo (var., método ou classe)
    public EntryTable next; // apontador para próximo dentro da tabela 
    public int scope; // número do aninhamento corrente
    public Symtable mytable; // entrada aponta para a tabela da qual ela é parte
    
    
	// Continua..

}
