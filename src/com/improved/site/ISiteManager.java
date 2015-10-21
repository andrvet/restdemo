package com.improved.site;

public interface ISiteManager {

	public void add(Site aCity, Site bCity, Integer distance);

	public Integer getDistance(Site cCity, Site bCity) throws DistanceNotExistException;

}
