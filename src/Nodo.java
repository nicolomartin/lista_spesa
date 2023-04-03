public class Nodo
{
    public ProdottoAlimentare prodotto;
    public Nodo next;

    public Nodo(ProdottoAlimentare prodotto)
    {
        this.prodotto = prodotto;
        next = null;
    }
}