
public class Main {
    public static void main(String[] args) {
        Movie m1= new Movie("film1",120,"action");
        Movie m2 = new Movie("film2",80,"comedy");
        Movie m3= new Movie("film3",50);
        System.out.println(m1.afiseaza());
        System.out.println(m3.afiseaza());
        System.out.println(Movie.getMoviesWithoutGenre());
        System.out.println(m1.isGenre("action"));
        System.out.println(m1.isGenre("comedy"));
        System.out.println(m1.isGenre(null));
    }
}
