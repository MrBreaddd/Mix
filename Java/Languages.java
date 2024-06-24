import java.util.ArrayList;
import java.util.List;

public class Languages{

    //Forma de criar lista
    private final List<String> LanguagesToLearn = new ArrayList<>();


    boolean isEmpty(){
        return this.LanguagesToLearn.isEmpty();
    }

    void addLanguage(String AddLanguage){
        LanguagesToLearn.add(AddLanguage);
    }

    void removeLanguage(String RemoveLanguage){
        LanguagesToLearn.remove(RemoveLanguage);
    }

    //Naõ há condição de checagem ou seja se o método for utilizado enquanto a lista estiver vazia consequências desconhecidas irão ocorrer;
    String firstLanguage(){
        return LanguagesToLearn.get(0);
    }

    int count(){
        return LanguagesToLearn.size();
    }

    boolean containsLanguage(String IsLanguage){
        return this.LanguagesToLearn.contains(IsLanguage);
    }

    boolean isExciting(){
        return this.containsLanguage("Java") || this.containsLanguage("Kotlin");
    }
}
