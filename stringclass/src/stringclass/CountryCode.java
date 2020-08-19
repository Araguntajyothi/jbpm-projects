package stringclass;
public final class CountryCode {
    private final String countryName;
    private final String countryCode;
    private final String ISOCode;
		
    public String getCountryName() 
     {
		return countryName;
      }
	public String getCountryCode() 
          {
		return countryCode;
	}

	public String getISOCode() 
         {
		return ISOCode;
	}

public CountryCode(String countryName, String countryCode, String ISOCode)
         {
    	       this.countryName  = countryName;
    	       this.countryCode = countryCode;
    	       this.ISOCode = ISOCode;
         }
    
	public static void main(String[] args) 
	{
	
		CountryCode cc = new CountryCode("India","+91","IN/IND");
		System.out.println("Country Name IS "+cc.getCountryName());
		System.out.println("Country Code Is "+cc.getCountryCode());
		System.out.println("ISO Code Is "+cc.getISOCode());
	}
}

