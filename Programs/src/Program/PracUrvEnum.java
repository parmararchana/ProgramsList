package Program;

enum Archana {

	/*
	 * private String aName;
	 * 
	 * public String getaName() { return aName; }
	 * 
	 * public void setaName(String aName) { this.aName = aName; }
	 */

	ARCHANA; // public static final archana = new archana ();
}

public class PracUrvEnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		  Simpton obj = new Simpton();// obj.setSname("ARCHANA");
		 
		/*
		 * Archana aobj = new Archana(); aobj.setaName("ARCHANA");
		 */

		// System.out.println(obj.getSname().equals(aobj.getaName()));

//		System.out.println(Archana.ARCHANA.name());
		System.out.println(Archana.ARCHANA.name().equals(obj.getSname()));

	}

}

class Simpton {

	private String Sname;

	public String getSname() {
		return Sname;
	}

	public void setSname(String sname) {
		Sname = sname;
	}

	// ARCHANA, URVESH;

}
