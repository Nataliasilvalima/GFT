public class Produtos {
    public static String nome;
    public static double valor;
    public static int quant;

    

    public Produtos(String nome, double valor, int quant) {
        this.valor = valor;
        this.nome = nome;
        this.quant = quant;
    }


    @Override
    public String toString() {
        return "Produto: " + nome +"\nValor: " + valor +"\nQuant:"+ quant;
    }


    public static String getNome() {
        return nome;
    }


    public static void setNome(String nome) {
        Produtos.nome = nome;
    }


    public static double getValor() {
        return valor;
    }


    public static void setValor(double valor) {
        Produtos.valor = valor;
    }


    public static int getQuant() {
        return quant;
    }

    public static void setQuant(int quant) {
        Produtos.quant = quant;
    }


    public static double calcularValorFinal( double valor, int quant ){
        double total = (valor* quant) / 10;
        
        return total;
    
    }
    

}
