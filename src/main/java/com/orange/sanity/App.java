package com.orange.sanity;

/**
 * Hello world!
 *
 */
public class App {
	public static void main() {
		System.out.println("Hello World!");
		CollapsibleIfStatements collapsibleIfStatements = new CollapsibleIfStatements();
		collapsibleIfStatements.collapse();
	
		DeclarationsShouldUseCollectionInterfaces.testDeclarationsShouldUseCollectionInterfaces();
		System.out.println("Hello World!");
	}
}
