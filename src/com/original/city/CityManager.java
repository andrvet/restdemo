package com.original.city;

import java.util.HashMap;

/**
 * @author Andrey Vetusko
 *
 */
public class CityManager implements ICityManager {

	//private HashMap<String, City> mCities = new HashMap<String, City>();
	private CityDistance mDist = new CityDistance();
	/**
	 * 
	 */
	public CityManager() {
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see citydistance.com.ICityManager#add(citydistance.com.City,
	 * citydistance.com.City, java.lang.Integer)
	 */
	public void add(final City fCity, final City sCity, Integer distance) {

		if (fCity.getKey().compareToIgnoreCase(sCity.getKey()) == 0) {
			return;
		}

		//mCities.put(fCity.getKey(), fCity);
		//mCities.put(sCity.getKey(), sCity);
		mDist.add(fCity.getKey(), sCity.getKey(), distance);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see citydistance.com.ICityManager#get(java.lang.String,
	 * java.lang.String)
	 */
	public Integer get(final String fCity, final String sCity) throws DistanceNotExistException {
		return mDist.get(fCity, sCity);
	}
}
