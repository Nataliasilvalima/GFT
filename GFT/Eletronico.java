public class Eletronico extends Produtos {

    public Eletronico(String nome, double valor, int quant) {
        super(nome, valor, quant);
        //TODO Auto-generated constructor stub
    }
    
    public static double acres( double total){
        double total2 = ((total * 15)/100);
        
        return total2;
        
    }
        
}

