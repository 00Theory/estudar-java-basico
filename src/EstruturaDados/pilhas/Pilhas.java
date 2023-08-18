package EstruturaDados.pilhas;

public class Pilhas {
    
    private NoPilha refNoEntradaPilha;

    public Pilhas() {
        this.refNoEntradaPilha = null;
    }

    public NoPilha top(){
        return refNoEntradaPilha;
    }

    public NoPilha pop(){
        if (!isEmpty()){
            NoPilha noPoped = refNoEntradaPilha;
            refNoEntradaPilha = refNoEntradaPilha.getRefNo();
            return noPoped;
        }
        return null;
    }

    public void push(NoPilha novoNo){
        NoPilha refAuxiliar = refNoEntradaPilha;
        refNoEntradaPilha = novoNo;
        refNoEntradaPilha.setRefNo(refAuxiliar);
    }

    public boolean isEmpty(){
        return refNoEntradaPilha == null ? true : false;
    }

    public String toString(){
        String stringRetorno = "---------\n";
        stringRetorno += "     Pilha\n";
        stringRetorno += "-----------\n";

        NoPilha noAuxiliar = refNoEntradaPilha;

        while (true){
            if (noAuxiliar != null){
                stringRetorno += "[No{dado= " + noAuxiliar.getDado() + "}]\n";
                noAuxiliar = noAuxiliar.getRefNo();
            }else{
                break;
            }
        }
        stringRetorno += "=============\n";

        return stringRetorno;
    }
}
