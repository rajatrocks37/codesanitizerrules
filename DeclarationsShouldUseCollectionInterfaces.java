import java.util.HashSet;

public class DeclarationsShouldUseCollectionInterfaces {

	private HashSet<String> employees = new HashSet<String>();  // Noncompliant - "employees" should have type "Set" rather than "HashSet"

	public HashSet<String> getEmployees() {                       // Noncompliant
		return new HashSet();
	}
	
	public void testDeclarationsShouldUseCollectionInterfaces(){

	}
}
