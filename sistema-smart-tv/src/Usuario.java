public class Usuario {
    public static void main(String[] args) {
        SmartTv smartTv = new SmartTv();

        smartTv.dimuirVolume();
        smartTv.dimuirVolume();
        smartTv.dimuirVolume();
        smartTv.aumentarVolume();

        System.out.println("Canal Atual: " + smartTv.canal);
        smartTv.mudarCanal(13);
        System.out.println("Canal Atual: " + smartTv.canal);

        System.out.println("Volume ATUAL: " + smartTv.volume);

        System.out.println("TV Ligada? " + smartTv.ligada);
        System.out.println("Canal Atual: " + smartTv.canal);
        System.out.println("Volume Atual: " + smartTv.volume);


        smartTv.ligar();
        System.out.println("Novo Status - TV Ligada? " + smartTv.ligada);

        System.out.println("AGORA QUERO QUE DESLIGUE!");
        smartTv.desligar();
        System.out.println("Novo Status - TV Desligada? " + smartTv.ligada);


    }
}
