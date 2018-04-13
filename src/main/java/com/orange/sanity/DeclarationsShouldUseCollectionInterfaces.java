package com.orange.sanity;

import java.util.HashSet;

import org.apache.commons.collections4.CollectionUtils;

import java.util.Set;
public class DeclarationsShouldUseCollectionInterfaces {

	// Noncompliant - "employees" should have type "Set" rather than "HashSet"
	private 	Set<String> employees = new HashSet<String>();

	// Noncompliant
	public static HashSet<String> getEmployees() {
		return new HashSet();
	}

	public static void testDeclarationsShouldUseCollectionInterfaces() {
		{

		}
		System.out.println();

	}
}
