public class  Caixa {

    public static void calcularTotal(String nome, double valor, int qunt){
        System.out.println(nome);
        System.out.println(valor);
        System.out.println(qunt);

    }
    public static void main(String[] args) {
        Eletronico novo = new Eletronico("ferro", 50.00, 3);
        Movel novo1 = new Movel("mesa", 100.00, 5);

        System.out.println(novo);
        System.out.println(novo1);


    }
}
