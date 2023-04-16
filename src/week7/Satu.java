package week7;

class Satu{
    //constructor default atau tanpa parameter
    Satu(){
        System.out.println("Satu.........");
    }
}

class Dua extends Satu{
    //constructor default atau tanpa parameter
    Dua(){
        System.out.println("Dua...........");
    }
}

class Tiga extends Dua{
    //constructor default atau tanpa parameter
    Tiga(){
        System.out.println("Tiga..........");
    }
}

class Empat extends Tiga{
    //constructor default atau tanpa parameter
    Empat(){
        System.out.println("Empat.........");
    }
}

// public class TestTurunan{
//     public static void main(String[] args){
//         new Empat();
//     }
// }