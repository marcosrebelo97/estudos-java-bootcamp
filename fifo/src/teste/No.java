package teste;

public class No {

    private Object object;
    private No refNo;

    public No() {
    }

    public No(Object object) {
        this.refNo = null;
        this.object = object;
    }

    public Object getObject() {
        return this.object;
    }

    public void setObject(Object object) {
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
