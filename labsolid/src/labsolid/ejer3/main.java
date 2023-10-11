package labsolid.ejer3;

class main {

	public static void main(String[] args) {
		
		Project project = new Project();
		
		project.addProject(new ReadWriteProyectFile("/home/file1"));
		project.addProject(new ReadWriteProyectFile("/home/file2"));
		
		project.addProject(new ReadOnlyProjectFile("home/file3"));
		project.addProject(new ReadOnlyProjectFile("/home/file4"));
		
		project.loadAllFiles();
		project.storeAllFiles();
		
	}

}
