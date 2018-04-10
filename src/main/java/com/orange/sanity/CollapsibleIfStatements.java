package com.orange.sanity;

import java.io.File;

public class CollapsibleIfStatements {

	public void collapse() {
		File file = new File(".");
		if (file != null && (file.isFile() || file.isDirectory())) {}
		System.out.println("Collapse!");
	}
}
