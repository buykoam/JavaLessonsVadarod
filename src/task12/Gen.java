package task12;

class Gen<T, S> {
    private T оbT;
    private S obS;

    public Gen(T obT, S obS) {
        this.оbT = obT;
        this.obS = obS;
    }

    public T getOЬT() {
        return оbT;
    }
    public S getObS() {
        return obS;
    }
    @Override
    public String toString() {
        return "Gen{" +
                "оbT=" + оbT +
                ", obS=" + obS +
                '}';
    }
}