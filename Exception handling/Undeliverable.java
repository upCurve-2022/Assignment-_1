//custom exxception
public class Undeliverable extends Exception{
    Undeliverable(String error){
        super(error);
    }
}
