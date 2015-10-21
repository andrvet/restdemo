package com.original.city;

/**
 * @author Andrey Vetusko
 *
 */
public class CityDistanceTest {

	/**
	 * 
	 */
	public CityDistanceTest() {
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		final CityManager citymng = new CityManager();
		final City sfo = new City("San Francisco");
		final City la = new City("Los Angeles");

		citymng.add(sfo, la, 650);

		try {
			final Integer dist1 = citymng.get(sfo.getName(), la.getName());
			System.out.println(dist1);
			
			final Integer dist2 = citymng.get(la.getName(), sfo.getName());
			System.out.println(dist2);
			
			final Integer dist3 = citymng.get("Chicago", sfo.getName());
			System.out.println(dist3);
			
		} catch (DistanceNotExistException e) {
			System.out.println("Not found");
		}

	}

}
