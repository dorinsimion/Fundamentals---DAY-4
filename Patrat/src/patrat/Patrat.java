package patrat;

public class Patrat {
    private double latura;

    public Patrat(double latura){
        this.latura=latura;
    }

    public double getSurface(){
        return latura*latura;
    }

    public double perimetru(){
        return 4*latura;
    }

    public void afiseaza(){
        for(int i=1;i<=latura;i++){
            for (int j=1;j<=latura;j++){
                if(i==1||i==latura||j==1||j==latura){
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public double getLatura(){
        return  latura;
    }

    public boolean equals(Patrat patrat){
        return this.latura==patrat.getLatura();
    }

    public String toString(){
        return "Patratul cu latura "+ latura;
    }

}
