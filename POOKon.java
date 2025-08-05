public class POOKon {
    public static void main(String[] args) {
        Carro carro1 = new Carro("JCA3I76");
        Cliente cliente1 = new Cliente ("@__goldani");
        Venda venda1 = new Venda (500000, cliente1, carro1);


        System.out.println(venda1);
    }
}
