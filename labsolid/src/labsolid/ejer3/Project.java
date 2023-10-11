package labsolid.ejer3;

import java.util.Vector;

public class Project {
	
	public Vector<ReadWriteProyectFile> files = new Vector<ReadWriteProyectFile>();
	
	public void addProject(ReadWriteProyectFile p) {
		files.add(p);
	}
	
	public void loadAllFiles() {
		for (ReadWriteProyectFile f : files)
			f.loadFile();
	}
	
	public void storeAllFiles() {
		for (ReadWriteProyectFile f : files)
			f.storeFile();
	}

}
