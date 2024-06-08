package pacote;


public class View {
   public static void main(String[] args) {
        SistemaDeSenhas sistema = new SistemaDeSenhas();
        sistema.insereLogin("001", "Bruno");
        sistema.insereLogin("0011", "Maria");
        sistema.insereLogin("01", "Pedro");
        sistema.insereLogin("11", "Joana");
        sistema.insereLogin("111", "Marina");
        sistema.insereLogin("1010", "Thiago");
        sistema.insereLogin("110010", "Isa");

        System.out.println(sistema.validaLogin("001", "Bruno"));  
        System.out.println(sistema.validaLogin("01", "Pedro"));   
        System.out.println(sistema.validaLogin("11", "Joana"));   
        System.out.println(sistema.validaLogin("111", "Marina")); 
        System.out.println(sistema.validaLogin("1010", "Thiago"));
        System.out.println(sistema.validaLogin("001", "Maria"));  
        System.out.println(sistema.validaLogin("110010", "Bella"));
        

        sistema.removeLogin("1010");
        System.out.println(sistema.validaLogin("1010", "Thiago"));
        
    } 
}
