public class ContaBancaria implements Conta {
    private final String titular;
    private double saldo;

    public ContaBancaria(String titular, double saldoInicial) {
        this.titular = titular;
        this.saldo = saldoInicial;
    }

    public void depositar(double valor) {
        validar(valor);
        saldo += valor;
    }

    public void sacar(double valor) {
        validar(valor);
        if (valor > saldo) {
            throw new SaldoInsuficienteException("saldo insuficiente na conta de " + titular);
        }
        saldo -= valor;
    }

    public double getSaldo() {
        return saldo;
    }

    private void validar(double valor) {
        if (valor <= 0) {
            throw new IllegalArgumentException("o valor deve ser positivo");
        }
    }

    public String toString() {
        return titular;
    }
}