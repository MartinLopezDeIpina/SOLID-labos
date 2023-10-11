package labsolid.ejer3;

public abstract class ProjectFile {
	
	protected String filePath;
	
	public ProjectFile(String path) {
		this.filePath = path;
	}
	
	public void loadFile() {
		System.out.println("file loaded from " + filePath);
	}
	
	public abstract void storeFile();

}
