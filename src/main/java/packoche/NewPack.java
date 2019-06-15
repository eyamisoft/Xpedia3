package packoche;

public class NewPack {

    String height;
    int length;
    String name;
    int page;

    public NewPack(String height, int length) {
        this.height=height;
        this.length=length;
    }

    public NewPack(String l){
        this(l,9);
        System.out.println(l+length);
    }

    public void stu(String name){
        this.name=name;
        System.out.println("this a name: "+name);
    }

    public static void main(String[] args) {

        new NewPack("lengthy");

        NewPack obj = new NewPack("Legalize");
    }
}
