public class BirdWatcher{

    //Atributo da classe. private garante que apenas outras classes deste documento possam acessar;
    private int[] birdPerDay;

    //Construtor, aparentemente o contrutor é automaticamente setado quando um método tem o mesmo nome que a classe;
    //Nesse caso ele serve para dar um valor ao atributo da classe;
    public BirdWatcher(int[] birdPerDay){
        this.birdPerDay = birdPerDay;
    }
        //Utiliza do atributo da classe
        int[] getLastWeek(){
            return birdPerDay;
        }

        //Utiliza array.lenght (não confundir com .lenght()) para pegar o tamanho total da array. -1 corrige a posição já que a primeira posição é 0;
        int getToday(){
            return birdPerDay[birdPerDay.length - 1];
        }

        public void incrementTodaysCount(){
            birdPerDay[birdPerDay.length - 1]++;
        }

        //Utiliza um for() para rodar por toda a array, esta forma simplificada funciona com arrays;
        //Na verdade é um for each
        boolean hasDayWithoutBirds(){
            for(int i: birdPerDay){
                if(i == 0){
                    return true;
                }
            }                
            return false;            
        }

        //Funcionalidade similar ao anterior porém com a forma mais conhecida do for();
        int getCountForFirstDays(int days){
            int birdsToThisDay = 0;
            for(int i = 0; i < days; i++){
                birdsToThisDay = birdsToThisDay + birdPerDay[i];
            }
            return birdsToThisDay;
        }

        int getBusyDays(){
            int busyDays = 0;
            for(int i = 0; i < birdPerDay.length; i++){
                if(birdPerDay[i-1] >= 5){
                    busyDays++;
                }
            }
            return busyDays;
        }
}

//Criação de objeto, o new BirdWatcher() se refere ao método de mesmo nome que a classe para setar atributos;
int[] birdPerDay = {0, 2, 5, 3, 7, 8, 4};
BirdWatcher birdcount = new BirdWatcher(birdPerDay);