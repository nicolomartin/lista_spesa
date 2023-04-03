public class Lista {
    public Nodo start;
    public int size;

    public void add(int codice, String nome, double prezzo)
    {
        Nodo n1 = new Nodo(new ProdottoAlimentare(codice, nome, prezzo));
        if (start == null)
        {
            start = n1;
        }
        else if (start.next == null)
        {
            start.next = n1;
        }
        else
        {
            Nodo iter;
            for (iter = start.next; iter.next != null; iter = iter.next) ;
            iter.next = n1;
        }
        size++;
    }

    public void stampa()
    {
        Nodo iter;
        for (iter = start; iter != null; iter = iter.next)
        {
            System.out.println("prodotto: " + iter.prodotto.toString());
        }
    }

}