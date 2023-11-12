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
         procura = procura.getProximo();
        

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
        No at = this.cabeca;
        int min = at.getValor();
        while(at != null){
           min = Math.min(min, at.getValor());
           at = at.getProximo();
        }
        return min;
    }

    @Override
    public int maximo() {
       No at = this.cabeca;
       int max = at.getValor();
       while (at != null){
        max  = Math.max(max, at.getValor());
        at = at.getProximo();
       }
       return max;
    }

    @Override
    public int predecessor(int valor) {
        throw new UnsupportedOperationException("Unimplemented method 'predecessor'");
       

    }

    @Override
    public int sucessor(int valor) {
        throw new UnsupportedOperationException("Unimplemented method 'sucessor'");
            
    } 


    @Override
    public void insereElemento(int valor) {
        No novo = new No(valor);
        if(this.cabeca == null){
            this.cabeca = novo;
        }
        else{
            No at = this.cabeca;
            while(at.getProximo() != null){
                at = at.getProximo();
            }
            at.setProximo(novo);
        }
    }

    @Override
    public void insereElementoPosicao(int valor, int buscaIndice) {
        
        No posicao = new No(valor);
        if(buscaIndice == 0){
            posicao.setProximo(this.cabeca);
            this.cabeca = posicao;
            return;
        }

        No percorre = this.cabeca;
        for (int i = 0; i < buscaIndice - 1 && percorre != null; i++){
            percorre = percorre.getProximo();
        }
        posicao.getProximo();
        percorre = posicao;

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

       if (this.cabeca.getValor() == (valor)){
           this.cabeca = this.cabeca.getProximo();
           return;
       }

       No at = this.cabeca;
       No predecessor = null;

       while(at != null && at.getValor()!= valor){
         predecessor = at;
         at = at.getProximo();
       }
       if (at == null){
         predecessor.setProximo(at.getProximo());
       }
       
    }

    @Override
    public void removeIndice(int indice) {
       if(indice == 0){
        this.cabeca = this.cabeca.getProximo();
        return;
       }

       No at = this.cabeca;
       No predecessor = null;
       int ind = 0;

       while(at != null && ind < indice){
        predecessor = at;
        at = at.getProximo();
        ind++;
       }
       if(at != null){
        predecessor.setProximo(at.getProximo());
       }
       
    }

    @Override
    public void removeInicio() {
       if(this.cabeca != null){
        this.cabeca = this.cabeca.getProximo();
       }
    }

    @Override
    public void removeFim() {
        if(this.cabeca == null || this.cabeca.getProximo() == null){
        this.cabeca = null;
        return;
       }
       No at = this.cabeca;
       No predecessor = null;
       while(at.getProximo() != null){
        predecessor = at;
        at = at.getProximo();
       }
       predecessor.setProximo(null);
    }
    
}
