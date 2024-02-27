public class SistemaMedidaA {
    public static void main(String[] args) {
        //Modo switch case
        String sigla = "A";
        switch (sigla) {
            case  "P": {
                System.out.println("PEQUENO");
                break;
            }
            case "M": {
                System.out.println("MÉDIO");
                break;
            }
            case "G": {
                System.out.println("GRANDE");
                break;
            }
            default:
                System.out.println("INDEFINIDO");
        }
        
    }
}
