public class HospedagemVip extends Hospedagem {
    
    public HospedagemVip(double valor1) {
        super(valor1);
        //TODO Auto-generated constructor stub
    }

    public static double valor2 = 50.00;


    public static double hospVip(double valor1, double valor2){
        double valor = valor1 + valor2; 
        
        return valor;

    }

}
