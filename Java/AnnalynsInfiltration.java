public class AnnalynsInfiltration {

    public static void main(String[] args){
         System.out.println("Você é Annalyn, uma jovem e corajosa garota.");
         System.out.println("Em um dia comum você estava colhendo frutas na floresta na compania de seu melhor amigo Bellamy e seu leal cachorro sem perceber o rápido aproximar do por do Sol.");
         System.out.println("Antes de um de vocês sugerirem achar o cão e retornar você vê uma flecha acertar Bellamy na cabeça, a flecha não tinha uma ponta mas um frágil saco que se espatifou. Liberando um pó rosa pelo rosto de Bellamy.");
         System.out.println("'Pó do sono' você pensa antes de outra flecha passar pelo lado de sua cabeça acertando a árvore atrás de você. Nesse meio tempo Bellamy cai no chão, nocauteado.");
         System.out.println("Uma voz feminina soa ao lado, vindo de um arbusto relativamente distante: 'Errei. Mas é o bastante para derruba-la.'");
         System.out.println("Duas pessoas se mostram, saindo dos arbustos que escondiam suas presenças. O primeiro trajado da cabeça aos pés com roupas de couro tinjidas de verde, escondendo tudo menos os olhos.");
         System.out.println("O arco em suas mãos revela que essa pessoa é a dona da voz e a responsável por isso tudo. Você cai de joelhos tentando manter a consciência enquanto a arqueira anda em direção a Bellamy e o outro atacante vem na sua.");
         System.out.println("Este não tem como ser descrito como nada além de um cavaleiro, com uma longa espada em mãos e completamente trajado em uma armadura metálica, sendo um milagre que ele sequer consiga se mover.");
         System.out.println("'Ande! Pegua a garota! O rapaz já está aqui.' Diz a arqueira enquanto termina de pôr Bellamy sobre os ombros como um saco de farinha. O cavaleiro acena com a cabeça e se aproxima  de você enquanto guarda a espada.");
         System.out.println("Nesse momento seu cão surge de trás de você, posicionando-se entre você e o cavaleiro e latindo para ameaça-lo.");
         System.out.println("O cavaleiro, surpreso, salta para trás mas perde o equilíbrio e cai de costas no chão, se afastando do cão como se ele fosse um monstro.");
         System.out.println("A arqueira se vira e vê a confusão e diz num tom irritado.'Tolo! Não consegue lidar com um simples vira-lata? Se não fosse esse garoto eu mesmo lidaria com ele. Vamos! Antes que os latidos dele atraiam outros!'");
         System.out.println(" Você cai no chão, sua consiência sumindo, sua última visão é a de ambos os atacantes adrentrando fundo na floresta com seu amigo em mãos.");
         System.out.println("\nVocê acorda com as lambidas de seu cachorro no seu rosto. Você não sabe quanto tempo se passou, mas é noite");
    }
    public class Interactions {
        //Determina se um ataque rápido é possível. Cavaleiro deve estar dormindo
        public static boolean canFastAttack(boolean knightSleep){
            return knightSleep;
        }

        //Determina se espionar é possível. Pelo menos um deve estar acordado
        public static boolean canSpy(boolean knightSleep, boolean archerSleep, boolean prisionerSleep){
            return !knightSleep || !archerSleep || !prisionerSleep;
        }

        //Determina se o prisioneiro pode ser avisado. Requer que o arqueiro esteja dormindo e que o prisioneiro esteja acordado
        public static boolean canSignal(boolean archerSleep, boolean prisionerSleep){
            return archerSleep && !prisionerSleep;
        }

        //Determina se o prisineiro pode ser libertado. Existem duas formas de resolver:
        //1- Cachorro presente e arqueiro dormindo. 2- Cavaleiro e arqueiro dormindo e prisioneiro acordado
        public static boolean canFreePrisioner(boolean knightSleep, boolean archerSleep, boolean prisionerSleep, boolean hasDog){
            return archerSleep && hasDog || knightSleep && archerSleep && !prisionerSleep;
        }
    }
    
}
