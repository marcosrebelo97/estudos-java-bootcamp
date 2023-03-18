package teste;

public class No<T> {

    private T object;
    private No<T> refNo;

    public No() {
    }

    public No(T object) {
        this.refNo = null;
        this.object = object;
    }

    public Object getObject() {
        return this.object;
    }

    public void setObject(T object) {
        this.object = object;
    }

    public No getRefNo() {
        return this.refNo;
    }

    public void setRefNo(No refNo) {
        this.refNo = refNo;
    }

    @Override
    public String toString() {
        return "{" +
                " object='" + getObject() + "'" +
                "}";
    }

}
