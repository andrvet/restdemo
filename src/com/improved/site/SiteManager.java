package com.improved.site;

import java.util.HashMap;

public class SiteManager implements ISiteManager {

	// citiesMap; key - unique identifier of a city (upper-cased city name for
	// example); value - city object
	private HashMap<String, Site> citiesMap = new HashMap<String, Site>();

	// distanceMap; key - inique identifier of a pair of cities (concatination
	// of two city keys for example); value - distance between the two cities
	private HashMap<String, Integer> distanceMap = new HashMap<String, Integer>();

	private String key;

	// private DistanceMap distanceMap = new DistanceMap();

	public void add(Site aCity, Site bCity, Integer distance) {

		// if two cities are same, no need to add them to the citiesMap
		if (aCity.getKey().compareToIgnoreCase(bCity.getKey()) == 0) {
			return;
		}

		citiesMap.put(aCity.getKey(), aCity);
		citiesMap.put(bCity.getKey(), bCity);

		key = createKey(aCity.getKey(), bCity.getKey());
		distanceMap.put(key, distance);
	}

	private String createKey(String aCity, String bCity) {
		return (aCity.toUpperCase().compareTo(bCity.toUpperCase()) > 0 ? aCity.toUpperCase() + bCity.toUpperCase() : bCity.toUpperCase() + aCity.toUpperCase());
	}

	public Integer getDistance(Site aCity, Site bCity) throws DistanceNotExistException {
		key = createKey(aCity.getKey(), bCity.getKey());
		return distanceMap.get(key);
	}
}
