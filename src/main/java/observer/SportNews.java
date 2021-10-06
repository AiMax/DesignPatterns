package observer;

import java.util.LinkedList;
import java.util.List;

public class SportNews implements INewspaper {

    private String lastNew = "No news in the frontpage.";
    private List<IReader> readers = new LinkedList<>();

    @Override
    public String getLastNew() {
        return lastNew;
    }

    @Override
    public void setLastNew(String news) {
        this.lastNew = news;
        notifyReaders();
    }

    @Override
    public void notifyReaders() {
        for (IReader reader : readers){
            reader.getUpdate();
        }
    }

    @Override
    public void signUp(IReader reader) {
        if (!readers.contains(reader)){
            readers.add(reader);
        }
    }

    @Override
    public void signDown(IReader reader) {
        readers.remove(reader);
    }
}
