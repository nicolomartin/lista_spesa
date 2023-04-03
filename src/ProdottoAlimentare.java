public class ProdottoAlimentare
{
    protected int codice;
    protected String nome;
    protected double prezzo;

    public ProdottoAlimentare(int codice, String nome, double prezzo)
    {
        this.codice = codice;
        this.nome = nome;
        this.prezzo = prezzo;
    }

    public void setCodice(int codice)
    {
        this.codice = codice;
    }

    public void setNome(String nome)
    {
        this.nome = nome;
    }

    public void setPrezzo(double prezzo)
    {
        this.prezzo = prezzo;
    }

    public int getCodice()
    {
        return codice;
    }

    public String getNome()
    {
        return nome;
    }

    public double getPrezzo()
    {
        return prezzo;
    }

    @Override
    public String toString()
    {
        String dati;

        dati = ("codice: " + codice + "\n" +
                "nome: " + nome + "\n" +
                "prezzo: " + prezzo + "\n");

        return dati;
    }

    @Override
    public boolean equals(Object obj)
    {
        if(obj instanceof Object)
        {
            if(this.codice == codice && this.nome == nome && this.prezzo == prezzo)
            {
                return true;
            }
            else
            {
                return false;
            }
        }
        return false;
    }
}