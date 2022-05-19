public class Hospedagem{

    public static double valor1 = 100;

    public Hospedagem(double valor1) {
        
    }
   
    public static double getValor1() {
        return valor1;
    }

    public static void setValor1(double valor1) {
        Hospedagem.valor1 = valor1;
    }

    @Override
    public String toString() {
        return " Hospedagem valor " + valor1;
    }


    public static void printValor(){
        System.out.println(valor1);
    }

    
}

