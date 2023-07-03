import java.sql.SQLOutput;

public class Add_book {
    String Name;
    int Editorial;
    String Autor;
    int Ano;
    String Genero;

    public Add_book(String Name, int Editorial, String Autor, int Ano){
        this.Name = Name;
        this.Editorial = Editorial;
        this.Autor= Autor;
        this.Ano = Ano;
        System.out.println("Name: " +Name + " Editorial: " + Editorial +" Autor: " + Autor + " Year: " + Ano);
    }

    public void add(){
        System.out.println("Name: " +Name + " Editorial: " + Editorial +" Autor: " + Autor + " Year: " + Ano);
    }
}
