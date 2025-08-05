public class Venda {
    private double valor;
    private Cliente cliente;
    private Carro carro;

    public Venda (double valor, Cliente cliente, Carro carro) {
        this.valor = valor;
        this.cliente = cliente;
        this.carro = carro;

    }

    public double getValor() {
        return this.valor;

    }

    
    public String toString() {
        return String.format("O carro com a placa %s foi vendido para o cliente %s por %s reais.",
        this.carro.getPlaca(), this.cliente.getNome(), this.valor);

    }

}
