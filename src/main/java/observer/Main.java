package observer;

public class Main {
    public static void main(String[] args) {
        INewspaper sportNewspaper = new SportNews();
        IReader r1 = new PaperReader(sportNewspaper);
        IReader r2 = new PaperReader(sportNewspaper);
        IReader r3 = new PaperReader(sportNewspaper);
        IReader r4 = new PaperReader(sportNewspaper);
        sportNewspaper.signUp(r1);
        sportNewspaper.signUp(r2);
        sportNewspaper.signUp(r3);
        sportNewspaper.setLastNew("New Match for october 12");
    }
}
