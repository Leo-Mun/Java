package Exercise;

public class FinalStatic {
	public static final String KOOKMIN_UNIV_OFFICIAL_NAME = "Kookmin University";   
	public static final String KMU_ADDRESS = "Jeonnung Ro 77, Seongbuk Gu, Seoul. South Korea";
	private final String birthNation = "Korea";
	private final String birthYear; // final ���� �ʱ�ȭ ���ϸ� Constructor ���� �ʱ�ȭ �ؾ���
	private String name;
	
	public FinalStatic(String birthYear, String name){
		this.birthYear = birthYear;
		this.name = name;
	}
	
	public void setBirthYear(String birthYear){
		// this.birthYear = birthYear;
	}
	
}
