package symtable;

public class Symtable {

	  public EntryTable top; // apontador para o topo da tabela (mais recente)
	  public int scptr; // número que controla o escopo (aninhamento) corrente
	  public EntryClass levelup; // apontador para a entrada EntryClass de nível sup.

	  public Symtable(){ // cria uma tabela vazia
		  top = null;
	      scptr = 0;
	      levelup = null;
	  }

	  public Symtable(EntryClass up) { // cria tabela vazia apontando para nível sup.
		  top = null;
		  scptr = 0;
		  levelup = up;
	  }

	  public void add(EntryTable x) {
		  x.next = top; // inclui nova entrada no topo
		  top = x;
		  x.scope = scptr; // atribui para a entrada o número do escopo
		  x.mytable = this; // faz a entrada apontar para a tabela à qual pertence
	  }

	  public void beginScope() {
	      scptr++; // inicia novo aninhamento de variáveis
	  }

	  public void endScope() {
	      while ((top != null) && (top.scope == scptr))
	          top = top.next; // retira todas as variáveis do aninhamento corrente

	      scptr--; // finaliza aninhamento corrente
	  }

		/* Esse metodo procura o simbolo x na tabela e tambem na(s) tabela(s) de
		nivel superior, apontada por levelup. Procura por uma entrada do
		tipo EntryClass ou EntrySimple */
		public EntryTable classFindUp(String x) {
			EntryTable p = top;

			// para cada elemento da tabela corrente
			while (p != null) {
				// verifica se é uma entrada de classe ou tipo simples e compara o nome
				if (((p instanceof EntryClass) || (p instanceof EntrySimple)) &&
								p.name.equals(x)) {
						return p;
				}

				p = p.next; // próxima entrada
		 }

		if (levelup == null) { // se não achou e é o nível mais externo

				return null; // retorna null
		}

		// procura no nível mais externo
		return levelup.mytable.classFindUp(x);
		}

	  // Continua..





}
