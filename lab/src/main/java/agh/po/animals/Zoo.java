package agh.po.animals;


import java.util.Random;

public class Zoo {
        Animal[] animals = new Animal[100];
        public void randomZoo(){
            Random random = new Random();
            for (int i = 0; i < animals.length; i++) {
                int j = random.nextInt(3);
                switch (j) {
                    case 0:
                        animals[i] = new Dog("pies  " + i);
                        break;
                    case 1:
                        animals[i] = new Parrot("papuga  " + i);
                        break;
                    case 2:
                        animals[i] = new Snake("wąż " + i);
                        break;
                }
            }
        }
        public int sumLegs(){
            int legsum = 0;
            for(Animal animal : animals){
                if (animal!=null){
                    legsum+=animal.getLegs();
                }
            }
            return legsum;
        }
        public static void main(String[]args){
            Zoo firstZoo = new Zoo();
            firstZoo.randomZoo();
            System.out.println("Liczba nóg w zoo: " + firstZoo.sumLegs());
        }

}
