import java.util.ArrayList;

public class PhoneBook {
    private ArrayList<Contact> pBook = new ArrayList<>();

    public void addPBook(Contact p1){
        pBook.add(p1);
        System.out.println("=> Da them lien he.");
    }

    public void showPBook(){
        if(pBook.isEmpty()){
            System.out.println("Danh sach trong! ");
        }
        else {
            System.out.println("-----DANH SACH LIEN HE-----");
            for (Contact c : pBook) {
                c.display();
            }
        }
    }

    public void searchPBook(String name){
        boolean f = false;
        for(Contact c : pBook){
            if( c.getName().equals(name)){
                c.display();
                f = true;
            }
        }
        if(!f){
            System.out.println("Khong tim thay lien he.");
        }
    }
}
