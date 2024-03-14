
public class Conta {

    int numero;

    String titular;

    double saldo;

    double limite;

    Data date;

    private static int totalDeContas;

    Conta (String titular, int numero){
        this.titular = titular;
        this.numero = numero;
        Conta.totalDeContas = Conta.totalDeContas + 1;

    }

    public static int getTotalDeContas(){
      return Conta.totalDeContas;
    }

    public void sacar(double valor) { saldo = saldo - valor; } 

    public void depositar(double valor) { saldo = saldo + deposito; }

    public void rendimento() { saldo = saldo + 0.1; }

}