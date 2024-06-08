package pacote;


public class View {
   public static void main(String[] args) {
        SistemaDeSenhas sistema = new SistemaDeSenhas();
        sistema.inserirLogin("001", "Bruno");
        sistema.inserirLogin("0011", "Maria");
        sistema.inserirLogin("01", "Pedro");
        sistema.inserirLogin("11", "Joana");
        sistema.inserirLogin("111", "Marina");
        sistema.inserirLogin("1010", "Thiago");
        sistema.inserirLogin("110010", "Isa");

        System.out.println("Validando os usernames e senhas");
        System.out.println("001 | Bruno");
        System.out.println(sistema.validarLogin("001", "Bruno"));
        System.out.println("0011 | Maria");
        System.out.println(sistema.validarLogin("001", "Maria"));
        System.out.println("01 | Pedro");
        System.out.println(sistema.validarLogin("01", "Pedro"));
        System.out.println("11 | Joana");
        System.out.println(sistema.validarLogin("11", "Joana"));
        System.out.println("111 | Marina");
        System.out.println(sistema.validarLogin("111", "Marina"));
        System.out.println("1010 | Thiago");
        System.out.println(sistema.validarLogin("1010", "Thiago"));
        System.out.println("110010 | Isa");
        System.out.println(sistema.validarLogin("110010", "Bella"));

        System.out.println("\nRemovendo o usuario 1010");
        sistema.removerLogin("1010");
        System.out.println("1010 | Thiago");
        System.out.println(sistema.validarLogin("1010", "Thiago"));
        
    } 
}
