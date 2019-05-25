package vacanta;

public class Holiday {
    private String destination;
    private int duration;
    private static int zileConcediu =25;

    public Holiday(String destination, int duration) {
        this.destination = destination;
        this.duration = duration;
        if(zileConcediu<duration) {
            System.out.println("Nu mai aveti suficiente zile de concediu!");
        }
        zileConcediu -=duration;
    }

    public void afiseaza(){
        System.out.println("Vacanta are destinatia "+destination
                + " si durata "+ duration + " zile.");
    }

    public static int zileConcediuRamasa(){
       return zileConcediu;
    }
}




























