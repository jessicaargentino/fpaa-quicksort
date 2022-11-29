public class Tempo {
    private Long start;

    public Tempo() {
        start = System.currentTimeMillis();
    }

    public long getTime() {
        return (System.currentTimeMillis() - start);
    }
}
