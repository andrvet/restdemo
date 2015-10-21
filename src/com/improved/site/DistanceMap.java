package com.improved.site;

import java.util.HashMap;

public class DistanceMap {

	/*
	 * key - concatination of two city names; value - distance between the two
	 * cities
	 */
	private HashMap<String, Integer> distancesMap = new HashMap<String, Integer>();

	public void add(String aCity, String bCity, Integer distance) {
		String key = createKey(aCity, bCity);
		distancesMap.put(key, distance);
	}

	public Integer getDistance(String aCity, String bCity) throws DistanceNotExistException {
		String key = createKey(aCity, bCity);
		// get value (distance between two cities) by key (two cities) from the
		// map
		Integer distance = distancesMap.get(key);
		if (distance == null) {
			throw new DistanceNotExistException();
		}
		return distance;
	}
	/*
	 * creates a key for distanceMap. upper-cased city names are compared
	 * lexicographically. if fromCity is lexigraphically greater than toCity
	 * then the key is fromCity+toCity if fromCity is lexigraphically less than
	 * toCity then the key is toCity+fromCity A.compareTo(B)>0 <=> A>B
	 * A.compareTo(B)<0 <=> A<B So a key for a pair of cities will be
	 * (greaterCity+smallerCity)
	 */
	private String createKey(String aCity, String bCity) {

		return (aCity.toUpperCase().compareTo(bCity.toUpperCase()) > 0 ? aCity.toUpperCase() + bCity.toUpperCase() : bCity.toUpperCase() + aCity.toUpperCase());
	}

}
