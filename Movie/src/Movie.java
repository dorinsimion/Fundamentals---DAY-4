public class Movie {
    private String name;
    private int duration;
    private String genre;
    private static int count;

    Movie(String name,int duration,String genre){
        this.name=name;
        this.duration=duration;
        this.genre=genre;
    }

    Movie(String name,int duration){
        this(name,duration,"N/A");
        count++;
    }

    public static int getMoviesWithoutGenre() {
        return count;
    }

    public boolean isGenre(String genre){
        return this.genre.equals(genre);
    }

    public String afiseaza(){
        String genreExists = genre.equals("N/A") ? "" : " este din categoria "+genre+" si";
        return "Filmul "+name+ genreExists + " dureaza "  +duration+" minutes.";
    }
}
