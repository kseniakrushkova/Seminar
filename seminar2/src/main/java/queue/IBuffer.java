package queue;

public interface IBuffer {
    public int getElem();

    public void setElem(int elem);

    public int countElem();

    public void cleanBuffer();

    public boolean checkEmpty();
}
