public class Main
{
    public static void main(String[] args)
    {
        Lista l1 = new Lista();
        l1.add(112, "tonno", 2.95);
        l1.add(890, "pasta", 10.4);
        l1.add(352,"pesto",0.99); //in sconto
        l1.stampa();
    }
}