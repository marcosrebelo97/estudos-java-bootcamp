public class ListaCircular<T> {

    private No<T> cabeca;
    private No<T> cauda;
    private int tamanhoLista;

    public ListaCircular() {
        cauda = null;
        cabeca = null;
        tamanhoLista = 0;
    }

    public void add(T conteudo) {
        No<T> novoNo = new No<>(conteudo);

        if (tamanhoLista == 0) {
            cabeca = novoNo;
            cauda = cabeca;
            cabeca.setNoProximo(cauda);
        } else {
            novoNo.setNoProximo(cauda);
            cabeca.setNoProximo(novoNo);
            cauda = novoNo;
        }
        tamanhoLista++;

    }

    public void remove(int index) {
        if (index >= tamanhoLista)
            throw new IndexOutOfBoundsException("O índice é maior que o tamanho da lista");

        No<T> noAuxiliar = cauda;
        if (index == 0) {
            cauda = cauda.getNoProximo();
            cabeca.setNoProximo(cauda);
        } else if (index == 1) {
            cauda.setNoProximo(cauda.getNoProximo().getNoProximo());
        } else {
            for (int i = 0; i < index - 1; i++) {
                noAuxiliar = noAuxiliar.getNoProximo();
            }
            noAuxiliar.setNoProximo(noAuxiliar.getNoProximo().getNoProximo());
        }
        tamanhoLista--;
    }

    public T get(int index) {
        return getNo(index).getConteudo();
    }

    private No<T> getNo(int index) {
        if (this.isEmpty())
            throw new IndexOutOfBoundsException("A lista está vazia!");

        if (index == 0) {
            return cauda;
        }

        No<T> noAuxiliar = this.cauda;
        for (int i = 0; i < index; i++) {
            noAuxiliar = noAuxiliar.getNoProximo();
        }

        return noAuxiliar;
    }

    public boolean isEmpty() {
        return tamanhoLista == 0 ? true : false;
    }

    public int size() {
        return tamanhoLista;
    }

    @Override
    public String toString() {
        String strRetorno = "";

        No<T> noAuxiliar = cauda;
        for (int i = 0; i < size(); i++) {
            strRetorno += "[No{conteudo = " + noAuxiliar.getConteudo() + "}]--->";
            noAuxiliar = noAuxiliar.getNoProximo();
        }

        strRetorno += size() != 0 ? "(Retorna ao início)" : "[]";

        return strRetorno;
    }

}
