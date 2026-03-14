public class Contact {
    private String name;
    private String phoneNum;

    public Contact(String name, String phoneNum){
        this.name = name;
        this.phoneNum = phoneNum;
    }

    public String getName(){ return name;}
    public String getPhoneNum(){ return phoneNum;}

    public void setName(String name1){ this.name = name1;}
    public void setPhoneNum(String phoneNum1){this.phoneNum = phoneNum1;}

    public void display(){
        System.out.println("Ten lien lac: " + this.getName());
        System.out.println("So dien thoai: " + this.getPhoneNum());
    }
}