package symtable;

public class EntryClass extends EntryTable {
	
	public Symtable nested; // tabela para declaracão de elementos aninhados
    public EntryClass parent; // entrada correspondente à superclasse

    public EntryClass(String n, Symtable t) {
        name = n; // nome da classe declarada
        nested = new Symtable(this); // tabela onde inserir vars, métodos ou classes
        parent = null; // sua superclasse
    }
    
	// Continua..

}
