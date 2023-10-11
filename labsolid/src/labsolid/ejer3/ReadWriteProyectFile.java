package labsolid.ejer3;

public class ReadWriteProyectFile extends ProjectFile{
	
	
	public ReadWriteProyectFile(String filePath) {
		super(filePath);
	}
	

	@Override
	public void storeFile() {
		System.out.println("file saved to " + filePath);
	}
}
