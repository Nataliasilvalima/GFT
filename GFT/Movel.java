public class Movel  extends Produtos{
    
    public Movel(String nome, double valor, int quant) {
        super(nome, valor, quant);
        //TODO Auto-generated constructor stub
    }

    public static double acres1( double total){
        double total3 = ((total * 11)/100);
        
        return total3;
        
    }
    public static double acres2( double total){
        double total4 = ((total * 5)/100);
        
        return total4;
        
    }
}
