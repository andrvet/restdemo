package com.original.city;

import java.util.HashMap;

/**
 * @author Andrey Vetusko
 *
 */
public class CityDistance {

	private HashMap<String, Integer> mDistances = new HashMap<String, Integer>();

	public CityDistance() {

	}

	public void add(final String fCity, final String sCity, Integer distance) {
		final String key = keyPrepare(fCity, sCity);
		mDistances.put(key, distance);
	}

	public final Integer get(final String fCity, final String sCity) throws DistanceNotExistException {

		final String key = keyPrepare(fCity, sCity);

		final Integer distance = mDistances.get(key);
		if (distance == null) {
			throw new DistanceNotExistException();
		}

		return distance;
	}

	private final String keyPrepare(final String fCity, final String sCity) {
		return (fCity.toUpperCase().compareTo(sCity.toUpperCase()) > 0 ? fCity.toUpperCase() + sCity.toUpperCase() : sCity.toUpperCase() + fCity.toUpperCase());
	}

}
