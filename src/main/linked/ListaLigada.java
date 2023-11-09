package linked;

import list.EstruturaElementar;

public class ListaLigada implements EstruturaElementar{

    private No cabeca;

    public ListaLigada() {

    }

    @Override
    public boolean buscaElemento(int valor) {
        No procura = cabeca;
        while(procura != null){
            if(procura.getValor() == valor){
             return true;
            }   
         No no3 = procura.getProximo();
        

        }
         return false;
       
    }

    @Override
    public int buscaIndice(int valor) {
        No novo = this.cabeca;
        int ind = 0;
        while( novo != null){
           if(novo.getValor() == valor){
             return ind;
           }
        novo = novo.getProximo();
        ind++;
        }
        return 0;
        
    }

    @Override
    public int minimo() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'minimo'");
    }

    @Override
    public int maximo() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'maximo'");
    }

    @Override
    public int predecessor(int valor) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'predecessor'");
    }

    @Override
    public int sucessor(int valor) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'sucessor'");
    }

    @Override
    public void insereElemento(int valor) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'insereElemento'");
    }

    @Override
    public void insereElementoPosicao(int valor, int buscaIndice) {
        
        throw new UnsupportedOperationException("Unimplemented method 'insereElementoPosicao'");
    }

    @Override
    public void insereInicio(int valor) {
        if (this.cabeca == null){
            this.cabeca = new No(valor);    
        }
        else{
            No n = new No(valor);
            n.setProximo(this.cabeca);
            this.cabeca = n;
        }
        
    }

    @Override
    public void insereFim(int valor) {
        No no1 = new No(valor);
        if (this.cabeca == null){
            this.cabeca = no1;
        }
        else{
            No no2 = this.cabeca;
            while(no2.getProximo()!= null){
                no2 = no2.getProximo();
            }
            no2.setProximo(no1); 
         
            
        }
        


    }

    @Override
    public void remove(int valor) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'remove'");
    }

    @Override
    public void removeIndice(int indice) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'removeIndice'");
    }

    @Override
    public void removeInicio() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'removeInicio'");
    }

    @Override
    public void removeFim() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'removeFim'");
    }
    
}
