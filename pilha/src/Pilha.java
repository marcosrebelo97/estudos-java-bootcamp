public class Pilha {

    private No refNoEntradaPilha;

    public Pilha(No refNoEntradaPilha) {
        this.refNoEntradaPilha = null;
    }

    public boolean isEmpty() { // verifica se está vazia
        return refNoEntradaPilha == null ? true : false;
    }

    public void push(No novoNo) { // empilhar
        No refAuxiliar = refNoEntradaPilha;
        refNoEntradaPilha = novoNo;
        refNoEntradaPilha.setRefNo(refAuxiliar);
    }

    public No pop() { // desempilhar
        if (!this.isEmpty()) {
            No noPoped = refNoEntradaPilha;
            refNoEntradaPilha = refNoEntradaPilha.getRefNo();
            return noPoped;
        }
        return null;
    }

    public No top() { // ultimo valor
        return refNoEntradaPilha;
    }

    @Override
    public String toString() {
        String retorno = "------------------\n";
        retorno += "     Pilha\n";
        retorno += "------------------\n";

        No noAuxiliar = refNoEntradaPilha;

        while (true) {
            if (noAuxiliar != null) {
                retorno += "[No{dado=" + noAuxiliar.getDado() + "}]\n";
                noAuxiliar = noAuxiliar.getRefNo();
            } else {
                break;
            }
        }
        retorno += "===============\n";
        return retorno;
    }

}
