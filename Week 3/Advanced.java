public class Advanced {
    public static void main(String[] args){
        String name = "Mike";
        int pass = 12345;
        boolean accLocked = false;

        if(name == "Mike"){
            if(pass == 12345){
                if(accLocked){
                }
                else System.out.println("LOCKED, Can't access account");
            }
            else System.out.println("Invalid Password");
        }
        else System.out.println("Invalid Username");

        /*
        Name is not the same name
            - prints Invalid username

        password is not the same password
            - prints Invalid password

        Account is locked
            - prints LOCKED, Can't access amount
        */


    }
}
