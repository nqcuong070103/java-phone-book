import java.util.ArrayList;

public class PhoneBook {
    private ArrayList<Contact> pBook = new ArrayList<>();

    public void addPBook(Contact p1){
        pBook.add(p1);
        System.out.println("=> Da them lien he.");
    }

    public void showPBook(){
        for(Contact c : pBook){
            c.display();
        }
    }

    public void searchPBook(String name){
        for(Contact c : pBook){
            if( c.getName().equals(name)){
                c.display();
            }
        }
    }
}
