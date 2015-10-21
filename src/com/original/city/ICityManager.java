package com.original.city;

public interface ICityManager {

	public void add(final City fCity, final City sCity, Integer distance);

	public Integer get(final String fCity, final String sCity) throws DistanceNotExistException;

}
