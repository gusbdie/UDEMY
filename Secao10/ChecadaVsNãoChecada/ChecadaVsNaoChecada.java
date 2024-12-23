package Secao10.ChecadaVsNãoChecada;

public class ChecadaVsNaoChecada {

    public static void main(final String[] args) {
        
        try{
            geraErro1();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }

        try{
            geraErro2();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        
       System.out.println("FIM");
    }

    //Exceção NÃO checada
    static void geraErro1(){
        throw new RuntimeException("Ocorreu um erro #1");
    }
    //precisa desse throw para dai sim ocorrer a excecao, sem essa palavra
    //voc~e teria somente instanciado uma classe sem função alguma
    
    //Exceção checada
    static void geraErro2() throws Exception{
        throw new Exception("Ocorreu um erro #2");
    }
}
