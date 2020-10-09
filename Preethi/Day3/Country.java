
//Country class create member variables
public class Country{
		private Integer countryId;
		private String CountryName;
		
		public Integer getCountryId() {
			return countryId;
		}
		public void setCountryId(Integer countryId) {
			this.countryId = countryId;
		}
		public String getCountryName() {
			return CountryName;
		}
		public void setCountryName(String countryName) {
			this.CountryName = countryName;
		}
	    
		public Country ( int i , String countryName){
			super();
			this.countryId = i;
			CountryName = countryName;
		}
		@Override
		public String toString(){
			
			return "Country [countryId=" +countryId + ", CountryName= " + CountryName + "]";
		}
	}

