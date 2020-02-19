package com.hcl.ex2;

import java.io.File;
import java.io.FileFilter;

public class JavaFileFilter implements FileFilter {

	@Override
	public boolean accept(File file) {
		// TODO Auto-generated method stub
		return file.getName().endsWith(".java");
	}

}
