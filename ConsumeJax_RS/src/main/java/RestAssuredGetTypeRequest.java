import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
import com.jayway.restassured.RestAssured;
import com.jayway.restassured.response.Response;

public class RestAssuredGetTypeRequest {
	public static void main(String[] args) {
		Response resp = RestAssured.get("http://services.groupkt.com/country/get/all");
		System.out.println(resp.toString());
		// Fetching response in JSON
		JSONObject jsonResponse = new JSONObject(resp.asString());
		JSONArray jsonArray = new JSONArray(
				new JSONObject(jsonResponse.get("RestResponse").toString()).get("result").toString());
		List<Country> listOfCountries = new ArrayList<Country>();
		//Country country = null;
		for (Object object : jsonArray) {
			Country country = new Country();
			JSONObject json = new JSONObject(object.toString());
			country.setCountryName(json.get("name").toString());
			country.setCountryCode1(json.get("alpha2_code").toString());
			country.setCountryCode2(json.get("alpha3_code").toString());
			listOfCountries.add(country);
		}
		System.out.println("here is your country list --" + listOfCountries);
		/**
		 * 
		 * TYPE -GET - URL (MAY CONTRAIN DATA) -- HEADER -- TYPE -POST - URL --
		 * HEADER - BODY
		 */
	}
}
