package labsolid.ejer3;

public class ReadOnlyProjectFile extends ReadWriteProyectFile {
	
	public ReadOnlyProjectFile(String filePath) {
		
		super(filePath);
		
	}
	
	@Override
	public void storeFile() {
		
		System.out.println("ERROR, can not be Saved");
		
		}
}
