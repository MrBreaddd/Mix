public class Lasagna {
        
    public int tempoAssar(){
        return 40;
    }
    
    public int tempoRestante(int min){
        int t = tempoAssar() - min;
        return t;
    }

    public int tempoPreparo(int camadas){
    return 2 * camadas;
    }

    public int tempoPassado(int camadas, int min){
        return tempoPreparo(camadas) + min;
    }    
    
    public static void main(String[] args) {
        Lasagna lasagna = new Lasagna();
        System.out.println(lasagna.tempoAssar() + " min");
        System.out.println(lasagna.tempoRestante(20) + " min");
        System.out.println(lasagna.tempoPassado(6, 20) + " min");
    }
}
