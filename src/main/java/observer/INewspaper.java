package observer;

public interface INewspaper {
    public String getLastNew();
    public void setLastNew( String news );
    public void notifyReaders();
    public void signUp(IReader reader);
    public void signDown(IReader reader);
}
