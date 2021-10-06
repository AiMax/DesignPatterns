package observer;

public class PaperReader implements IReader{

    private INewspaper newspaper;

    public PaperReader(INewspaper newspaper){
        this.newspaper = newspaper;
    }

    @Override
    public void getUpdate() {
        System.out.println(newspaper.getLastNew());
    }
}
