public class SmartTv{
    
    //criando atributos:
    boolean ligada = false;
    int canal = 1;
    int volume = 25;
 
    //metodos
    
    public void ligar(){
    ligada = true; 
    }

    public void desligar(){
        ligada = false;
    }

    //aumentar volume
    public void aumentarVolume(){
        volume++; //volume = volume +1;
        System.out.println("Aumentando o volume para " + volume);
    }

    public void diminuirVolume(){
        volume--;
        System.out.println("Diminuindo o volume para " + volume);
    }    

    public void aumentarCanal(){
        canal++;
    }

    public void diminuirCanal(){
        canal--;
    }

    public void mudarCanal(int novoCanal){
        canal = novoCanal;
    }
}