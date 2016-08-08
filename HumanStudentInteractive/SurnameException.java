package murza.maksym;

public class SurnameException extends IllegalArgumentException{

	/**
 * it was proposed by IDE - need for explains by lecturer
 */
private static final long serialVersionUID = 1L;

	@Override
public String toString() {
	return "surname should contain only the characters";
}

}