package tiger.api.test.data;

import java.text.SimpleDateFormat;
import java.util.Date;

import com.github.javafaker.Faker;

public class DataGenerator {
	 public static String getEmail() {
	        Faker faker = new Faker();
	        return faker.name().firstName() + faker.name().lastName() + "@tekschool.com";
	    }

	    public static String getFirstName() {
	        Faker faker = new Faker();
	        return faker.name().firstName();
	    }

	    public static String getLastName() {
	        Faker faker = new Faker();
	        return faker.name().lastName();
	    }

	    public static String getDateOfBirth() {
	        Faker faker = new Faker();
	        Date date = faker.date().birthday();
	        SimpleDateFormat format = new SimpleDateFormat("YYYY-MM-DD");
	        return format.format(date);
	    }

	    public static String getStreet() {
	        Faker faker = new Faker();
	        return faker.address().streetAddress();
	    }

	    public static String getCity() {
	        Faker faker = new Faker();
	        return faker.address().city();
	    }

	    public static String getState() {
	        Faker faker = new Faker();
	        return faker.address().state();
	    }

	    public static String getZipCode() {
	        Faker faker = new Faker();
	        return faker.address().zipCode();
	    }

	    public static String getCountry() {
	        Faker faker = new Faker();
	        return faker.address().country();
	    }

	    public static String getCountryCode() {
	        Faker faker = new Faker();
	        return faker.address().countryCode();
	    }

	    public static String getPhoneNumber() {
	        Faker faker = new Faker();
	        return faker.phoneNumber().phoneNumber();
	    }

	    public static String getPhoneExtension() {
	        Faker faker = new Faker();
	        return faker.phoneNumber().extension();

	    }
	    public static void PrintThis(){

	    	System.out.println("Shoaib");

	    	}
}
