package AbstractionProgramming;

abstract class DeshpandeClass{

    void test(){
        System.out.println(" A classic novel about a shepherd boy who embarks on a journey to fulfill his dreams. ");
    }

}

class TheAlchemist extends DeshpandeClass {
    void show(){

    }
}

public class BookClass {
    public static void main(String[] args){
        TheAlchemist t = new TheAlchemist();
        t.test();
    }
}
