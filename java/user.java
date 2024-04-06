class User extends Account {
    public User(String name,String document,String email,String password){
        super(name, document,email,password );
    }
    void printDataUser(){
        System.out.println("Docuement dirve:" + document + " Name drive:" + name + " E-mail:"
        + email + "Password:"+ password);
    }
}